package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.FormEventsTag;

/**
 * The &lt;textarea&gt; tag defines a multi-line text input control.<br />
 * <br />
 * A text area can hold an unlimited number of characters, and the text renders in a fixed-width font (usually Courier).<br />
 * <br />
 * The size of a textarea can be specified by the cols and rows attributes, or even better; through CSS height and width properties.<br />
 *
 * @author Daniel Johansson
 * @since 3 Jun 2010
 */
public class Textarea extends FormEventsTag<Textarea> {

    public Textarea() {
        super("textarea");
    }

    /**
     * Makes the textarea focused on page load.
     *
     * @param autofocus autofocus
     * @return this
     */
    public Textarea autofocus(final String autofocus) {
        attribute("autofocus", autofocus);
        return this;
    }

    /**
     * Specifies the number of characters visible in the text-area.
     *
     * @param cols number
     * @return this
     */
    public Textarea cols(final String cols) {
        attribute("cols", cols);
        return this;
    }

    /**
     * Disables the text-area when it is first displayed.
     *
     * @param disabled disabled
     * @return this
     */
    public Textarea disabled(final String disabled) {
        attribute("disabled", disabled);
        return this;
    }

    /**
     * Defines one ore more forms the textarea belongs to.
     *
     * @param form form name
     * @return this
     */
    public Textarea form(final String form) {
        attribute("form", form);
        return this;
    }

    /**
     * Defines the maximum number of characters allowed in the textarea.
     *
     * @param maxlength number
     * @return this
     */
    public Textarea maxlength(final String maxlength) {
        attribute("maxlength", maxlength);
        return this;
    }

    /**
     * Specifies a name for the text-area.
     *
     * @param name name of textarea
     * @return this
     */
    public Textarea name(final String name) {
        attribute("name", name);
        return this;
    }

    /**
     * Defines a hint to help users fill out the textarea.
     *
     * @param placeholder text
     * @return this
     */
    public Textarea placeholder(final String placeholder) {
        attribute("placeholder", placeholder);
        return this;
    }

    /**
     * Indicates that the user cannot modify the content in the textarea.
     *
     * @param readonly readonly
     * @return this
     */
    public Textarea readonly(final String readonly) {
        attribute("readonly", readonly);
        return this;
    }

    /**
     * Defines if the textarea's value is required in order to submit the form.
     *
     * @param required required
     * @return this
     */
    public Textarea required(final String required) {
        attribute("required", required);
        return this;
    }

    /**
     * Specifies the number of rows visible in the text-area.
     *
     * @param rows number
     * @return this
     */
    public Textarea rows(final String rows) {
        attribute("rows", rows);
        return this;
    }

    /**
     * Specifies how to wrap the textarea's content when submitted. If the value is "hard" then line breaks are added
     * at the "cols" attribute's value. The value "soft" is default, and adds no line breaks.
     *
     * @param wrap hard or soft
     * @return this
     */
    public Textarea wrap(final String wrap) {
        attribute("wrap", wrap);
        return this;
    }
}
