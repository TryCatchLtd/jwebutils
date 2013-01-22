package uk.co.wireweb.web.html.html5;

import uk.co.wireweb.web.html.Tag;


/**
 * StandardAttributeTag.
 *
 * @author Daniel Johansson
 * @since 24 Feb 2010
 */
@SuppressWarnings("unchecked")
public abstract class StandardAttributesTag<T extends StandardAttributesTag> extends Tag<T> {

    public StandardAttributesTag(final String tag) {
        this(tag, false);
    }

    public StandardAttributesTag(final String tag, final boolean empty) {
        super(tag, empty);
    }

    public T id(final String id) {
        attribute("id", id);
        return (T) this;
    }

    public T styleClass(final String styleClass) {
        attribute("class", styleClass);
        return (T) this;
    }

    public T tabindex(final String tabindex) {
        attribute("tabindex", tabindex);
        return (T) this;
    }

    public T title(final String title) {
        attribute("title", title);
        return (T) this;
    }

    public T data(final String key, final String value) {
        attribute("data-" + key, value);
        return (T) this;
    }

    public T contenteditable(final String contenteditable) {
        attribute("contenteditable", contenteditable);
        return (T) this;
    }

    public T contextmenu(final String contextmenu) {
        attribute("contextmenu", contextmenu);
        return (T) this;
    }

    public T dir(final String dir) {
        attribute("dir", dir);
        return (T) this;
    }

    public T draggable(final String draggable) {
        attribute("draggable", draggable);
        return (T) this;
    }

    public T hidden(final String hidden) {
        attribute("hidden", hidden);
        return (T) this;
    }

    public T item(final String item) {
        attribute("item", item);
        return (T) this;
    }

    public T itemprop(final String itemprop) {
        attribute("itemprop", itemprop);
        return (T) this;
    }

    public T spellcheck(final String spellcheck) {
        attribute("spellcheck", spellcheck);
        return (T) this;
    }

    public T subject(final String subject) {
        attribute("subject", subject);
        return (T) this;
    }

    public T style(final String style) {
        attribute("style", style);
        return (T) this;
    }

    public T lang(final String lang) {
        attribute("lang", lang);
        return (T) this;
    }
}
