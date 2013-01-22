package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.StandardAttributesTag;

/**
 * The &lt;label&gt; tag defines a label for an input element.<br />
 * <br />
 * The label element does not render as anything special for the user. However, it provides
 * a usability improvement for mouse users, because if the user clicks on the text within
 * the label element, it toggles the control.<br />
 * <br />
 * The for attribute of the &lt;label&gt; tag should be equal to the id attribute of the related
 * element to bind them together.
 *
 * @author Daniel Johansson
 * @since 24 Feb 2010
 */
public class Label extends StandardAttributesTag<Label> {

    public Label() {
        super("label");
    }

    /**
     * Defines which form element the label is for. Set to an ID of a form element.<br />
     * <br />
     * <b>Note:</b> If this attribute is not specified, the label is associated with its contents.
     *
     * @param forField id of another field
     * @return this
     */
    public Label forField(final String forField) {
        attribute("for", forField);
        return this;
    }

    /**
     * Defines one ore more forms the label field belongs to.
     *
     * @param form formname
     * @return this
     */
    public Label form(final String form) {
        attribute("form", form);
        return this;
    }
}
