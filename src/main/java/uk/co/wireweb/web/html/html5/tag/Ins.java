package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.FormEventsTag;

/**
 * Defines text that have been inserted in addition to the rest of the document.<br />
 * <br />
 * <b>Tip:</b> Use it together with the &lt;del&gt; tag to describe updates and modifications to a document.
 *
 * @author Daniel Johansson
 * @since 25 May 2010
 */
public class Ins extends FormEventsTag<Ins> {

    public Ins() {
        super("ins");
    }

    /**
     * A URL to another document which explains why the text was inserted.
     *
     * @param cite URL
     * @return this
     */
    public Ins cite(final String cite) {
        attribute("cite", cite);
        return this;
    }

    /**
     * Defines the date and time when the text was inserted.
     *
     * @param datetime yyyy/mm/dd
     * @return this
     */
    public Ins datetime(final String datetime) {
        attribute("datetime", datetime);
        return this;
    }
}
