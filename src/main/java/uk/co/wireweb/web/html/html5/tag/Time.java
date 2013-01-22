package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.FormEventsTag;

/**
 * The &lt;time&gt; tag defines a time or a date, or both.
 *
 * @author Daniel Johansson
 * @since 3 Jun 2010
 */
public class Time extends FormEventsTag<Time> {

    public Time() {
        super("time");
    }

    /**
     * Defines the date or time of the element. If this attribute is not defined, the element's date or time must be defined inside the element.
     *
     * @param datetime datetime
     * @return this
     */
    public Time datetime(final String datetime) {
        attribute("datetime", datetime);
        return this;
    }
}
