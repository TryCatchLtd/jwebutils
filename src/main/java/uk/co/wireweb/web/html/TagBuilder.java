package uk.co.wireweb.web.html;

import java.util.HashMap;
import java.util.Map;

/**
 * TagBuilder.
 *
 * @author Daniel Johansson
 * @since 11 Feb 2010
 */
public class TagBuilder {

    private Map<String, String> attributes = new HashMap<String, String>();

    private String body;

    private String tag;

    public TagBuilder tag(final String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Sets the attributes map to use.
     *
     * @param attributes the map of attributes.
     * @return this
     */
    public TagBuilder attributes(final Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Sets the body of the tag.
     *
     * @param body the content of the tag body.
     * @return the {@link TagBuilder}
     */
    public TagBuilder body(final String body) {
        this.body = body;
        return this;
    }

    /**
     * Returns the start tag.
     *
     * @return the start tag.
     */
    public String getStartTag() {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<");
        stringBuilder.append(this.tag);

        if (this.attributes.isEmpty()) {
            if (this.body == null) {
                stringBuilder.append(" />");
            } else {
                stringBuilder.append(">");
            }
        } else {
            for (final Map.Entry<String, String> entry : this.attributes.entrySet()) {
                stringBuilder.append(" ");

                stringBuilder.append(entry.getKey());
                stringBuilder.append("=\"");
                stringBuilder.append(entry.getValue());
                stringBuilder.append("\"");
            }

            if (this.body == null) {
                stringBuilder.append(" />");
            } else {
                stringBuilder.append(">");
            }
        }

        return stringBuilder.toString();
    }

    /**
     * Returns the body of the tag.
     *
     * @return the tag body.
     */
    public String getBody() {
        if (this.body != null) {
            return this.body;
        }

        return "";
    }

    /**
     * Returns the end tag.
     *
     * @return the end tag.
     */
    public String getEndTag() {
        final StringBuilder stringBuilder = new StringBuilder();

        if (this.body != null) {
            stringBuilder.append("</");
            stringBuilder.append(this.tag);
            stringBuilder.append(">");
        }

        return stringBuilder.toString();
    }

    /**
     * Returns the tag as valid HTML.
     */
    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getStartTag());
        stringBuilder.append(getBody());
        stringBuilder.append(getEndTag());

        return stringBuilder.toString();
    }
}
