package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.StandardAttributesTag;

/**
 * The &lt;meta&gt; element provides meta-information about your page, such as descriptions
 * and keywords for search engines and refresh rates.
 *
 * @author Daniel Johansson
 * @since 25 May 2010
 */
public class Meta extends StandardAttributesTag<Meta> {

    public Meta() {
        super("meta");
    }

    /**
     * Defines the character encoding for the document.
     *
     * @param charset character encoding
     * @return this
     */
    public Meta charset(final String charset) {
        attribute("charset", charset);
        return this;
    }

    /**
     * Defines meta information to be associated with http-equiv or name.
     *
     * @param content some text
     * @return this
     */
    public Meta content(final String content) {
        attribute("content", content);
        return this;
    }

    /**
     * Connects the content attribute to an HTTP header.
     *
     * @param httpEquiv content-type, expires, refresh, set-cookie
     * @return this
     */
    public Meta httpEquiv(final String httpEquiv) {
        attribute("http-equiv", httpEquiv);
        return this;
    }

    /**
     * Connects the content attribute to a name.
     *
     * @param name author, description, keywords, generator, revised, <i>others</i>
     * @return this
     */
    public Meta name(final String name) {
        attribute("name", name);
        return this;
    }
}
