package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.FormEventsTag;

/**
 * The &lt;th&gt; tag defines a header cell in an HTML table.<br />
 * <br />
 * An HTML table has two kinds of cells:<br />
 * <ul>
 * <li>Header cells - contains header information (created with the th element)</li>
 * <li>Standard cells - contains data (created with the td element)</li>
 * </ul>
 * The text in a th element is often bold and centered.<br />
 * <br />
 * The text in a td element is often left-aligned.<br />
 *
 * @author Daniel Johansson
 * @since 3 Jun 2010
 */
public class Th extends FormEventsTag<Th> {

    public Th() {
        super("th");
    }

    /**
     * Indicates the number of columns this cell should span.
     *
     * @param colspan number
     * @return this
     */
    public Th colspan(final String colspan) {
        attribute("colspan", colspan);
        return this;
    }

    /**
     * A space-separated list of cell IDs that supply header information for the cell. This attribute allows text-only
     * browsers to render the header information for a given cell.
     *
     * @param headers header cell id's
     * @return this
     */
    public Th headers(final String headers) {
        attribute("headers", headers);
        return this;
    }

    /**
     * Indicates the number of rows this cell should span.
     *
     * @param rowspan number
     * @return this
     */
    public Th rowspan(final String rowspan) {
        attribute("rowspan", rowspan);
        return this;
    }

    /**
     * Specifies if this cell provides header information for the rest of the row that contains it (row), or for the rest
     * of the column (col), or for the rest of the row group that contains it (rowgroup), or for the rest of the column
     * group that contains it.<br />
     * <br />
     * <ul>
     * <li>col</li>
     * <li>colgroup</li>
     * <li>row</li>
     * <li>rowgroup</li>
     * </ul>
     *
     * @param scope see list above
     * @return this
     */
    public Th scope(final String scope) {
        attribute("scope", scope);
        return this;
    }
}
