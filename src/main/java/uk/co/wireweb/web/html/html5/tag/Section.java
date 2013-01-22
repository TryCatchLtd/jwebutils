package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.FormEventsTag;

/**
 * The &lt;section&gt; tag defines sections in a document. Such as chapters, headers, footers, or any other sections of the document.
 *
 * @author Daniel Johansson
 * @since 3 Jun 2010
 */
public class Section extends FormEventsTag<Section> {
    public Section() {
        super("section");
    }

    /**
     * URL of the section, if it is taken from the web.
     *
     * @param cite URL
     * @return this
     */
    public Section cite(final String cite) {
        attribute("cite", cite);
        return this;
    }
}
