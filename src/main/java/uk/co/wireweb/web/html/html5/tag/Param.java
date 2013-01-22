package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.FormEventsTag;

/**
 * The param element allows you to specify the run-time settings for an object inserted into HTML documents.<br />
 * <br />
 * Use the param element together with the object element.
 *
 * @author Daniel Johansson
 * @since 3 Jun 2010
 */
public class Param extends FormEventsTag<Param> {

    public Param() {
        super("param");
    }

    /**
     * Defines a unique name for the parameter.
     *
     * @param name unique name
     * @return this
     */
    public Param name(final String name) {
        attribute("name", name);
        return this;
    }

    /**
     * Specifies the value of the parameter.
     *
     * @param value value
     * @return this
     */
    public Param value(final String value) {
        attribute("value", value);
        return this;
    }
}
