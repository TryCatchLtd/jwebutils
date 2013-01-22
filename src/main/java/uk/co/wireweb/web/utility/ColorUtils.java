package uk.co.wireweb.web.utility;

import java.awt.*;

/**
 * ColorUtils.
 *
 * @author Daniel Johansson
 * @since 26 Mar 2010
 */
public class ColorUtils {

    /**
     * Converts a hex character into its integer representative.<br />
     * <br />
     * Examples:<br />
     * f = 15<br />
     * a = 10<br />
     * 8 = 8<br />
     * <br />
     *
     * @param hex the hex character (f)
     * @return the hex as an int
     */
    public static int hexToInt(final char hex) {
        return Integer.decode("0x" + hex);
    }

    /**
     * Converts a 3 or 6 character length hex into a {@link Color} object with red, green and blue values on it.<br />
     * <br />
     *
     * @param hex the hex (fff) or (ffffff)
     * @return {@link Color}
     * @throws IllegalArgumentException if the hex string is either null or not 3 or 6 characters long.
     */
    public static Color hexToRgb(final String hex) throws IllegalArgumentException {
        if (hex == null || (hex.length() != 3 && hex.length() != 6)) {
            throw new IllegalArgumentException("The hex string needs to be  either 3 or 6 characters");
        }

        String modifiedHex = hex;

        // Sanitize the 3 length hex
        if (modifiedHex.length() == 3) {
            final char r = modifiedHex.charAt(0);
            final char g = modifiedHex.charAt(1);
            final char b = modifiedHex.charAt(2);

            modifiedHex = Character.toString(r) + Character.toString(r) + Character.toString(g) + Character.toString(g) + Character.toString(b) + Character.toString(b);
        }

        final int red = (hexToInt(modifiedHex.charAt(0)) * 16) + hexToInt(modifiedHex.charAt(1));
        final int green = (hexToInt(modifiedHex.charAt(2)) * 16) + hexToInt(modifiedHex.charAt(3));
        final int blue = (hexToInt(modifiedHex.charAt(4)) * 16) + hexToInt(modifiedHex.charAt(5));

        return new Color(red, green, blue);
    }

    /**
     * Converts red, green and blue values into a hex string usable in HTML.<br />
     * <br />
     * The hex string will not be prefixed with a hash sign (#)<br />
     * <br />
     *
     * @param red   the red int
     * @param green the green int
     * @param blue  the blue int
     * @return the hex representation of red, green and blue passed in.
     */
    public static String rgbToHex(final int red, final int green, final int blue) {
        int r = red;
        int g = green;
        int b = blue;

        // Sanitize the red value
        if (r > 255) {
            r = 255;
        } else if (r < 0) {
            r = 0;
        }

        // Sanitize the green value
        if (g > 255) {
            g = 255;
        } else if (g < 0) {
            g = 0;
        }

        // Sanitize the blue value
        if (b > 255) {
            b = 255;
        } else if (b < 0) {
            b = 0;
        }

        final Color color = new Color(r, g, b);
        final StringBuilder stringBuilder = new StringBuilder(Integer.toHexString(color.getRGB() & 0x00ffffff));

        // Zero pad the hex if need be
        if (stringBuilder.length() < 6) {
            final int paddingNeeded = 6 - stringBuilder.length();

            for (int i = 0; i < paddingNeeded; ++i) {
                stringBuilder.insert(0, '0');
            }
        }

        return stringBuilder.toString();
    }

    private ColorUtils() {

    }
}
