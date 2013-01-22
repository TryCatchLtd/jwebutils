package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.FormEventsTag;

/**
 * The &lt;tfoot&gt; tag is used to group the footer content in an HTML table.<br />
 * <br />
 * The tfoot element should be used in conjunction with the thead and tbody elements.<br />
 * <br />
 * The thead element is used to group the header content in an HTML table and the tbody element is used to group the body content in an HTML table.<br />
 * <br />
 * Note: &lt;tfoot&gt; must appear before &lt;tbody&gt; within a table, so that a browser can render the foot before receiving all the rows of data.<br />
 * <br />
 * Notice that these elements will not affect the layout of the table by default. However, you can use CSS to let these elements affect the table's layout.<br />
 *
 * @author Daniel Johansson
 * @since 3 Jun 2010
 */
public class Tfoot extends FormEventsTag<Tfoot> {

    public Tfoot() {
        super("tfoot");
    }
}
