package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.StandardAttributesTag;

/**
 * The &lt;col&gt; tag defines attribute values for one or more columns in a table.<br />
 * <br />
 * The &lt;col&gt; tag is useful for applying styles to entire columns, instead of repeating the styles for each cell, for each row.<br />
 * <br />
 * The &lt;col&gt; tag can only be used inside a table or a colgroup element.
 *
 * @author Daniel Johansson
 * @since 12 May 2010
 */
public class Col extends StandardAttributesTag<Col> {

    public Col() {
        super("col");
    }

    /**
     * Defines the number of columns the &lt;col&gt; should span.
     *
     * @param span number
     * @return this
     */
    public Col span(final String span) {
        attribute("span", span);
        return this;
    }
}
