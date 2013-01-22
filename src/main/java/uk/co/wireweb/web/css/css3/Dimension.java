package uk.co.wireweb.web.css.css3;

import uk.co.wireweb.web.css.Css;

/**
 * Dimension.
 *
 * @author Daniel Johansson
 * @since 17 Mar 2010
 */
public class Dimension extends Css<Dimension> {

    /**
     * The height property sets the height of an element.<br />
     * <br />
     * <b>Note:</b> The height property does not include padding, borders, or margins!<br />
     * <br />
     *
     * @param height height
     * @return this
     */
    public Dimension height(final String height) {
        property("height", height);
        return this;
    }

    /**
     * The max-height property sets the maximum height of an element.<br />
     * <br />
     * <b>Note:</b> The height property does not include padding, borders, or margins!<br />
     * <br />
     *
     * @param maxHeight height
     * @return this
     */
    public Dimension maxHeight(final String maxHeight) {
        property("max-height", maxHeight);
        return this;
    }

    /**
     * The max-width property sets the maximum width of an element.
     * <br />
     * <b>Note:</b> The height property does not include padding, borders, or margins!<br />
     * <br />
     *
     * @param maxWidth width
     * @return this
     */
    public Dimension maxWidth(final String maxWidth) {
        property("max-width", maxWidth);
        return this;
    }

    /**
     * The min-height property sets the minimum height of an element.<br />
     * <br />
     * <b>Note:</b> The height property does not include padding, borders, or margins!<br />
     * <br />
     *
     * @param minHeight height
     * @return this
     */
    public Dimension minHeight(final String minHeight) {
        property("min-height", minHeight);
        return this;
    }

    /**
     * The min-width property sets the minimum width of an element.<br />
     * <br />
     * <b>Note:</b> The height property does not include padding, borders, or margins!<br />
     * <br />
     *
     * @param minWidth width
     * @return this
     */
    public Dimension minWidth(final String minWidth) {
        property("min-width", minWidth);
        return this;
    }

    /**
     * The width property sets the width of an element.<br />
     * <br />
     * <b>Note:</b> The height property does not include padding, borders, or margins!<br />
     * <br />
     *
     * @param width the width
     * @return this
     */
    public Dimension width(final String width) {
        property("width", width);
        return this;
    }
}
