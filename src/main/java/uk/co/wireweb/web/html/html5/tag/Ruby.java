package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.FormEventsTag;

/**
 * The &lt;ruby&gt; tag defines a ruby annotation (Chinese notes or characters).<br />
 * <br />
 * Used in East Asia, to show the pronunciation of East Asian characters.<br />
 * <br />
 * Use together with the &lt;rt&gt; and/or the &lt;rp&gt; tags:<br />
 * <br />
 * The ruby element consists of one or more characters (that needs an explanation/pronunciation), and a rt element that
 * gives that information, and optionally a rp element that defines what to show browsers that do not support the "ruby" tag.
 *
 * @author Daniel Johansson
 * @since 3 Jun 2010
 */
public class Ruby extends FormEventsTag<Ruby> {

    public Ruby() {
        super("ruby");
    }
}
