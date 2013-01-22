package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.StandardAttributesTag;

/**
 * The &lt;body&gt; tag defines the document's body.<br />
 * <br />
 * The &lt;body&gt; element contains all the contents of an HTML document, such as
 * text, hyperlinks, images, tables, lists, etc.
 *
 * @author Daniel Johansson
 * @since 24 Feb 2010
 */
public class Body extends StandardAttributesTag<Body> {

    public Body() {
        super("body");
    }

    /**
     * Script to be run when a document loads.
     *
     * @param onload script
     * @return this
     */
    public Body onload(final String onload) {
        attribute("onload", onload);
        return this;
    }
}
