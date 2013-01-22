package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.FormEventsTag;

/**
 * Object.
 *
 * @author Daniel Johansson
 * @since 25 May 2010
 */
public class Object extends FormEventsTag<Object> {

    public Object() {
        super("object");
    }

    /**
     * Defines a URL that refers to the object's data.
     *
     * @param data URL
     * @return this
     */
    public Object data(final String data) {
        attribute("data", data);
        return this;
    }

    /**
     * Defines one ore more forms the object belongs to.
     *
     * @param form form name
     * @return this
     */
    public Object form(final String form) {
        attribute("form", form);
        return this;
    }

    /**
     * Defines the height of the object.
     *
     * @param height pixels
     * @return this
     */
    public Object height(final String height) {
        attribute("height", height);
        return this;
    }

    /**
     * Defines a unique name for the object (to use when a form is submitted).
     *
     * @param name unique name
     * @return this
     */
    public Object name(final String name) {
        attribute("name", name);
        return this;
    }

    /**
     * Defines the MIME type of data specified in the data attribute.
     *
     * @param type MIME type
     * @return this
     */
    public Object type(final String type) {
        attribute("type", type);
        return this;
    }

    /**
     * Specifies a URL of a client-side image map to be used with the object.
     *
     * @param usemap URL
     * @return this
     */
    public Object usemap(final String usemap) {
        attribute("usemap", usemap);
        return this;
    }

    /**
     * Defines the width of the object.
     *
     * @param width pixels
     * @return this
     */
    public Object width(final String width) {
        attribute("width", width);
        return this;
    }
}
