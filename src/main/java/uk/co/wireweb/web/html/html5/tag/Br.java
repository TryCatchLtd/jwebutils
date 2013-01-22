package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.StandardAttributesTag;

/**
 * The &lt;br&gt; tag inserts a single line break.<br />
 * <br />
 * The  &lt;br&gt; tag is an empty tag which means that it has no end tag.
 *
 * @author Daniel Johansson
 * @since 24 Feb 2010
 */
public class Br extends StandardAttributesTag<Br> {

    public Br() {
        super("br", true);
    }
}
