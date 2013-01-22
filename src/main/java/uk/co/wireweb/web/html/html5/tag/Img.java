package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.StandardAttributesTag;

/**
 * The &lt;img&gt; tag defines an image in an HTML page.<br />
 * <br />
 * Notice that images are not technically inserted into an HTML page, images are linked to HTML pages.
 * The &lt;img&gt; tag creates a holding space for the referenced image.
 *
 * @author Daniel Johansson
 * @since 24 Feb 2010
 */
public class Img extends StandardAttributesTag<Img> {

    public Img() {
        super("img", true);
    }

    /**
     * The URL of the image to display.
     *
     * @param src URL
     * @return this
     */
    public Img src(final String src) {
        attribute("src", src);
        return this;
    }

    /**
     * Defines a short description of the image.
     *
     * @param alt text
     * @return this
     */
    public Img alt(final String alt) {
        attribute("alt", alt);
        return this;
    }

    /**
     * Defines the height of an image.
     *
     * @param height pixels or %
     * @return this
     */
    public Img height(final String height) {
        attribute("height", height);
        return this;
    }

    /**
     * Sets the width of  an image.
     *
     * @param width pixels or %
     * @return this
     */
    public Img width(final String width) {
        attribute("width", width);
        return this;
    }

    /**
     * Defines the image as a server-side image map.
     *
     * @param ismap URL
     * @return this
     */
    public Img ismap(final String ismap) {
        attribute("ismap", ismap);
        return this;
    }

    /**
     * Defines the image as a client-side image map. Look at the &lt;map&gt; and &lt;area&gt; tags to figure out how it works.
     *
     * @param usemap URL
     * @return this
     */
    public Img usemap(final String usemap) {
        attribute("usemap", usemap);
        return this;
    }
}
