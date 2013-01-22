package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.StandardAttributesTag;

/**
 * The &lt;button&gt; tag defines a push button.<br />
 * <br />
 * Inside a button element you can put content, like text or images. This is the difference between this
 * element and buttons created with the input element.<br />
 * <br />
 * Always specify the type attribute for the button. Different browsers uses different default values for the type attribute.
 *
 * @author Daniel Johansson
 * @since 12 May 2010
 */
public class Button extends StandardAttributesTag<Button> {

    public Button() {
        super("button");
    }

    /**
     * If present, it makes the button focused when the page loads.
     *
     * @param autofocus autofocus
     * @return this
     */
    public Button autofocus(final String autofocus) {
        attribute("autofocus", autofocus);
        return this;
    }

    /**
     * Disables the button.
     *
     * @param disabled disabled
     * @return this
     */
    public Button disabled(final String disabled) {
        attribute("disabled", disabled);
        return this;
    }

    /**
     * Specifies which form this button belongs to.
     *
     * @param form form_name
     * @return this
     */
    public Button form(final String form) {
        attribute("form", form);
        return this;
    }

    /**
     * Specifies where to send the form-data when a form is submitted. Overrides the form's action attribute.
     *
     * @param formaction URL
     * @return this
     */
    public Button formaction(final String formaction) {
        attribute("formaction", formaction);
        return this;
    }

    /**
     * Specifies how form-data should be encoded before sending it to a server. Overrides the form's enctype attribute.
     *
     * @param formenctype application/x-www-form-urlencoded multipart/form-data text/plain
     * @return this
     */
    public Button formenctype(final String formenctype) {
        attribute("formenctype", formenctype);
        return this;
    }

    /**
     * Specifies how to send form-data. Overrides the form's action attribute.<br />
     * <br />
     * <ul>
     * <li>delete</li>
     * <li>get</li>
     * <li>post</li>
     * <li>put</li>
     * </ul>
     *
     * @param formmethod the formmethod
     * @return this
     */
    public Button formmethod(final String formmethod) {
        attribute("formmethod", formmethod);
        return this;
    }

    /**
     * If present, indicates that the form should not be validated when submitted. Overrides the form's novalidate attribute.
     *
     * @param formnovalidate formnovalidate
     * @return this
     */
    public Button formnovalidate(final String formnovalidate) {
        attribute("formnovalidate", formnovalidate);
        return this;
    }

    /**
     * Specifies where to open the action URL. Overrides the forms target attribute.<br />
     * <br />
     * <ul>
     * <li>_blank</li>
     * <li>_self</li>
     * <li>_parent</li>
     * <li>_top</li>
     * <li>framename</li>
     * </ul>
     *
     * @param formtarget see list above
     * @return this
     */
    public Button formtarget(final String formtarget) {
        attribute("formtarget", formtarget);
        return this;
    }

    /**
     * Specifies a unique name for the button.
     *
     * @param name button_name
     * @return this
     */
    public Button name(final String name) {
        attribute("name", name);
        return this;
    }

    /**
     * Defines the type of button.<br />
     * <br />
     * <ul>
     * <li>button</li>
     * <li>reset</li>
     * <li>submit</li>
     * </ul>
     *
     * @param type see list above
     * @return this
     */
    public Button type(final String type) {
        attribute("type", type);
        return this;
    }

    /**
     * Specifies an initial value for the button. The value can be changed by a script.
     *
     * @param value some_value
     * @return this
     */
    public Button value(final String value) {
        attribute("value", value);
        return this;
    }
}
