package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.FormEventsTag;

/**
 * The &lt;output&gt; tag defines different types of output, such as output written by a script.
 *
 * @author Daniel Johansson
 * @since 3 Jun 2010
 */
public class Output extends FormEventsTag<Output> {

    public Output() {
        super("output");
    }

    /**
     * Defines one ore more elements the output field relates to.
     *
     * @param forElement id of another element
     * @return this
     */
    public Output forElement(final String forElement) {
        attribute("for", forElement);
        return this;
    }

    /**
     * Defines one ore more forms the output field belongs to.
     *
     * @param form form name
     * @return this
     */
    public Output form(final String form) {
        attribute("form", form);
        return this;
    }

    /**
     * Defines a unique name for the object (to use when a form is submitted).
     *
     * @param name unique name
     * @return this
     */
    public Output name(final String name) {
        attribute("name", name);
        return this;
    }
}
