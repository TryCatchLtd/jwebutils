package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.FormEventsTag;

/**
 * The &lt;optgroup&gt; is used to group related options in a drop-down list.<br />
 * <br />
 * If you have a long list of options, groups of related options are easier to handle for the user.
 *
 * @author Daniel Johansson
 * @since 3 Jun 2010
 */
public class Optgroup extends FormEventsTag<Optgroup> {

    public Optgroup() {
        super("optgroup");
    }

    /**
     * Defines the label for the option group.
     *
     * @param label text
     * @return this
     */
    public Optgroup label(final String label) {
        attribute("label", label);
        return this;
    }

    /**
     * Disables the options in that option-group.
     *
     * @param disabled disabled
     * @return this
     */
    public Optgroup disabled(final String disabled) {
        attribute("disabled", disabled);
        return this;
    }
}
