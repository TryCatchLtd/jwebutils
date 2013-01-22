package uk.co.wireweb.web.html.html5;

import junit.framework.Assert;
import org.junit.Test;
import uk.co.wireweb.web.html.html5.tag.Div;

/**
 * DivTest.
 *
 * @author Daniel Johansson
 * @since 11 Feb 2010
 */
public class DivTest {

    @Test
    public void testTag() {
        final String test1 = "<div id=\"test1\">test1 body</div>";

        final Div div = new Div();
        div.id("test1");
        div.body("test1 body");

        Assert.assertEquals(test1, div.toString());
    }
}
