package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.StandardAttributesTag;

/**
 * The &lt;colgroup&gt; tag is used to group columns in a table for formatting.<br />
 * <br />
 * The &lt;colgroup&gt; tag is useful for applying styles to entire columns, instead of repeating the styles for each cell, for each row.<br />
 * <br />
 * The &lt;colgroup&gt; tag can only be used inside a table element.
 *
 * @author Daniel Johansson
 * @since 12 May 2010
 */
public class Colgroup extends StandardAttributesTag<Colgroup> {
    public Colgroup() {
        super("colgroup");
    }

    /**
     * Defines the number of columns the column group should span.
     *
     * @param span number
     * @return this
     */
    public Colgroup span(final String span) {
        attribute("span", span);
        return this;
    }
}
