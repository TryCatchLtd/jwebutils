package uk.co.wireweb.web.html;

import java.util.HashMap;
import java.util.Map;

/**
 * Tag is a class which allows you to create your own custom tags as well as being a base class for all the
 * normal tags.
 *
 * @author Daniel Johansson
 * @since 11 Feb 2010
 */
@SuppressWarnings("unchecked")
public abstract class Tag<T extends Tag> {

    protected final String tag;

    protected String body;

    private boolean empty;

    private Map<String, String> attributes = new HashMap<String, String>();

    /**
     * Constructor which takes a tag name.
     *
     * @param tag the name of the tag
     */
    public Tag(final String tag) {
        this(tag, false);
    }

    /**
     * Constructor which takes a tag name and an indicator to if this is an empty tag.
     * If this tag is an empty tag the body method will not work and the tag
     * will be rendered like this:<br />
     * <br />
     * <b>&lt;tagname attribute="value" /&gt;</b><br />
     * <br />
     * By default all tags are open and rendered like this if a body exists.<br />
     * <br />
     * <b>&lt;tagname attribute="value"&gt;This is the body&lt;/tagname&gt;</b>
     *
     * @param tag   the tag name
     * @param empty indicator to if this is an empty tag
     */
    public Tag(final String tag, final boolean empty) {
        this.tag = tag;
        this.empty = empty;
    }

    /**
     * Gets a certain attribute value by key.
     *
     * @param key the attribute key
     * @return the attribute value
     */
    public String getAttribute(final String key) {
        return this.attributes.get(key);
    }

    /**
     * Sets the body of this tag.
     *
     * @param body the value of the body
     * @return this
     */
    public T body(final String body) {
        if (!this.empty) {
            this.body = body;
        }

        return (T) this;
    }

    /**
     * Appends a tag to the current body of this tag.
     *
     * @param tag the tag to append
     * @return this
     */
    public T appendToBody(final Tag<?> tag) {
        if (tag != null) {
            appendToBody(tag.toString());
        }

        return (T) this;
    }

    /**
     * Appends the input text to the body of this tag.
     *
     * @param body the value to append to the body
     * @return this
     */
    public T appendToBody(final String body) {
        if (!this.empty) {
            if (this.body == null) {
                this.body = body;
            } else {
                this.body += body;
            }
        }

        return (T) this;
    }

    /**
     * Adds a child tag into the body of this tag.
     *
     * @param tag the child
     * @return this
     */
    public T child(final Tag tag) {
        if (!this.empty) {
            if (this.body == null) {
                this.body = "";
            }

            this.body += tag.toString() + "";
        }
        return (T) this;
    }

    /**
     * Sets an attribute on this tag.
     *
     * @param key   the attribute key
     * @param value the attribute value
     * @return this
     */
    public T attribute(final String key, final String value) {
        if (key != null && value != null) {
            this.attributes.put(key, value);
        }

        return (T) this;
    }

    /**
     * Creates a tagbuilder for this tag and returns it.
     *
     * @return {@link TagBuilder}
     */
    protected TagBuilder getTagBuilder() {
        final TagBuilder tagBuilder = new TagBuilder();
        tagBuilder.tag(this.tag);
        tagBuilder.body(this.body);

        if (!this.attributes.isEmpty()) {
            tagBuilder.attributes(this.attributes);
        }

        return tagBuilder;
    }

    @Override
    public String toString() {
        return getTagBuilder().toString();
    }

    /**
     * Gets the current body of this tag.
     *
     * @return the body
     */
    public String getBody() {
        return body;
    }
}
