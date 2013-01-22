package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.StandardAttributesTag;

/**
 * The &lt;blockquote&gt; tag defines a block of quotation that is taken from another source.<br />
 * <br />
 * Browsers usually renders the text from <blockquote> elements with paragraph breaks.
 *
 * @author Daniel Johansson
 * @since 11 May 2010
 */
public class Blockquote extends StandardAttributesTag<Blockquote> {

    public Blockquote() {
        super("blockquote");
    }

    /**
     * URL of the quote, if it is taken from the web.
     *
     * @param cite URL
     * @return this
     */
    public Blockquote cite(final String cite) {
        attribute("cite", cite);
        return this;
    }
}
