package uk.co.wireweb.web.html.html5;

import junit.framework.Assert;
import org.junit.Test;
import uk.co.wireweb.web.html.html5.tag.Img;

/**
 * ImgTest.
 *
 * @author Daniel Johansson
 * @since 24 Feb 2010
 */
public class ImgTest {

    @Test
    public void testTag() {
        final String test1 = "<img id=\"test1\" alt=\"test1 alternative text\" src=\"images/test1.jpg\" />";

        final Img img = new Img();
        img.id("test1");
        img.alt("test1 alternative text");
        img.body("this is the body"); // This should not do anything as img is a bodyless tag.
        img.src("images/test1.jpg");

        final Img img2 = new Img();
        img2.src("images/test1.jpg");
        img2.alt("test1 alternative text");
        img2.body("this is the body"); // This should not do anything as img is a bodyless tag.
        img2.id("test1");

        Assert.assertEquals(img.toString(), img2.toString());
        Assert.assertEquals(null, img.getBody());
        Assert.assertEquals(test1, img.toString());
    }
}
