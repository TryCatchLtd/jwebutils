package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.StandardAttributesTag;

/**
 * The &lt;a&gt; tag defines a hyperlink, which is used to link from one page to another.<br />
 * <br />
 * The most important attribute of the a element is the href attribute, which indicates the link's destination.<br />
 * <br />
 * By default, links will appear as follows in all browsers:<br />
 * <br />
 * <ul>
 * <li>An unvisited link is underlined and blue</li>
 * <li>A visited link is underlined and purple</li>
 * <li>An active link is underlined and red</li>
 * </ul>
 *
 * @author Daniel Johansson
 * @since 24 Feb 2010
 */
public class A extends StandardAttributesTag<A> {

    public A() {
        super("a");
    }

    /**
     * The target URL of the link.
     *
     * @param href the url.
     * @return this
     */
    public A href(final String href) {
        this.attribute("href", href);

        // Default the body to whatever the href is
        if (this.body == null) {
            this.body(href);
        }

        return this;
    }

    /**
     * Specifies the base language of the target URL. Use only if the href attribute is present.
     *
     * @param hreflang the language
     * @return this
     */
    public A hreflang(final String hreflang) {
        this.attribute("hreflang", hreflang);
        return this;
    }

    /**
     * Specifies the mediatype of the target URL. Default value: all. Use only if the href attribute is present.
     *
     * @param media query
     * @return this
     */
    public A media(final String media) {
        this.attribute("media", media);
        return this;
    }

    /**
     * Space separated list of URL's that gets notified when a user follows the hyperlink.
     * Use only if the href attribute is present.
     *
     * @param ping URL
     * @return this
     */
    public A ping(final String ping) {
        this.attribute("ping", ping);
        return this;
    }

    /**
     * Specifies the relationship between the current document and the target URL.
     * Use only if the href attribute is present.<br />
     * <br />
     * List of valid rel values.
     * <ul>
     * <li>alternate</li>
     * <li>archives</li>
     * <li>author</li>
     * <li>bookmark</li>
     * <li>contact</li>
     * <li>external</li>
     * <li>feed</li>
     * <li>first</li>
     * <li>help</li>
     * <li>icon</li>
     * <li>index</li>
     * <li>last</li>
     * <li>license</li>
     * <li>next</li>
     * <li>nofollow</li>
     * <li>noreferrer</li>
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
     * @param rel see list above
     * @return this
     */
    public A rel(final String rel) {
        this.attribute("rel", rel);
        return this;
    }

    /**
     * Where to open the target URL. Use only if the href attribute is present.<br />
     * <br />
     * <ul>
     * <li>_blank - the target URL will open in a new window</li>
     * <li>_self - the target URL will open in the same document as it was clicked</li>
     * <li>_parent - the target URL will open in the parent document</li>
     * <li>_top - the target URL will open in the full body of the window</li>
     * </ul>
     *
     * @param target see list above
     * @return this
     */
    public A target(final String target) {
        this.attribute("target", target);
        return this;
    }

    /**
     * Specifies the MIME (Multipurpose Internet Mail Extensions) type of the target URL.
     * Use only if the href attribute is present.
     *
     * @param type mime_type
     * @return this
     */
    public A type(final String type) {
        this.attribute("type", type);
        return this;
    }
}
