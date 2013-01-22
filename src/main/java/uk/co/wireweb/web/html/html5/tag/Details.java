package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.StandardAttributesTag;

/**
 * The &lt;details&gt; tag is used to describe details about a document, or parts of a document.
 *
 * @author Daniel Johansson
 * @since 12 May 2010
 */
public class Details extends StandardAttributesTag<Details> {

    public Details() {
        super("details");
    }

    /**
     * Defines if the details should be visible (present) or not (not present).
     *
     * @param open open
     * @return this
     */
    public Details open(final String open) {
        attribute("open", open);
        return this;
    }
}
