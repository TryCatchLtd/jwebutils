package uk.co.wireweb.web.html.html5;

import junit.framework.Assert;
import org.junit.Test;
import uk.co.wireweb.web.html.html5.tag.Br;

/**
 * BrTest.
 *
 * @author Daniel Johansson
 * @since 24 Feb 2010
 */
public class BrTest {

    @Test
    public void brTest() {
        final Br br = new Br().body("This is the br body");

        Assert.assertEquals(null, br.getBody());
        Assert.assertEquals("<br />", br.toString());
    }
}
