package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.StandardAttributesTag;

/**
 * The &lt;html&gt; tag tells the browser that this is an HTML document.<br />
 * <br />
 * The html element is the outermost element in HTML documents.<br />
 * <br />
 * The html element is also known as the root element.
 *
 * @author Daniel Johansson
 * @since 24 Feb 2010
 */
public class Html extends StandardAttributesTag<Html> {

    public Html() {
        super("html");
    }

    /**
     * efines an URL, at this URL the document's cache information is being described.
     *
     * @param manifest URL
     * @return this
     */
    public Html manifest(final String manifest) {
        attribute("manifest", manifest);
        return this;
    }

    /**
     * Defines the XML namespace attribute.
     *
     * @param xmlns http://www.w3.org/1999/xhtml
     * @return this
     */
    public Html xmlns(final String xmlns) {
        attribute("xmlns", xmlns);
        return this;
    }
}
