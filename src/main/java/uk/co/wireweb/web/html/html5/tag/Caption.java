package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.StandardAttributesTag;

/**
 * The &lt;caption&gt; tag defines a table caption.<br />
 * <br />
 * The &lt;caption&gt; tag must be inserted immediately after the <table> tag.<b r/>
 * <br />
 * You can specify only one caption per table.<br />
 * <br />
 * Usually the caption will be centered above the table.
 *
 * @author Daniel Johansson
 * @since 12 May 2010
 */
public class Caption extends StandardAttributesTag<Caption> {

    public Caption() {
        super("caption");
    }
}
