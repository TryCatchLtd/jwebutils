package uk.co.wireweb.web.html.html5;

import junit.framework.Assert;
import org.junit.Test;
import uk.co.wireweb.web.html.html5.tag.Abbr;

/**
 * AbbrTest.
 *
 * @author Daniel Johansson
 * @since 25 Feb 2010
 */
public class AbbrTest {

    @Test
    public void test() {
        Assert.assertEquals("<abbr />", new Abbr().toString());
    }
}
