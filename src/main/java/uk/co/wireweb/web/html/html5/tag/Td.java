package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.FormEventsTag;

/**
 * The <td> tag defines a standard cell in an HTML table.<br />
 * <br />
 * An HTML table has two kinds of cells:<br />
 * <br />
 * Header cells - contains header information (created with the th element)<br />
 * Standard cells - contains data (created with the td element)<br />
 * The text in a th element is bold and centered.<br />
 * <br />
 * The text in a td element is regular and left-aligned.
 *
 * @author Daniel Johansson
 * @since 3 Jun 2010
 */
public class Td extends FormEventsTag<Td> {

    public Td() {
        super("td");
    }

    /**
     * Indicates the number of columns this cell should span.
     *
     * @param colspan number
     * @return this
     */
    public Td colspan(final String colspan) {
        attribute("colspan", colspan);
        return this;
    }

    /**
     * A space-separated list of cell IDs that supply header information for the cell. This attribute allows text-only
     * browsers to render the header information for a given cell.
     *
     * @param headers header cells id's
     * @return this
     */
    public Td headers(final String headers) {
        attribute("headers", headers);
        return this;
    }

    /**
     * Indicates the number of rows this cell should span.
     *
     * @param rowspan number
     * @return this
     */
    public Td rowspan(final String rowspan) {
        attribute("rowspan", rowspan);
        return this;
    }
}
