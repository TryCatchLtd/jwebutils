package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.Tag;

/**
 * The &lt;noscript&gt; element is used to define an alternate content (text) if a script is NOT executed.<br />
 * <br />
 * The &lt;noscript&gt; element does nothing, but is used for browsers that recognizes the &lt;script&gt; tag, but does not support the script in it.<br />
 * <br />
 * <b>Note:</b> If a browser supports scripting, it will not display the text in the noscript element.<br />
 * <br />
 * <b>Note:</b> Browsers that do not recognize the &lt;script&gt; tag will display the tag's content as text on the page.
 * To prevent the browser from doing this, you should hide the script in comment tags. An old browser (one
 * that does not recognize the &lt;script&gt; tag) will ignore the comment and will not write the tag's content on
 * the page, while a new browser will understand that the script should be executed, even if it is surrounded
 * by comment tags!
 *
 * @author Daniel Johansson
 * @since 25 May 2010
 */
public class Noscript extends Tag<Noscript> {
    public Noscript() {
        super("noscript");
    }
}
