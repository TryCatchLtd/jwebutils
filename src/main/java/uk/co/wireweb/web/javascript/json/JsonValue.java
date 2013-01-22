package uk.co.wireweb.web.javascript.json;

/**
 * JsonValue.
 *
 * @author Daniel Johansson
 * @since 9 Mar 2010
 */
public class JsonValue<T> {

    private final T value;

    private String escapeString(final String input) {
        final StringBuilder stringBuilder = new StringBuilder();

        if ((input != null) && (input.length() > 0)) {
            for (int i = 0; i < input.length(); ++i) {
                final char character = input.charAt(i);

                if ((i > 0) && ((character == '"') || (character == '\\')) && (input.charAt(i - 1) != '\\')) {
                    stringBuilder.append('\\');
                }

                stringBuilder.append(character);
            }
        }

        return stringBuilder.toString();
    }

    public JsonValue(final T value) {
        this.value = value;
    }

    /**
     * This method is used to get the raw value, no extra parsing is done to make sure its Javascript safe. For safety use the toString method instead.
     *
     * @return the raw value.
     */
    public T getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        if (this.value != null) {
            if ((this.value instanceof String) || (this.value instanceof Character)) {
                return ("\"" + this.escapeString(String.valueOf(this.value)) + "\"");
            }

            return this.value.toString();
        }

        return null;
    }
}
