package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.FormEventsTag;

/**
 * The iframe element creates an inline frame that contains another document.
 *
 * @author Daniel Johansson
 * @since 25 May 2010
 */
public class Iframe extends FormEventsTag<Iframe> {

    public Iframe() {
        super("iframe");
    }

    /**
     * Defines the height of the iframe.
     *
     * @param height pixels or %
     * @return this
     */
    public Iframe height(final String height) {
        attribute("height", height);
        return this;
    }

    /**
     * Specifies a unique name of the iframe.
     *
     * @param name frame name
     * @return this
     */
    public Iframe name(final String name) {
        attribute("name", name);
        return this;
    }

    /**
     * Defines restrictions to the frame content.
     *
     * @param sandbox allow-forms, allow-same-origin, allow-scripts
     * @return this
     */
    public Iframe sandbox(final String sandbox) {
        attribute("sandbox", sandbox);
        return this;
    }

    /**
     * If present, the iframe should appear as if it is part of the document the iframe is in.
     *
     * @param seamless seamless
     * @return this
     */
    public Iframe seamless(final String seamless) {
        attribute("seamless", seamless);
        return this;
    }

    /**
     * The URL of the document to show in the iframe.
     *
     * @param src URL
     * @return this
     */
    public Iframe src(final String src) {
        attribute("src", src);
        return this;
    }

    /**
     * The HTML of the document showing in the iframe.
     *
     * @param srcdoc HTML
     * @return this
     */
    public Iframe srcdoc(final String srcdoc) {
        attribute("srcdoc", srcdoc);
        return this;
    }

    /**
     * Defines the width of the iframe.
     *
     * @param width pixels or %
     * @return this
     */
    public Iframe width(final String width) {
        attribute("width", width);
        return this;
    }
}
