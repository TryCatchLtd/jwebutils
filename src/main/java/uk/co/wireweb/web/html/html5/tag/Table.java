package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.FormEventsTag;

/**
 * The &lt;table&gt; tag defines an HTML table.<br />
 * <br />
 * A simple HTML table consists of the table element and one or more tr, th, and td elements.<br />
 * <br />
 * The tr element defines a table row, the th element defines a table header, and the td element defines a table cell.<br />
 * <br />
 * A more complex HTML table may also include caption, col, colgroup, thead, tfoot, and tbody elements.
 *
 * @author Daniel Johansson
 * @since 3 Jun 2010
 */
public class Table extends FormEventsTag<Table> {

    public Table() {
        super("table");
    }

    /**
     * Specifies a summary of the content of a table.
     *
     * @param summary text
     * @return this
     */
    public Table summary(final String summary) {
        attribute("summary", summary);
        return this;
    }
}
