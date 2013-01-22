package uk.co.wireweb.web.javascript.json;

import java.util.ArrayList;
import java.util.List;

/**
 * JsonObject.
 *
 * @author Daniel Johansson
 * @since 8 Mar 2010
 */
public class JsonObject {

    private String name;
    private JsonObject parent;
    private List<JsonObject> children = new ArrayList<JsonObject>();
    private List<JsonKeyValuePair<?>> members = new ArrayList<JsonKeyValuePair<?>>();
    private List<JsonArray> arrays = new ArrayList<JsonArray>();

    public JsonObject() {
        this("");
    }

    public JsonObject(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JsonObject array(final JsonArray jsonArray) {
        if (jsonArray != null) {
            this.arrays.add(jsonArray);
        }

        return this;
    }

    public JsonObject getChild(final String key) {
        if (!this.children.isEmpty()) {
            for (final JsonObject jsonObject : this.children) {
                if (jsonObject.getName().equals(key)) {
                    return jsonObject;
                }
            }
        }

        return null;
    }

    public JsonObject child(final JsonObject jsonObject) {
        if (jsonObject != null) {
            jsonObject.parent = this;
            this.children.add(jsonObject);
        }

        return this;
    }

    public JsonKeyValuePair getMember(final String key) {
        if (!this.members.isEmpty()) {
            for (final JsonKeyValuePair jsonKeyValuePair : this.members) {
                if (jsonKeyValuePair.getKey().equals(key)) {
                    return jsonKeyValuePair;
                }
            }
        }

        return null;
    }

    public JsonObject member(final JsonKeyValuePair<?> jsonKeyValuePair) {
        if (jsonKeyValuePair != null) {
            this.members.add(jsonKeyValuePair);
        }

        return this;
    }

    public Integer getInt(final String key) {
        final JsonKeyValuePair jsonKeyValuePair = this.getMember(key);

        if (jsonKeyValuePair == null || !(jsonKeyValuePair.getValue() instanceof Integer)) {
            return null;
        }

        return (Integer) jsonKeyValuePair.getValue();
    }

    public JsonObject member(final String name, final Integer value) {
        return this.member(new JsonKeyValuePair<Integer>(name, value));
    }

    public JsonObject member(final String name, final String value) {
        return this.member(new JsonKeyValuePair<String>(name, value));
    }

    public JsonObject member(final String name, final Boolean value) {
        return this.member(new JsonKeyValuePair<Boolean>(name, value));
    }

    public JsonObject member(final String name, final Long value) {
        return this.member(new JsonKeyValuePair<Long>(name, value));
    }

    public JsonObject member(final String name, final Short value) {
        return this.member(new JsonKeyValuePair<Short>(name, value));
    }

    public JsonObject member(final String name, final Byte value) {
        return this.member(new JsonKeyValuePair<Byte>(name, value));
    }

    public JsonObject member(final String name, final Character value) {
        return this.member(new JsonKeyValuePair<Character>(name, value));
    }

    public JsonObject member(final String name, final Float value) {
        return this.member(new JsonKeyValuePair<Float>(name, value));
    }

    public JsonObject member(final String name, final Double value) {
        return this.member(new JsonKeyValuePair<Double>(name, value));
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();

        if (parent != null) {
            stringBuilder.append("\"");
            stringBuilder.append(this.name);
            stringBuilder.append("\" : ");
        }

        stringBuilder.append("{");

        if (!this.members.isEmpty()) {
            for (int i = 0; i < this.members.size(); ++i) {
                stringBuilder.append(this.members.get(i).toString());

                if (i < (this.members.size() - 1)) {
                    stringBuilder.append(",");
                }
            }
        }

        if (!this.members.isEmpty() && !this.children.isEmpty()) {
            stringBuilder.append(",");
        }

        if (!this.children.isEmpty()) {
            for (int i = 0; i < this.children.size(); ++i) {
                stringBuilder.append(this.children.get(i).toString());

                if (i < (this.children.size() - 1)) {
                    stringBuilder.append(",");
                }
            }
        }

        if ((!this.members.isEmpty() || !this.children.isEmpty()) && !this.arrays.isEmpty()) {
            stringBuilder.append(",");
        }

        if (!this.arrays.isEmpty()) {
            for (int i = 0; i < this.arrays.size(); ++i) {
                stringBuilder.append(this.arrays.get(i).toString());

                if (i < (this.arrays.size() - 1)) {
                    stringBuilder.append(",");
                }
            }
        }

        stringBuilder.append("}");

        return stringBuilder.toString();
    }

    public JsonObject getParent() {
        return parent;
    }

    public List<JsonObject> getChildren() {
        return children;
    }

    public List<JsonKeyValuePair<?>> getMembers() {
        return members;
    }

    public List<JsonArray> getArrays() {
        return arrays;
    }
}
