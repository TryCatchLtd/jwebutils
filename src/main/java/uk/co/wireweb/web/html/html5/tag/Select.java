package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.StandardAttributesTag;

/**
 * The select element creates a drop-down list.<br />
 * <br />
 * The &lt;option&gt; tags inside the select element define the available options in the list.<br />
 *
 * @author Daniel Johansson
 * @since 2 May 2010
 */
public class Select extends StandardAttributesTag<Select> {

    public Select() {
        super("select");
    }

    /**
     * Makes the select field focused on page load.
     *
     * @param autofocus autofocus
     * @return this
     */
    public Select autofocus(final String autofocus) {
        this.attribute("autofocus", autofocus);
        return this;
    }

    /**
     * When true, it disables the drop-down list.
     *
     * @param disabled disabled
     * @return this
     */
    public Select disabled(final String disabled) {
        this.attribute("disabled", disabled);
        return this;
    }

    /**
     * Defines one ore more forms the select field belongs to.
     *
     * @param form form name
     * @return this
     */
    public Select form(final String form) {
        this.attribute("form", form);
        return this;
    }

    /**
     * When present, it specifies that multiple items can be selected at a time.
     *
     * @param multiple multiple
     * @return this
     */
    public Select multiple(final String multiple) {
        this.attribute("multiple", multiple);
        return this;
    }

    /**
     * Defines a unique name for the drop-down list.
     *
     * @param name unique name
     * @return this
     */
    public Select name(final String name) {
        this.attribute("name", name);
        return this;
    }

    /**
     * Defines the number of visible items in the drop-down list.
     *
     * @param size number
     * @return this
     */
    public Select size(final String size) {
        this.attribute("size", size);
        return this;
    }
}
