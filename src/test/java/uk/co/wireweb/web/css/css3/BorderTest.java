package uk.co.wireweb.web.css.css3;

import junit.framework.Assert;
import org.junit.Test;

/**
 * BorderTest.
 *
 * @author Daniel Johansson
 * @since 18 Mar 2010
 */
public class BorderTest {

    @Test
    public void testBorders() {
        Assert.assertEquals("border: 1px solid red;", new Border().border("1px solid red").toString());
        Assert.assertEquals("border: 10px solid #000000;", new Border().border("10px solid #000000").toString());
    }

    @Test
    public void testBorderStyle() {
        Assert.assertEquals("border-style: dotted solid double dashed;", new Border().borderStyle("dotted solid double dashed").toString());
    }
}
