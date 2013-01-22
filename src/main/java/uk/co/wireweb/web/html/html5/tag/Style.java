package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.Tag;

/**
 * The &lt;style&gt; tag is used to define style information for an HTML document.<br />
 * <br />
 * In the style element you specify how HTML elements should render in a browser.
 *
 * @author Daniel Johansson
 * @since 8 Mar 2010
 */
public class Style extends Tag<Style> {

    public Style() {
        super("style");
    }

    /**
     * Defines the content-type.
     *
     * @param type text/css
     * @return this
     */
    public Style type(final String type) {
        attribute("type", type);
        return this;
    }

    /**
     * The destination medium for the style information.<br />
     * <br />
     * Below is a list of available mediums.<br />
     * <br />
     * <ul>
     * <li>screen</li>
     * <li>tty</li>
     * <li>tv</li>
     * <li>projection</li>
     * <li>handheld</li>
     * <li>print</li>
     * <li>braille</li>
     * <li>aural</li>
     * <li>all</li>
     * </ul>
     *
     * @param media see list above
     * @return this
     */
    public Style media(final String media) {
        attribute("media", media);
        return this;
    }

    /**
     * If present, the styles should ONLY apply to the style elements parent element and its child elements.
     *
     * @param scoped scoped
     * @return this
     */
    public Style scoped(final String scoped) {
        attribute("scoped", scoped);
        return this;
    }
}
