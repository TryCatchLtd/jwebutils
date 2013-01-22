package uk.co.wireweb.web.css;

import java.util.HashMap;
import java.util.Map;

/**
 * Css.
 *
 * @author Daniel Johansson
 * @since 8 Mar 2010
 */
@SuppressWarnings("unchecked")
public abstract class Css<T extends Css> {

    protected final Map<String, String> properties = new HashMap<String, String>();

    public T property(final String key, final String value) {
        this.properties.put(key, value);

        return (T) this;
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();

        if (!properties.isEmpty()) {
            for (final Map.Entry<String, String> entry : this.properties.entrySet()) {
                stringBuilder.append(entry.getKey());
                stringBuilder.append(": ");
                stringBuilder.append(entry.getValue());
                stringBuilder.append(";");
            }
        }

        return stringBuilder.toString();
    }
}
