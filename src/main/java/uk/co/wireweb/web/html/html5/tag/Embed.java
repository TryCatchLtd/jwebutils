package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.FormEventsTag;

/**
 * The &lt;embed&gt; tag defines embedded content, such as a plug-in.
 *
 * @author Daniel Johansson
 * @since 13 May 2010
 */
public class Embed extends FormEventsTag<Embed> {
    public Embed() {
        super("embed");
    }

    /**
     * Sets the height of the embedded content.
     *
     * @param height pixels
     * @return this
     */
    public Embed height(final String height) {
        attribute("height", height);
        return this;
    }

    /**
     * The URL of the embedded content.
     *
     * @param src URL
     * @return this
     */
    public Embed src(final String src) {
        attribute("src", src);
        return this;
    }

    /**
     * Defines the type of the embedded content.
     *
     * @param type type
     * @return this
     */
    public Embed type(final String type) {
        attribute("type", type);
        return this;
    }

    /**
     * Sets the width of the embedded content.
     *
     * @param width pixels
     * @return this
     */
    public Embed width(final String width) {
        attribute("width", width);
        return this;
    }
}
