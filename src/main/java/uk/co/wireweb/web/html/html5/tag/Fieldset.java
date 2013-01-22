package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.FormEventsTag;

/**
 * The &lt;fieldset&gt; tag is used to logically group together elements in a form.<br />
 * <br />
 * The &lt;fieldset&gt; tag draws a box around the related form elements.<br />
 * <br />
 * The &lt;legend&gt; tag defines a caption for the fieldset element.
 *
 * @author Daniel Johansson
 * @since 13 May 2010
 */
public class Fieldset extends FormEventsTag<Fieldset> {
    public Fieldset() {
        super("fieldset");
    }

    /**
     * Defines if the fieldset is visible or not.
     *
     * @param disabled disabled
     * @return this
     */
    public Fieldset disabled(final String disabled) {
        attribute("disabled", disabled);
        return this;
    }

    /**
     * Defines one ore more forms the fieldset belongs to.
     *
     * @param form form name
     * @return this
     */
    public Fieldset form(final String form) {
        attribute("form", form);
        return this;
    }

    /**
     * Defines the name of the fieldset.
     *
     * @param name value
     * @return this
     */
    public Fieldset name(final String name) {
        attribute("name", name);
        return this;
    }
}
