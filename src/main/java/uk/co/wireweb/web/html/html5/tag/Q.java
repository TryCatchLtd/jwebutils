package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.FormEventsTag;

/**
 * The &lt;q&gt; tag defines the start of a short quotation.<br />
 * <br />
 * Browser often insert quotation marks around the quotation.
 *
 * @author Daniel Johansson
 * @since 3 Jun 2010
 */
public class Q extends FormEventsTag<Q> {

    public Q() {
        super("q");
    }

    /**
     * Defines a citation for the quotation.
     *
     * @param cite url
     * @return this
     */
    public Q cite(final String cite) {
        attribute("cite", cite);
        return this;
    }
}
