package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.FormEventsTag;

/**
 * The &lt;rp&gt; tag is used in ruby annotations, to define what to show browsers that do not support the ruby element.<br />
 * <br />
 * A ruby annotation is Chinese notes or characters.<br />
 * <br />
 * Used in East Asia, to show the pronunciation of East Asian characters.<br />
 * <br />
 * Use together with the &lt;ruby&gt; and the &lt;rt&gt; tags:<br />
 * <br />
 * The ruby element consists of one or more characters (that needs an explanation/pronunciation), and a rt element that gives
 * that information, and optionally a rp element that defines what to show browsers that do not support the "ruby" tag.
 *
 * @author Daniel Johansson
 * @since 3 Jun 2010
 */
public class Rp extends FormEventsTag<Rp> {
    public Rp() {
        super("rp");
    }
}
