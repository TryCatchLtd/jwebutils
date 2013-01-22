package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.FormEventsTag;

/**
 * The &lt;em&gt;, &lt;strong&gt;, &lt;dfn&gt;, &lt;code&gt;, &lt;samp&gt;, &lt;kbd&gt;, &lt;var&gt;, and &lt;cite&gt;
 * tags are all phrase tags. They are not deprecated, but it is possible to achieve richer effect with CSS.<br />
 * <br />
 * <table border="1" cellspacing="0">
 * <tr>
 * <td><b>Tag</b></td>
 * <td><b>Description</b></td>
 * </tr>
 * <tr>
 * <td>&lt;em&gt;</td>
 * <td>Renders as emphasized text</td>
 * </tr>
 * <tr>
 * <td>&lt;strong&gt;</td>
 * <td>Defines important text</td>
 * </tr>
 * <tr>
 * <td>&lt;dfn&gt;</td>
 * <td>Defines a definition term</td>
 * </tr>
 * <tr>
 * <td>&lt;code&gt;</td>
 * <td>Defines computer code text</td>
 * </tr>
 * <tr>
 * <td>&lt;samp&gt;</td>
 * <td>Defines sample computer code</td>
 * </tr>
 * <tr>
 * <td>&lt;kbd&gt;</td>
 * <td>Defines keyboard text</td>
 * </tr>
 * <tr>
 * <td>&lt;var&gt;</td>
 * <td>Defines a variable</td>
 * </tr>
 * <tr>
 * <td>&lt;cite&gt;</td>
 * <td>Defines a citation</td>
 * </tr>
 * </table>
 *
 * @author Daniel Johansson
 * @since 12 May 2010
 */
public class Kbd extends FormEventsTag<Kbd> {

    public Kbd() {
        super("kbd");
    }
}
