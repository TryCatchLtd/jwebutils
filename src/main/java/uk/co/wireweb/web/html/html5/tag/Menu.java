package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.FormEventsTag;

/**
 * Menu.
 *
 * @author Daniel Johansson
 * @since 25 May 2010
 */
public class Menu extends FormEventsTag<Menu> {

    public Menu() {
        super("menu");
    }

    /**
     * Defines a visible label for the menu.
     *
     * @param label menu label
     * @return this
     */
    public Menu label(final String label) {
        attribute("label", label);
        return this;
    }

    /**
     * Defines which type of menu to display. Default value is "list".
     *
     * @param type context, toolbar, list
     * @return this
     */
    public Menu type(final String type) {
        attribute("type", type);
        return this;
    }
}
