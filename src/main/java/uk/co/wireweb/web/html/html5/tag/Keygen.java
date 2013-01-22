package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.FormEventsTag;

/**
 * The &lt;keygen&gt; tag defines a generated key.
 *
 * @author Daniel Johansson
 * @since 25 May 2010
 */
public class Keygen extends FormEventsTag<Keygen> {

    public Keygen() {
        super("keygen");
    }

    /**
     * Makes the input field focused on page load<br />
     * <br />
     * <b>Note:</b> Cannot be used with type="hidden"
     *
     * @param autofocus disabled
     * @return this
     */
    public Keygen autofocus(final String autofocus) {
        attribute("autofocus", autofocus);
        return this;
    }

    /**
     * If present, the value of the keygen is set to be challenged when submitted.
     *
     * @param challenge challenge
     * @return this
     */
    public Keygen challenge(final String challenge) {
        attribute("challenge", challenge);
        return this;
    }

    /**
     * Disables the input element when it first loads so that the user can not write text in it, or select it.<br />
     * <br />
     * <b>Note:</b> Cannot be used with type="hidden"
     *
     * @param disabled disabled
     * @return this
     */
    public Keygen disabled(final String disabled) {
        attribute("disabled", disabled);
        return this;
    }

    /**
     * Defines one ore more forms the input field belongs to.
     *
     * @param form form name
     * @return this
     */
    public Keygen form(final String form) {
        attribute("form", form);
        return this;
    }

    /**
     * Defines the keytype. rsa generates a RSA key.
     *
     * @param keytype rsa
     * @return this
     */
    public Keygen keytype(final String keytype) {
        attribute("keytype", keytype);
        return this;
    }

    /**
     * Defines a unique name for the input element. The name attribute is used to collect the fields value when submitted.
     *
     * @param name field name
     * @return this
     */
    public Keygen name(final String name) {
        attribute("name", name);
        return this;
    }
}
