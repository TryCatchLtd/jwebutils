package uk.co.wireweb.web.css.css3;

import uk.co.wireweb.web.css.Css;

/**
 * Border.
 *
 * @author Daniel Johansson
 * @since 17 Mar 2010
 */
public class Border extends Css<Border> {

    /**
     * The border shorthand property sets all the border properties in one declaration.<br />
     * <br />
     * The properties that can be set, are (in order): border-width, border-style, and border-color.<br />
     * <br />
     * It does not matter if one of the values above are missing, e.g. border:solid #ff0000; is allowed.
     *
     * @param border the width, style and color
     * @return this
     */
    public Border border(final String border) {
        property("border", border);
        return this;
    }

    /**
     * The border-color property sets the color of an element's four borders. This property can have from one
     * to four values.<br />
     * <br />
     * Examples:<br />
     * <br />
     * <ul>
     * <li>
     * <b>border-color:red green blue pink;</b>
     * <ul>
     * <li>top border is red</li>
     * <li>right border is green</li>
     * <li>bottom border is blue</li>
     * <li>left border is pink</li>
     * </ul>
     * </li>
     * <li>
     * <b>border-color:red green blue;</b>
     * <ul>
     * <li>top border is red</li>
     * <li>right and left borders are green</li>
     * <li>bottom border is blue</li>
     * </ul>
     * </li>
     * <li>
     * <b>border-color:dotted red green;</b>
     * <ul>
     * <li>top and bottom borders are red</li>
     * <li>right and left borders are green</li>
     * </ul>
     * </li>
     * <li>
     * <b>border-color:red;</b>
     * <ul>
     * <li>all four borders are red</li>
     * </ul>
     * </li>
     * </ul>
     * <br />
     * <b>Note:</b> Always declare the border-style property before the border-color property. An element
     * must have borders before you can change the color.<br />
     * <br />
     *
     * @param borderColor the color
     * @return this
     */
    public Border borderColor(final String borderColor) {
        property("border-color", borderColor);
        return this;
    }

    /**
     * The border-bottom shorthand property sets all the bottom border properties in one declaration.<br />
     * <br />
     * The properties that can be set, are (in order): border-bottom-width, border-bottom-style, and
     * border-bottom-color.<br />
     * <br />
     * It does not matter if one of the values above are missing, e.g. border-bottom:solid #ff0000; is allowed.
     *
     * @param borderBottom the width, style and color
     * @return this
     */
    public Border borderBottom(final String borderBottom) {
        property("border-bottom", borderBottom);
        return this;
    }

    /**
     * The border-bottom-color property sets the color of an element's bottom border.<br />
     * <br />
     * <b>Note:</b> Always declare the border-style property before the border-bottom-color property. An element
     * must have borders before you can change the color.
     *
     * @param borderBottomColor the color
     * @return this
     */
    public Border borderBottomColor(final String borderBottomColor) {
        property("border-bottom-color", borderBottomColor);
        return this;
    }

    /**
     * The border-bottom-style property sets the style of an element's bottom border.
     *
     * @param borderBottomStyle the style
     * @return this
     */
    public Border borderBottomStyle(final String borderBottomStyle) {
        property("border-bottom-style", borderBottomStyle);
        return this;
    }

    /**
     * The border-bottom-width property sets the width of an element's bottom border.<br />
     * <br />
     * <b>Note:</b> Always declare the border-style property before the border-bottom-width property. An element
     * must have borders before you can change the width.
     *
     * @param borderBottomWidth thin, medium, thick, <i>length</i>
     * @return this
     */
    public Border borderBottomWidth(final String borderBottomWidth) {
        property("border-bottom-width", borderBottomWidth);
        return this;
    }

    /**
     * The border-left shorthand property sets all the left border properties in one declaration.<br />
     * <br />
     * The properties that can be set, are (in order): border-left-width, border-left-style, and border-left-color.<br />
     * <br />
     * It does not matter if one of the values above are missing, e.g. border-left:solid #ff0000; is allowed.<br />
     * <br />
     *
     * @param borderLeft width, style and color
     * @return this
     */
    public Border borderLeft(final String borderLeft) {
        property("border-left", borderLeft);
        return this;
    }

    /**
     * The border-left-color property sets the color of an element's left border.<br />
     * <br />
     * <b>Note:<b/> Always declare the border-style property before the border-left-color property. An element
     * must have borders before you can change the color.<br />
     * <br />
     *
     * @param borderLeftColor color
     * @return this
     */
    public Border borderLeftColor(final String borderLeftColor) {
        property("border-left-color", borderLeftColor);
        return this;
    }

    /**
     * The border-left-style property sets the style of an element's left border.<br />
     * <br />
     *
     * @param borderLeftStyle style
     * @return this
     */
    public Border borderLeftStyle(final String borderLeftStyle) {
        property("border-left-style", borderLeftStyle);
        return this;
    }

    /**
     * The border-left-width property sets the width of an element's left border.<br />
     * <br />
     * <b>Note:</b> Always declare the border-style property before the border-left-width property. An element must
     * have borders before you can change the width.<br />
     * <br />
     *
     * @param borderLeftWidth thin, medium, thick, <i>length</i>
     * @return this
     */
    public Border borderLeftWidth(final String borderLeftWidth) {
        property("border-left-width", borderLeftWidth);
        return this;
    }

    /**
     * The border-right shorthand property sets all the right border properties in one declaration.<br />
     * <br />
     * The properties that can be set, are (in order): border-right-width, border-right-style, and border-right-color.<br />
     * <br />
     * It does not matter if one of the values above are missing, e.g. border-right:solid #ff0000; is allowed.<br />
     * <br />
     *
     * @param borderRight width, style and color
     * @return this
     */
    public Border borderRight(final String borderRight) {
        property("border-right", borderRight);
        return this;
    }

    /**
     * The border-right-color property sets the color of an element's right border.<br />
     * <br />
     * <b>Note:</b> Always declare the border-style property before the border-right-color property. An element must
     * have borders before you can change the color.<br />
     * <br />
     *
     * @param borderRightColor color
     * @return this
     */
    public Border borderRightColor(final String borderRightColor) {
        property("border-right-color", borderRightColor);
        return this;
    }

    /**
     * The border-right-style property sets the style of an element's right border.<br />
     * <br />
     *
     * @param borderRightStyle style
     * @return this
     */
    public Border borderRightStyle(final String borderRightStyle) {
        property("border-right-style", borderRightStyle);
        return this;
    }

    /**
     * he border-right-width property sets the width of an element's right border.<br />
     * <br />
     * <b>Note:</b> Always declare the border-style property before the border-right-width property. An element
     * must have borders before you can change the width.<br />
     * <br />
     *
     * @param borderRightWidth width
     * @return this
     */
    public Border borderRightWidth(final String borderRightWidth) {
        property("border-right-width", borderRightWidth);
        return this;
    }

    /**
     * The border-style property sets the style of an element's four borders. This property can have from
     * one to four values.<br />
     * <br />
     * Examples:<br />
     * <br />
     * <ul>
     * <li>
     * <b>border-style:dotted solid double dashed;</b>
     * <ul>
     * <li>top border is dotted/li>
     * <li>right border is solid</li>
     * <li>bottom border is double</li>
     * <li>left border is dashed</li>
     * </ul>
     * </li>
     * <li>
     * <b>border-style:dotted solid double;</b>
     * <ul>
     * <li>top border is dotted</li>
     * <li>right and left borders are solid</li>
     * <li>bottom border is double</li>
     * </ul>
     * </li>
     * <li>
     * <b>border-style:dotted solid;</b>
     * <ul>
     * <li>top and bottom borders are dotted</li>
     * <li>right and left borders are solid</li>
     * </ul>
     * </li>
     * <li>
     * <b>border-style:dotted;</b>
     * <ul>
     * <li>all four borders are dotted</li>
     * </ul>
     * </li>
     * </ul>
     * <br />
     *
     * @param borderStyle none, hidden, dotted, dashed, solid, double, groove, ridge, inset, outset
     * @return this
     */
    public Border borderStyle(final String borderStyle) {
        property("border-style", borderStyle);
        return this;
    }

    /**
     * The border-top shorthand property sets all the top border properties in one declaration.<br />
     * <br />
     * The properties that can be set, are (in order): border-top-width, border-top-style, and border-top-color.<br />
     * <br />
     * If one of the values above are missing, e.g. border-top:solid #ff0000, the default value for the
     * missing property will be inserted, if any.<br />
     * <br />
     *
     * @param borderTop width, style, color
     * @return this
     */
    public Border borderTop(final String borderTop) {
        property("border-top", borderTop);
        return this;
    }

    /**
     * The border-top-color property sets the color of an element's top border.<br />
     * <br />
     * <b>Note:</b> Always declare the border-style property before the border-top-color property. An element
     * must have borders before you can change the color.<br />
     * <br />
     *
     * @param borderTopColor the border top color
     * @return this
     */
    public Border borderTopColor(final String borderTopColor) {
        property("border-top-color", borderTopColor);
        return this;
    }

    /**
     * The border-top-style property is supported in all major browsers.<br />
     * <br />
     * <b>Note:</b> No versions of Internet Explorer (including IE8) support the property values "inherit" or "hidden".<br />
     * <br />
     *
     * @param borderTopStyle style
     * @return this
     */
    public Border borderTopStyle(final String borderTopStyle) {
        property("border-top-style", borderTopStyle);
        return this;
    }

    /**
     * The border-top-width property is supported in all major browsers.<br />
     * <br />
     * <b>Note:</b> No versions of Internet Explorer (including IE8) support the property values "inherit" or "hidden".<br />
     * <br />
     *
     * @param borderTopWidth width
     * @return this
     */
    public Border borderTopWidth(final String borderTopWidth) {
        property("border-top-width", borderTopWidth);
        return this;
    }

    /**
     * The border-width property sets the width of an element's four borders. This property can have from one
     * to four values.<br />
     * <br />
     * Examples:<br />
     * <br />
     * <ul>
     * <li>
     * <b>border-width:thin medium thick 10px;</b>
     * <ul>
     * <li>top border is thin/li>
     * <li>right border is medium</li>
     * <li>bottom border is thick</li>
     * <li>left border is 10px</li>
     * </ul>
     * </li>
     * <li>
     * <b>border-width:thin medium thick;</b>
     * <ul>
     * <li>top border is thin</li>
     * <li>right and left borders are medium</li>
     * <li>bottom border is thick</li>
     * </ul>
     * </li>
     * <li>
     * <b>border-width:thin medium;</b>
     * <ul>
     * <li>top and bottom borders are thin</li>
     * <li>right and left borders are medium</li>
     * </ul>
     * </li>
     * <li>
     * <b>border-width:thin;</b>
     * <ul>
     * <li>all four borders are thin</li>
     * </ul>
     * </li>
     * </ul>
     * <br />
     * <b>Note:</b> Always declare the border-style property before the border-width property. An element must have borders before you can change the color.<br />
     * <br />
     *
     * @param borderWidth the border width
     * @return this
     */
    public Border borderWidth(final String borderWidth) {
        property("border-width", borderWidth);
        return this;
    }

    /**
     * An outline is a line that is drawn around elements (outside the borders) to make the element "stand out".<br />
     * <br />
     * The outline shorthand property sets all the outline properties in one declaration.<br />
     * <br />
     * he properties that can be set, are (in order): outline-color, outline-style, outline-width.<br />
     * <br />
     * If one of the values above are missing, e.g. "outline:solid #ff0000;", the default value for the missing
     * property will be inserted, if any.<br />
     * <br />
     *
     * @param outline color, style and width
     * @return this
     */
    public Border outline(final String outline) {
        property("outline", outline);
        return this;
    }

    /**
     * An outline is a line that is drawn around elements (outside the borders) to make the element "stand out".<br />
     * <br />
     * The outline-color property specifies the color of an outline.<br />
     * <br />
     * <b>Note:</b> Always declare the outline-style property before the outline-color property. An element must
     * have an outline before you change the color of it.<br />
     * <br />
     *
     * @param outlineColor color
     * @return this
     */
    public Border outlineColor(final String outlineColor) {
        property("outline-color", outlineColor);
        return this;
    }

    /**
     * An outline is a line that is drawn around elements (outside the borders) to make the element "stand out".<br />
     * <br />
     * The outline-style property specifies the style of an outline.<br />
     * <br />
     *
     * @param outlineStyle style
     * @return this
     */
    public Border outlineStyle(final String outlineStyle) {
        property("outline-style", outlineStyle);
        return this;
    }

    /**
     * An outline is a line that is drawn around elements (outside the borders) to make the element "stand out".<br />
     * <br />
     * The outline-width specifies the width of an outline.<br />
     * <br />
     *
     * @param outlineWidth the ouline width
     * @return this
     */
    public Border outlineWidth(final String outlineWidth) {
        property("outline-width", outlineWidth);
        return this;
    }
}

