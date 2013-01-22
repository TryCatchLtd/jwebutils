package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.FormEventsTag;

/**
 * The &lt;li&gt; tag defines the start of a list item. The &lt;li&gt; tag is used in ordered lists(&lt;ol&gt;),  unordered lists (&lt;ul&gt;), and in menu lists (&lt;menu&gt;).
 *
 * @author Daniel Johansson
 * @since 25 May 2010
 */
public class Li extends FormEventsTag<Li> {

    public Li() {
        super("li");
    }

    /**
     * Defines the value of the first list item. Use only within the ol element.
     *
     * @param value number
     * @return this
     */
    public Li value(final String value) {
        attribute("value", value);
        return this;
    }
}
