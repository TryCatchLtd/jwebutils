package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.FormEventsTag;

/**
 * The &lt;ol&gt; tag defines the start of an ordered list.<br />
 * <br />
 * Use together with the &lt;li&gt; tag to define list items.
 *
 * @author Daniel Johansson
 * @since 3 Jun 2010
 */
public class Ol extends FormEventsTag<Ol> {

    public Ol() {
        super("ol");
    }

    /**
     * If present the list order should be descending (9,8,7...), if not present, the list order should be ascending (1,2,3...)
     *
     * @param reversed reversed
     * @return this
     */
    public Ol reversed(final String reversed) {
        attribute("reversed", reversed);
        return this;
    }

    /**
     * Specifies the number the list order should start on.
     *
     * @param start number
     * @return this
     */
    public Ol start(final String start) {
        attribute("start", start);
        return this;
    }
}
