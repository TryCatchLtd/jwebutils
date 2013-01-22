package uk.co.wireweb.web.css.css3;

import uk.co.wireweb.web.css.Css;

/**
 * Background.
 *
 * @author Daniel Johansson
 * @since 8 Mar 2010
 */
public class Background extends Css<Background> {

    /**
     * The background-color property sets the background color of an element.<br />
     * <br />
     * The background of an element is the total size of the element, including padding and border (but not the margin).
     *
     * @param color the color
     * @return this
     */
    public Background color(final String color) {
        property("background-color", color);
        return this;
    }

    /**
     * The background-image property sets the background image for an element.<br />
     * <br />
     * The background of an element is the total size of the element, including padding and border (but not the margin).<br />
     * <br />
     * By default, a background-image is placed at the top-left corner of an element, and repeated both vertically and horizontally.
     *
     * @param image the image
     * @return this
     */
    public Background image(final String image) {
        property("background-image", image);
        return this;
    }

    /**
     * The background-repeat property sets if/how a background image will be repeated.<br />
     * <br />
     * By default, a background-image is repeated both vertically and horizontally.
     *
     * @param repeat the repeat
     * @return this
     */
    public Background repeat(final String repeat) {
        property("background-repeat", repeat);
        return this;
    }

    /**
     * The background-attachment property sets whether a background image is fixed or scrolls with the rest of the page.
     *
     * @param attachment the attachment
     * @return this
     */
    public Background attachment(final String attachment) {
        property("background-attachment", attachment);
        return this;
    }

    /**
     * The background-position property sets the starting position of a background image.<br />
     * <br />
     * <b>Note:</b> For this to work in Firefox and Opera, the background-attachment property must be set to "fixed".
     *
     * @param position the position
     * @return this
     */
    public Background position(final String position) {
        property("background-position", position);
        return this;
    }
}
