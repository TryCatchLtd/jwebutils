package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.StandardAttributesTag;

/**
 * The &lt;del&gt; tag defines text that has been deleted from a document.
 *
 * @author Daniel Johansson
 * @since 12 May 2010
 */
public class Del extends StandardAttributesTag<Del> {

    public Del() {
        super("del");
    }

    /**
     * Defines a URL to another document which explains why the text was deleted or inserted.
     *
     * @param cite URL
     * @return this
     */
    public Del cite(final String cite) {
        attribute("cite", cite);
        return this;
    }

    /**
     * Defines the date and time the text was deleted.
     *
     * @param datetime yyyy/mm/dd
     * @return this
     */
    public Del datetime(final String datetime) {
        attribute("datetime", datetime);
        return this;
    }
}
