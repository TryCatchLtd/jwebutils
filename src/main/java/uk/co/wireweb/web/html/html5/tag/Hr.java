package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.FormEventsTag;

/**
 * The &lt;hr&gt; tag inserts a horizontal rule, which should define a thematic change in the content.<br />
 * <br />
 * You should use CSS to style the hr element.
 *
 * @author Daniel Johansson
 * @since 13 May 2010
 */
public class Hr extends FormEventsTag<Hr> {

    public Hr() {
        super("hr", true);
    }
}
