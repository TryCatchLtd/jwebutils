package uk.co.wireweb.web.utility;

import junit.framework.Assert;
import org.junit.Test;

/**
 * ColorUtilsTest.
 *
 * @author Daniel Johansson
 * @since 26 Mar 2010
 */
public class ColorUtilsTest {

    @Test
    public void testRgbToHex() {
        final String whiteHex = ColorUtils.rgbToHex(255, 255, 255);
        final String redHex = ColorUtils.rgbToHex(255, 0, 0);
        final String greenHex = ColorUtils.rgbToHex(0, 255, 0);
        final String blueHex = ColorUtils.rgbToHex(0, 0, 255);
        final String blackHex = ColorUtils.rgbToHex(0, 0, 0);
        final String superBlackHex = ColorUtils.rgbToHex(-1, -1, -1);
        final String superWhiteHex = ColorUtils.rgbToHex(344, 344, 666);

        Assert.assertEquals("ffffff", superWhiteHex);
        Assert.assertEquals("ffffff", whiteHex);
        Assert.assertEquals("ff0000", redHex);
        Assert.assertEquals("00ff00", greenHex);
        Assert.assertEquals("0000ff", blueHex);
        Assert.assertEquals("000000", blackHex);
        Assert.assertEquals("000000", superBlackHex);
    }

    @Test
    public void testHexToRgb() {
        Assert.assertEquals(255, ColorUtils.hexToRgb("f00").getRed());
        Assert.assertEquals(255, ColorUtils.hexToRgb("ff0000").getRed());
        Assert.assertEquals(255, ColorUtils.hexToRgb("0f0").getGreen());
        Assert.assertEquals(255, ColorUtils.hexToRgb("00ff00").getGreen());
        Assert.assertEquals(255, ColorUtils.hexToRgb("00f").getBlue());
        Assert.assertEquals(255, ColorUtils.hexToRgb("0000ff").getBlue());
        Assert.assertEquals(175, ColorUtils.hexToRgb("0000af").getBlue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHexToRgbNull() {
        ColorUtils.hexToRgb(null);
        ColorUtils.hexToRgb("ffff");
    }
}
