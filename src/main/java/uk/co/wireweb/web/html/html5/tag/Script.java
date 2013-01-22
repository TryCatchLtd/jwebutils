package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.StandardAttributesTag;

/**
 * The &lt;script&gt; tag is used to define a client-side script, such as a JavaScript.<br />
 * <br />
 * The script element either contains scripting statements or it points to an external script file through the src attribute.<br />
 * <br />
 * The required type attribute specifies the MIME type of the script.<br />
 * <br />
 * Common uses for JavaScript are image manipulation, form validation, and dynamic changes of content.<br />
 * <br />
 * <b>Note:</b> There are ways a script can be executed:<br />
 * <br />
 * The async attribute is "true": The script will be executed asynchrously with the rest of the page, so the script will be executed while the page continues the parsing.<br />
 * <br />
 * The async attribute is "false", but the defer attribute is "true": The script will be executed when the page is finished with the parsing.<br />
 * <br />
 * Both the async attribute and the defer attribute is "false": The script will be executed immediately, and the page will wait for the script to finish before continuing the parsing.<br />
 * <br />
 * <b>Tip:</b> If there is a src attribute, the &lt;script&gt; element must be empty.
 *
 * @author Daniel Johansson
 * @since 25 Feb 2010
 */
public class Script extends StandardAttributesTag<Script> {

    public Script() {
        super("script");
        body("");
    }

    /**
     * Defines if the script should be executed asynchronously or not.
     *
     * @param async async
     * @return this
     */
    public Script async(final String async) {
        attribute("async", async);
        return this;
    }

    /**
     * Indicates the MIME type of the script<br />
     * <br />
     * <ul>
     * <li>text/ecmascript</li>
     * <li>text/javascript</li>
     * <li>application/ecmascript</li>
     * <li>application/javascript</li>
     * <li>text/vbscript</li>
     * </ul>
     *
     * @param type see list above
     * @return this
     */
    public Script type(final String type) {
        attribute("type", type);
        return this;
    }

    /**
     * Defines the character encoding used in script. Not supported..
     *
     * @param charset charset
     * @return this
     */
    public Script charset(final String charset) {
        attribute("charset", charset);
        return this;
    }

    /**
     * Indicates that the script is not going to generate any document content.
     * The browser can continue parsing and drawing the page.
     *
     * @param defer defer
     * @return this
     */
    public Script defer(final String defer) {
        attribute("defer", defer);
        return this;
    }

    /**
     * Defines a URL to a file that contains the script (instead of inserting the script
     * into your HTML document, you can refer to a file that contains the script).
     *
     * @param src URL
     * @return this
     */
    public Script src(final String src) {
        attribute("src", src);
        return this;
    }
}
