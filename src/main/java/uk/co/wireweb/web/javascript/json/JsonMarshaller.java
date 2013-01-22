package uk.co.wireweb.web.javascript.json;

import uk.co.wireweb.web.javascript.json.exception.JsonMarshallException;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * JsonMarshaller.
 *
 * @author Daniel Johansson
 * @since 9 Mar 2010
 */
public class JsonMarshaller<T> {

    private final Class<T> clazz;

    public JsonMarshaller(final Class<T> clazz) {
        this.clazz = clazz;
    }

    /**
     * This will marshall a Java object into a {@link JsonObject}. Any object members marked as transient will not be marshalled.
     *
     * @param object the java object to marshal.
     * @return {@link JsonObject} representing the Java object.
     * @throws JsonMarshallException
     */
    public synchronized JsonObject marshall(final Object object) throws JsonMarshallException {
        if (object == null) {
            throw new NullPointerException("object is null");
        }

        final JsonObject jsonObject = new JsonObject(object.getClass().getSimpleName());
        final Class<?> objectClass = object.getClass();
        final Field[] fields = objectClass.getDeclaredFields();

        if (fields != null) {
            for (final Field field : fields) {
                if (!Modifier.isTransient(field.getModifiers())) {
                    final String methodName = this.getPojoGetterName(field);

                    try {
                        final Method method = objectClass.getMethod(methodName);

                        if ((method != null) && Modifier.isPublic(method.getModifiers()) && method.getName().equals(methodName)) {
                            final Object value = method.invoke(object);

                            if (isPrimitiveOrWrapper(field)) {
                                jsonObject.member(new JsonKeyValuePair<Object>(field.getName(), value));
                            } else {
                                if (value != null) {
                                    final JsonObject childObject = this.marshall(value);
                                    childObject.setName(field.getName());
                                    jsonObject.child(childObject);
                                } else {
                                    jsonObject.member(new JsonKeyValuePair<Object>(field.getName(), null));
                                }
                            }
                        }
                    } catch (final SecurityException exception) {
                        throw new JsonMarshallException("SecurityException caught while trying to get method [" + methodName + "]", exception);
                    } catch (final NoSuchMethodException exception) {
                        throw new JsonMarshallException("NoSuchMethodException caught while trying to find method [" + methodName + "]", exception);
                    } catch (final IllegalArgumentException exception) {
                        throw new JsonMarshallException("IllegalArgumentException caught while trying to invoke method [" + methodName + "]", exception);
                    } catch (final IllegalAccessException exception) {
                        throw new JsonMarshallException("IllegalAccessException caught while trying to invoke method [" + methodName + "]", exception);
                    } catch (final InvocationTargetException exception) {
                        throw new JsonMarshallException("InvocationTargetException caught while trying to invoke method [" + methodName + "]", exception);
                    }
                }
            }
        }

        return jsonObject;
    }

    private boolean isPrimitiveOrWrapper(final Field field) {
        return (field.getType().toString().equals("double") || field.getType().toString().equals("float") || field.getType().toString().equals("byte") || field.getType().toString().equals("short") || field.getType().toString().equals("int") || field.getType().toString().equals("long") || field.getType().toString().equals("char") || field.getType().toString().equals("boolean") || field.getType().equals(String.class) || field.getType().equals(Boolean.class) || field.getType().equals(Long.class) || field.getType().equals(Integer.class) || field.getType().equals(Byte.class) || field.getType().equals(Short.class) || field.getType().equals(Double.class) || field.getType().equals(Float.class) || field.getType().equals(Character.class));
    }

    private synchronized JsonObject parseJson(final String json) {
        final JsonObject jsonObject = new JsonObject("root");
        int mode = 0;
        String key = "";
        String value = "";
        boolean stringValue = false;

        for (int i = 0; i < json.length(); ++i) {
            final char character = json.charAt(i);

            if (mode == 0) {
                if (character == '{') {
                    mode = 1;
                }
            } else if (mode == 1) {
                if (character == '"') {
                    mode = 2;
                }
            } else if (mode == 2) {
                if (character != '"') {
                    key = key.concat(String.valueOf(character));
                } else {
                    mode = 3;
                }
            } else if (mode == 3) {
                if (character == ':') {
                    mode = 4;
                }
            } else {
                value = value.concat(String.valueOf(character));

                if (!stringValue && value.trim().startsWith("\"")) {
                    stringValue = true;
                }

                if (stringValue) {
                    if ((value.length() > 2) && (character == '\"') && (json.charAt(i - 1) != '\\')) {
                        mode = 999;
                    }
                } else if ((character == '}') || (character == ',')) {
                    if (value.endsWith("}") || value.endsWith(",")) {
                        value = value.substring(0, value.length() - 1);
                    }

                    mode = 999;
                }
            }

            if (mode == 999) {
                value = value.trim();

                // Is this a string value?
                if (value.startsWith("\"") && value.endsWith("\"")) {
                    value = value.substring(1, value.length() - 1);
                    value = value.replaceAll("\\\\", "");
                    jsonObject.member(new JsonKeyValuePair<String>(key, value));
                } else if (value.startsWith("{")) {
                    value = value.concat("}");
                    final JsonObject childObject = this.parseJson(value);
                    childObject.setName(key);
                    jsonObject.child(childObject);
                } else if (value.equals("null")) {
                    jsonObject.member(new JsonKeyValuePair<Object>(key, null));
                } else {
                    if ("true".equalsIgnoreCase(value) || "false".equalsIgnoreCase(value)) {
                        jsonObject.member(new JsonKeyValuePair<Boolean>(key, Boolean.valueOf(value)));
                    } else if (this.isNumeric(value)) {
                        jsonObject.member(new JsonKeyValuePair<Integer>(key, Integer.valueOf(value)));
                    } else if (this.isNumber(value)) {
                        jsonObject.member(new JsonKeyValuePair<Float>(key, Float.valueOf(value)));
                    } else {
                        jsonObject.member(new JsonKeyValuePair<Object>(key, value));
                    }
                }

                key = "";
                value = "";
                stringValue = false;

                mode = 1;
            }
        }

        return jsonObject;
    }

    private synchronized boolean isNumeric(final String input) {
        for (int i = 0; i < input.length(); ++i) {
            if (!Character.isDigit(input.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    private synchronized boolean isNumber(final String input) {
        boolean decimalFound = false;

        for (int i = 0; i < input.length(); ++i) {
            if ((input.charAt(i) == '.') && !decimalFound) {
                decimalFound = true;
            } else if ((input.charAt(i) == '.') && decimalFound) {
                return false;
            }

            if (!Character.isDigit(input.charAt(i)) && (input.charAt(i) != '.')) {
                return false;
            }
        }

        return true;
    }

    private synchronized void parseObject(final Object object, final JsonObject jsonObject) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        if (!jsonObject.getMembers().isEmpty()) {
            for (final JsonKeyValuePair<?> jsonKeyValuePair : jsonObject.getMembers()) {
                for (final Method method : object.getClass().getMethods()) {
                    if (method.getName().equals(this.getPojoSetterName(jsonKeyValuePair.getKey()))) {
                        method.invoke(object, jsonKeyValuePair.getValue());
                    }
                }
            }
        }

        if (!jsonObject.getChildren().isEmpty()) {
            for (final JsonObject childObject : jsonObject.getChildren()) {
                for (final Method method : object.getClass().getMethods()) {
                    if (method.getName().equals(this.getPojoSetterName(childObject.getName())) && (method.getParameterTypes() != null) && (method.getParameterTypes().length == 1)) {
                        final Object child = method.getParameterTypes()[0].newInstance();
                        this.parseObject(child, childObject);

                        method.invoke(object, child);
                    }
                }
            }
        }
    }

    public synchronized T unmarshall(final String json) throws JsonMarshallException {
        if ((json == null) || (json.length() == 0)) {
            throw new JsonMarshallException("The JSON data is null or empty");
        }

        try {
            final T object = this.clazz.getConstructor().newInstance();
            final JsonObject jsonObject = this.parseJson(json);
            this.parseObject(object, jsonObject);

            return object;
        } catch (final NoSuchMethodException exception) {
            throw new JsonMarshallException("Could not find empty constructor for class [" + this.clazz.getName() + "]", exception);
        } catch (final IllegalArgumentException exception) {
            throw new JsonMarshallException(exception.getMessage(), exception);
        } catch (final SecurityException exception) {
            throw new JsonMarshallException(exception.getMessage(), exception);
        } catch (final InstantiationException exception) {
            throw new JsonMarshallException(exception.getMessage(), exception);
        } catch (final IllegalAccessException exception) {
            throw new JsonMarshallException(exception.getMessage(), exception);
        } catch (final InvocationTargetException exception) {
            throw new JsonMarshallException(exception.getMessage(), exception);
        }
    }

    private synchronized String getPojoGetterName(final Field field) {
        final String fieldName = Character.toUpperCase(field.getName().charAt(0)) + field.getName().substring(1);

        if (field.getType().toString().equals("boolean")) {
            return "is" + fieldName;
        }

        return "get" + fieldName;
    }

    private synchronized String getPojoSetterName(final String memberName) {
        return "set" + Character.toUpperCase(memberName.charAt(0)) + memberName.substring(1);
    }
}
