package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.FormEventsTag;

/**
 * The &lt;progress&gt; tag defines work-in-progress.<br />
 * <br />
 * Use the progress element to display the progress of a time consuming function in JavaScript.
 *
 * @author Daniel Johansson
 * @since 3 Jun 2010
 */
public class Progress extends FormEventsTag<Progress> {

    public Progress() {
        super("progress");
    }

    /**
     * Defines the value of completion.
     *
     * @param max number
     * @return this
     */
    public Progress max(final String max) {
        attribute("max", max);
        return this;
    }

    /**
     * Defines the current value of the progress.
     *
     * @param value number
     * @return this
     */
    public Progress value(final String value) {
        attribute("value", value);
        return this;
    }
}
