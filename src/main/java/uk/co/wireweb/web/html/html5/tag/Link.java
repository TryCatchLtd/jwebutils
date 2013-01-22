package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.Tag;

/**
 * The &lt;link&gt; tag defines the relationship between a document and an external resource.<br />
 * <br />
 * The &lt;link&gt; tag is most used to link to style sheets.<br />
 *
 * @author Daniel Johansson
 * @since 29 Mar 2010
 */
public class Link extends Tag<Link> {

    public Link() {
        super("link");
    }

    /**
     * The target URL of the resource.
     *
     * @param href URL
     * @return this
     */
    public Link href(final String href) {
        attribute("href", href);
        return this;
    }

    /**
     * Defines the base language of the target URL.
     *
     * @param hreflang language_code
     * @return this
     */
    public Link hreflang(final String hreflang) {
        attribute("hreflang", hreflang);
        return this;
    }

    /**
     * Specifies on what device the document will be displayed.<br />
     * <br />
     * <ul>
     * <li>screen - For non-paged computer screens</li>
     * <li>tty - For media using a fixed-pitch character grid (like teletypes, terminals, or devices with limited display capabilities)</li>
     * <li>tv - For TV-type devices (low resolution, limited scrollability)</li>
     * <li>projection - For projectors</li>
     * <li>handheld - For handheld devices (small screen, limited bandwidth)</li>
     * <li>print - For paged and for documents viewed on screen in print preview mode</li>
     * <li>braille - For braille tactile feedback devices</li>
     * <li>aural - For speech synthesizers</li>
     * <li>all - For all devices</li>
     * </ul>
     *
     * @param media see list above
     * @return this
     */
    public Link media(final String media) {
        attribute("media", media);
        return this;
    }

    /**
     * Specifies the relationship between the current document and the target URL. Use only if the href attribute is present.<br />
     * <br />
     * <ul>
     * <li>alternate</li>
     * <li>archives</li>
     * <li>author</li>
     * <li>first</li>
     * <li>help</li>
     * <li>icon</li>
     * <li>index</li>
     * <li>last</li>
     * <li>license</li>
     * <li>next</li>
     * <li>pingback</li>
     * <li>prefetch</li>
     * <li>prev</li>
     * <li>search</li>
     * <li>stylesheet</li>
     * <li>sidebar</li>
     * <li>tag</li>
     * <li>up</li>
     * </ul>
     *
     * @param rel see list above.
     * @return this
     */
    public Link rel(final String rel) {
        attribute("rel", rel);
        return this;
    }

    /**
     * Defines sizes of the linked resource. Can be used when rel="icon".
     *
     * @param sizes number, any
     * @return this
     */
    public Link sizes(final String sizes) {
        attribute("sizes", sizes);
        return this;
    }

    /**
     * Specifies the MIME type of the target URL.
     *
     * @param type the mime type (text/css, text/javascript, image/gif) etc.
     * @return this
     */
    public Link type(final String type) {
        attribute("type", type);
        return this;
    }
}
