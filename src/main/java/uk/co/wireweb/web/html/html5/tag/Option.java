package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.StandardAttributesTag;

/**
 * The option element defines an option in the drop-down list.<br />
 *
 * @author Daniel Johansson
 * @since 2 May 2010
 */
public class Option extends StandardAttributesTag<Option> {

    public Option() {
        super("option");
    }

    /**
     * When true, it disables the drop-down list.
     *
     * @param disabled disabled
     * @return this
     */
    public Option disabled(final String disabled) {
        this.attribute("disabled", disabled);
        return this;
    }

    /**
     * Defines a label to use when using &lt;optgroup&gt;.
     *
     * @param label text
     * @return this
     */
    public Option label(final String label) {
        this.attribute("label", label);
        return this;
    }

    /**
     * Specifies that the option should appear selected (will be displayed first in the list).
     *
     * @param selected selected
     * @return this
     */
    public Option selected(final String selected) {
        this.attribute("selected", selected);
        return this;
    }

    /**
     * Defines the value of the option to be sent to the server.
     *
     * @param value text
     * @return this
     */
    public Option value(final String value) {
        this.attribute("value", value);
        return this;
    }
}
