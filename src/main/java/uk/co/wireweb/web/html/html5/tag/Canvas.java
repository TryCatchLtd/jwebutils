package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.StandardAttributesTag;

/**
 * The &lt;canvas&gt; tag is used to display graphics.<br />
 * <br />
 * The &lt;canvas&gt; tag is only a container for graphics, you must use a script to actually paint graphics.<br />
 * <br />
 * This tag is new to HTML5.
 *
 * @author Daniel Johansson
 * @since 12 May 2010
 */
public class Canvas extends StandardAttributesTag<Canvas> {

    public Canvas() {
        super("canvas");
    }

    /**
     * Sets the height of the canvas.
     *
     * @param height pixels
     * @return this
     */
    public Canvas height(final String height) {
        attribute("height", height);
        return this;
    }

    /**
     * Sets the width of the canvas.
     *
     * @param width pixels
     * @return this
     */
    public Canvas width(final String width) {
        attribute("width", width);
        return this;
    }
}
