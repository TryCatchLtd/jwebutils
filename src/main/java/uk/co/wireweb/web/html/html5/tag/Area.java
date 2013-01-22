package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.StandardAttributesTag;

/**
 * The &lt;area&gt; tag defines an area inside an image-map (an image-map is an image with clickable areas).<br />
 * <br />
 * he area element is always nested inside a &lt;map&gt; tag.<br />
 * <br />
 * <b>Note:</b> The usemap attribute in the &lt;img&gt; tag is associated with the map element's name
 * attribute, and creates a relationship between the image and the map.
 *
 * @author Daniel Johansson
 * @since 25 Feb 2010
 */
public class Area extends StandardAttributesTag<Area> {

    public Area() {
        super("area");
    }

    /**
     * Specifies an alternate text for the area. Required if the href attribute is present.
     * Use ONLY if the href attribute is present.
     *
     * @param alt text
     * @return this
     */
    public Area alt(final String alt) {
        attribute("alt", alt);
        return this;
    }

    /**
     * Specifies the coordinates for the clickable area.<br />
     * <br />
     * if shape="rect" then coords="left,top,right,bottom"<br />
     * <br />
     * if shape="circ" then coords="centerx,centery,radius"<br />
     * <br />
     * if shape="poly" then coords="x1,y1,x2,y2,..,xn,yn"
     *
     * @param coords see above
     * @return this
     */
    public Area coords(final String coords) {
        attribute("coords", coords);
        return this;
    }

    /**
     * Specifies the target URL of the area.
     *
     * @param href URL
     * @return this
     */
    public Area href(final String href) {
        attribute("href", href);
        return this;
    }

    /**
     * Specifies the base language of the target URL. Use only if the href attribute is present.
     *
     * @param hreflang language_code
     * @return this
     */
    public Area hreflang(final String hreflang) {
        attribute("hreflang", hreflang);
        return this;
    }

    /**
     * Specifies the mediatype of the target URL. Default value: all. Use only if the href attribute is present.
     *
     * @param media query
     * @return this
     */
    public Area media(final String media) {
        attribute("media", media);
        return this;
    }

    /**
     * Space separated list of URL's that gets notified when a user follows the hyperlink.
     * Use only if the href attribute is present.
     *
     * @param ping URL
     * @return this
     */
    public Area ping(final String ping) {
        attribute("ping", ping);
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
    public Area rel(final String rel) {
        attribute("rel", rel);
        return this;
    }

    /**
     * Defines the shape of the area.<br />
     * <br />
     * <ul>
     * <li>rect</li>
     * <li>rectangle</li>
     * <li>circ</li>
     * <li>circle</li>
     * <li>poly</li>
     * <li>polygon</li>
     * </ul>
     *
     * @param shape see list above
     * @return this
     */
    public Area shape(final String shape) {
        attribute("shape", shape);
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
    public Area target(final String target) {
        attribute("target", target);
        return this;
    }

    /**
     * Specifies the MIME (Multipurpose Internet Mail Extensions) type of the target URL.
     * Use only if the href attribute is present.
     *
     * @param type mime_type
     * @return this
     */
    public Area type(final String type) {
        attribute("type", type);
        return this;
    }
}
