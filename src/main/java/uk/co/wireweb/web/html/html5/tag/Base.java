package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.Tag;

/**
 * The &lt;base&gt; tag specifies a default URL, and/or a default target, for all elements with a
 * URL (hyperlinks, images, forms, etc.).<br />
 * <br />
 * The &lt;base&gt; tag must go inside the head element.
 *
 * @author Daniel Johansson
 * @since 11 May 2010
 */
public class Base extends Tag<Base> {

    public Base() {
        super("base");
    }

    /**
     * Specifies the URL to use as the base URL for links in the page.
     *
     * @param href URL
     * @return this
     */
    public Base href(final String href) {
        attribute("href", href);
        return this;
    }

    /**
     * Where to open all the links on the page. This attribute can be overridden by using the target attribute in each link.<br />
     * <br />
     * <ul>
     * <li><b>_blank</b> - all the links will open in new windows</li>
     * <li><b>_self</b> - all the links will open in the same frame they where clicked</li>
     * <li><b>_parent</b> - all the links will open in the parent frameset</li>
     * <li><b>_top</b> - all the links will open in the full body of the window</li>
     * </ul>
     *
     * @param target see list above
     * @return this
     */
    public Base target(final String target) {
        attribute("target", target);
        return this;
    }
}
