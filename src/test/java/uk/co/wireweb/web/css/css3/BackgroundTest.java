package uk.co.wireweb.web.css.css3;

import junit.framework.Assert;
import org.junit.Test;

/**
 * BackgroundTest.
 *
 * @author Daniel Johansson
 * @since 8 Mar 2010
 */
public class BackgroundTest {

    @Test
    public void testBackground() {
        final Background background = new Background().color("#ffffff");
        Assert.assertEquals("background-color: #ffffff;", background.toString());

        background.image("url('test.jpg')");
        Assert.assertEquals("background-color: #ffffff;background-image: url('test.jpg');", background.toString());

        background.position("center");
        Assert.assertEquals("background-color: #ffffff;background-position: center;background-image: url('test.jpg');", background.toString());

        background.attachment("fixed");
        Assert.assertEquals("background-attachment: fixed;background-color: #ffffff;background-position: center;background-image: url('test.jpg');", background.toString());

        background.repeat("no-repeat");
        Assert.assertEquals("background-attachment: fixed;background-color: #ffffff;background-repeat: no-repeat;background-position: center;background-image: url('test.jpg');", background.toString());
    }
}
