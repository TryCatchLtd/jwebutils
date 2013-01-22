package uk.co.wireweb.web.html.html5;

/**
 * FormEventsTag.
 *
 * @author Daniel Johansson
 * @since 24 Feb 2010
 */
@SuppressWarnings("unchecked")
public abstract class FormEventsTag<T extends FormEventsTag> extends StandardAttributesTag<T> {

    public FormEventsTag(final String tag) {
        super(tag);
    }

    public FormEventsTag(final String tag, final boolean empty) {
        super(tag, empty);
    }

    /**
     * Script to be run when an element loses focus.
     *
     * @param onblur script
     * @return this
     */
    public T onblur(final String onblur) {
        attribute("onblur", onblur);
        return (T) this;
    }

    /**
     * Script to be run when an element changes.
     *
     * @param onchange script
     * @return this
     */
    public T onchange(final String onchange) {
        attribute("onchange", onchange);
        return (T) this;
    }

    /**
     * Script to be run when a context menu is triggered.
     *
     * @param oncontextmenu script
     * @return this
     */
    public T oncontextmenu(final String oncontextmenu) {
        attribute("oncontextmenu", oncontextmenu);
        return (T) this;
    }

    /**
     * Script to be run when an element gets focus.
     *
     * @param onfocus script
     * @return this
     */
    public T onfocus(final String onfocus) {
        attribute("onfocus", onfocus);
        return (T) this;
    }

    /**
     * Script to be run when form changes.
     *
     * @param onformchange script
     * @return this
     */
    public T onformchange(final String onformchange) {
        attribute("onformchange", onformchange);
        return (T) this;
    }

    /**
     * Script to be run on form input.
     *
     * @param onforminput script
     * @return this
     */
    public T onforminput(final String onforminput) {
        attribute("onforminput", onforminput);
        return (T) this;
    }

    /**
     * Script to be run on input.
     *
     * @param oninput the script to run on input
     * @return this
     */
    public T oninput(final String oninput) {
        attribute("oninput", oninput);
        return (T) this;
    }

    /**
     * Script to be run when an element is selected.
     *
     * @param onselect script
     * @return this
     */
    public T onselect(final String onselect) {
        attribute("onselect", onselect);
        return (T) this;
    }

    /**
     * Script to be run when a form is submitted.
     *
     * @param onsubmit script
     * @return this
     */
    public T onsubmit(final String onsubmit) {
        attribute("onsubmit", onsubmit);
        return (T) this;
    }
}
