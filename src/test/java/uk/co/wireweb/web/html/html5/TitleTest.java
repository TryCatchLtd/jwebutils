package uk.co.wireweb.web.html.html5;

import junit.framework.Assert;
import org.junit.Test;
import uk.co.wireweb.web.html.html5.tag.Title;

/**
 * TitleTest.
 *
 * @author Daniel Johansson
 * @since 26 Feb 2010
 */
public class TitleTest {

    @Test
    public void test() {
        Assert.assertEquals("<title class=\"style\" />", new Title().styleClass("style").toString());
    }
}
