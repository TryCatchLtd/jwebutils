package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.StandardAttributesTag;

/**
 * bdo stands for bidirectional override.<br />
 * <br />
 * The &lt;bdo&gt; tag allows you to specify the text direction and override the bidirectional algorithm.
 *
 * @author Daniel Johansson
 * @since 11 May 2010
 */
public class Bdo extends StandardAttributesTag<Bdo> {

    public Bdo() {
        super("bdo");
    }

    /**
     * Defines the text direction. This attribute is required.
     *
     * @param dir ltr or rtl
     * @return this
     */
    public Bdo dir(final String dir) {
        attribute("dir", dir);
        return this;
    }
}
