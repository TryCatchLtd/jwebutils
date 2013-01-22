package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.StandardAttributesTag;

/**
 * The head element is a container for all the head elements. Elements
 * inside &lt;head&gt; can include scripts, instruct the browser where to
 * find style sheets, provide meta information, and more.<br />
 * <br />
 * The following tags can be added to the head section: &lt;base&gt;, &lt;link&gt;, &lt;meta&gt;, &lt;script&gt;, &lt;style&gt;, and &lt;title&gt;.
 *
 * @author Daniel Johansson
 * @since 24 Feb 2010
 */
public class Head extends StandardAttributesTag<Head> {

    public Head() {
        super("head");
    }
}
