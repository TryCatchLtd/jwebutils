package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.StandardAttributesTag;

/**
 * The &lt;span&gt; tag is used to group inline-elements in a document.<br />
 * <br />
 * The &lt;span&gt; tag provides no visual change by itself.<br />
 * <br />
 * The &lt;span&gt; tag provides a way to add a hook to a part of a text or a part of a document.<br />
 * <br />
 * When the text is hooked in a span element you can add styles to the content, or manipulate
 * the content with for example JavaScript.
 *
 * @author Daniel Johansson
 * @since 11 Feb 2010
 */
public class Span extends StandardAttributesTag<Span> {

    public Span() {
        super("span");
    }
}
