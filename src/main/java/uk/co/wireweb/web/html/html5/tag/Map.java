package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.FormEventsTag;

/**
 * The &lt;map&gt; tag is used to define a client-side image-map. An image-map is an image with clickable areas.<br />
 * <br />
 * The name attribute is required in the map element. This attribute is associated with the &lt;img&gt;'s usemap
 * attribute and creates a relationship between the image and the map.<br />
 * <br />
 * The map element contains a number of area elements, that defines the clickable areas in the image map.
 *
 * @author Daniel Johansson
 * @since 25 May 2010
 */
public class Map extends FormEventsTag<Map> {

    public Map() {
        super("map");
    }

    /**
     * Defines a unique name for the map tag, so it can be referred to.
     *
     * @param name unique name
     * @return this
     */
    public Map name(final String name) {
        this.attribute("name", name);
        return this;
    }
}
