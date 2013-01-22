package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.FormEventsTag;

/**
 * The &lt;input&gt; tag defines the start of an input field where the user can enter data.
 *
 * @author Daniel Johansson
 * @since 24 Feb 2010
 */
public class Input extends FormEventsTag<Input> {

    public Input() {
        super("input");
    }

    /**
     * A comma-separated list of MIME types that indicates the MIME type of the file transfer.<br />
     * <br />
     * <b>Note:</b> Only used with type="file"
     *
     * @param accept list_of_mime_type
     * @return this
     */
    public Input accept(final String accept) {
        attribute("accept", accept);
        return this;
    }

    /**
     * Defines an alternate text for the image.<br />
     * <br />
     * <b>Note:</b> Only used with type="image"
     *
     * @param alt text
     * @return this
     */
    public Input alt(final String alt) {
        attribute("alt", alt);
        return this;
    }

    /**
     * If "on" browsers can store the form's input values, to auto-fill the form if the user returns to the page.<br />
     * <br />
     * If "off" browsers should not store this information.
     *
     * @param autocomplete on | off
     * @return this
     */
    public Input autocomplete(final String autocomplete) {
        attribute("autocomplete", autocomplete);
        return this;
    }

    /**
     * Makes the input field focused on page load.<br />
     * <br />
     * <b>Note:</b> Cannot be used with type="hidden"
     *
     * @param autofocus autofocus
     * @return this
     */
    public Input autofocus(final String autofocus) {
        attribute("autofocus", autofocus);
        return this;
    }

    /**
     * Indicates that the input element should be checked when it first loads.<br />
     * <br />
     * <b>Note:</b> Used with type="checkbox" and type="radio"
     *
     * @param checked checked
     * @return this
     */
    public Input checked(final String checked) {
        attribute("checked", checked);
        return this;
    }

    /**
     * Disables the input element when it first loads so that the user can not write text in it, or select it.<br />
     * <br />
     * <b>Note:</b> Cannot be used with type="hidden"
     *
     * @param disabled the disabled attribute value
     * @return this
     */
    public Input disabled(final String disabled) {
        attribute("disabled", disabled);
        return this;
    }

    /**
     * Defines one ore more forms the input field belongs to.
     *
     * @param form formname
     * @return this
     */
    public Input form(final String form) {
        attribute("form", form);
        return this;
    }

    /**
     * Overrides the form's action attribute. Must be a valid URL that defines where to send the data when the form is submitted.
     *
     * @param formaction URL
     * @return this
     */
    public Input formaction(final String formaction) {
        attribute("formaction", formaction);
        return this;
    }

    /**
     * Overrides the form's enctype attribute. Defines the mime type used to encode the content of the form.
     *
     * @param formenctype application/x-www-form-urlencoded | multipart/form-data | text/plain
     * @return this
     */
    public Input formenctype(final String formenctype) {
        attribute("formenctype", formenctype);
        return this;
    }

    /**
     * Overrides the form's method attribute. Defines the HTTP method for sending data to the action URL.
     *
     * @param formmethod get | post | put | delete
     * @return this
     */
    public Input formmethod(final String formmethod) {
        attribute("formmethod", formmethod);
        return this;
    }

    /**
     * Overrides the form's novalidate attribute. If "true" the input field should not be validated when submitted.
     *
     * @param formnovalidate true | false
     * @return this
     */
    public Input formnovalidate(final String formnovalidate) {
        attribute("formnovalidate", formnovalidate);
        return this;
    }

    /**
     * Where to open the target URL.<br />
     * <br />
     * <ul>
     * <li>blank - the target URL will open in a new window</li>
     * <li>_self - the target URL will open in the same frame as it was clicked</li>
     * <li>_parent - the target URL will open in the parent frameset</li>
     * <li>top - the target URL will open in the full body of the window</li>
     * </ul>
     *
     * @param formtarget see list above
     * @return this
     */
    public Input formtarget(final String formtarget) {
        attribute("formtarget", formtarget);
        return this;
    }

    /**
     * Defines the height of an input field.
     *
     * @param height pixels | %
     * @return this
     */
    public Input height(final String height) {
        attribute("height", height);
        return this;
    }

    /**
     * Reference to a datalist element. If defined, a suggestion list (drop down list?)
     * should be displayed, with predefined opions.
     *
     * @param list id of datalist
     * @return this
     */
    public Input list(final String list) {
        attribute("list", list);
        return this;
    }

    /**
     * The input field's maximum value. Use togheter with the "min" attribute to create a range of legal values.
     *
     * @param max number
     * @return this
     */
    public Input max(final String max) {
        attribute("max", max);
        return this;
    }

    /**
     * Defines the maximum number of characters allowed in a text field.
     *
     * @param maxlength number
     * @return this
     */
    public Input maxlength(final String maxlength) {
        attribute("maxlength", maxlength);
        return this;
    }

    /**
     * The input field's minimum value. Use togheter with the "max" attribute to create a range of legal values.
     *
     * @param min number
     * @return this
     */
    public Input min(final String min) {
        attribute("min", min);
        return this;
    }

    /**
     * If present the user is allowed more than one value.
     *
     * @param multiple multiple
     * @return this
     */
    public Input multiple(final String multiple) {
        attribute("multiple", multiple);
        return this;
    }

    /**
     * Defines a unique name for the input element. The name attribute is used to collect the fields value when submitted.
     *
     * @param name fieldname
     * @return this
     */
    public Input name(final String name) {
        attribute("name", name);
        return this;
    }

    /**
     * Defines a pattern or format for the input field's value. Example: pattern="[0-9]" means that
     * the input value must be a number between 0 an 9. Use the standard "title" attribute to describe the pattern.
     *
     * @param pattern JavaScript Pattern
     * @return this
     */
    public Input pattern(final String pattern) {
        attribute("pattern", pattern);
        return this;
    }

    /**
     * Defines a hint to help users fill out the input field.
     *
     * @param placeholder text
     * @return this
     */
    public Input placeholder(final String placeholder) {
        attribute("placeholder", placeholder);
        return this;
    }

    /**
     * Indicates that the value of this field cannot be modified.
     *
     * @param readonly readonly
     * @return this
     */
    public Input readonly(final String readonly) {
        attribute("readonly", readonly);
        return this;
    }

    /**
     * Defines if the input field's value is required in order to submit the form.<br />
     * <br />
     * <b>Note:</b> Cannot be used with type: hidden, image, button, submit, reset.
     *
     * @param required required
     * @return this
     */
    public Input required(final String required) {
        attribute("required", required);
        return this;
    }

    /**
     * Defines how many characters should be visible in the input field.
     *
     * @param size number of characters
     * @return this
     */
    public Input size(final String size) {
        attribute("size", size);
        return this;
    }

    /**
     * Defines the URL of the image to display.<br />
     * <br />
     * Use with type="image"
     *
     * @param src URL
     * @return this
     */
    public Input src(final String src) {
        attribute("src", src);
        return this;
    }

    /**
     * Allowed when type=date,datetime,datetime-local,month,week,time,number, or range.
     *
     * @param step number | any
     * @return this
     */
    public Input step(final String step) {
        attribute("step", step);
        return this;
    }

    /**
     * Indicates the type of the input element. The default value is "text".<br />
     * <br />
     * <b>Note:</b> This is not a required attribute, but we think you should include it.<br />
     * <br />
     * <ul>
     * <li>button</li>
     * <li>checkbox</li>
     * <li>color</li>
     * <li>date</li>
     * <li>datetime</li>
     * <li>datetime-local</li>
     * <li>email</li>
     * <li>file</li>
     * <li>hidden</li>
     * <li>image</li>
     * <li>month</li>
     * <li>number</li>
     * <li>password</li>
     * <li>radio</li>
     * <li>range</li>
     * <li>reset</li>
     * <li>search</li>
     * <li>submit</li>
     * <li>tel</li>
     * <li>text</li>
     * <li>time</li>
     * <li>url</li>
     * <li>week</li>
     * </ul>
     *
     * @param type see list above
     * @return this
     */
    public Input type(final String type) {
        attribute("type", type);
        return this;
    }

    /**
     * <b>For buttons:</b> Defines the text on the button.<br />
     * <br />
     * <b>For image buttons:</b> Defines the symbolic result of the field passed to a script.<br />
     * <br />
     * <b>For checkboxes and radio buttons:</b> Defines the result of the input element when clicked. The result is sent to the form's action URL.<br />
     * <br />
     * <b>For hidden, password, and text fields:</b> Defines the default value of the element.<br />
     * <br />
     * <b>Note:</b> Cannot be used with type="file".<br />
     * <br />
     * <b>Note:</b> This attribute is required with type="checkbox" and type="radio".<br />
     *
     * @param value string value
     * @return this
     */
    public Input value(final String value) {
        attribute("value", value);
        return this;
    }

    /**
     * Defines the width of an input field.
     *
     * @param width pixels | %
     * @return this
     */
    public Input width(final String width) {
        attribute("width", width);
        return this;
    }
}
