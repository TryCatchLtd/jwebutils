package uk.co.wireweb.web.javascript.json;

/**
 * JsonMember.
 *
 * @author Daniel Johansson
 * @since 8 Mar 2010
 */
public class JsonKeyValuePair<T> extends JsonValue<T> {

    private final String key;

    public JsonKeyValuePair(final String key, final T value) {
        super(value);
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("\"");
        stringBuilder.append(this.key);
        stringBuilder.append("\" : ");

        stringBuilder.append(super.toString());

        return stringBuilder.toString();
    }
}
