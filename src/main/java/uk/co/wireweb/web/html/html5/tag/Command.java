package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.StandardAttributesTag;

/**
 * The &lt;command&gt; tag defines a command button, like a radiobutton, a checkbox, or a button.<br />
 * <br />
 * The command element must be inside a menu element. If not, it will not be displayed.
 *
 * @author Daniel Johansson
 * @since 12 May 2010
 */
public class Command extends StandardAttributesTag<Command> {

    public Command() {
        super("command");
    }

    /**
     * Defines if the command is checked or not. Use only if type is radio or checkbox.
     *
     * @param checked checked
     * @return this
     */
    public Command checked(final String checked) {
        attribute("checked", checked);
        return this;
    }

    /**
     * Defines if the command is available or not.
     *
     * @param disabled disabled
     * @return this
     */
    public Command disabled(final String disabled) {
        attribute("disabled", disabled);
        return this;
    }

    /**
     * Defines the url of an image to display as the command.
     *
     * @param icon URL
     * @return this
     */
    public Command icon(final String icon) {
        attribute("icon", icon);
        return this;
    }

    /**
     * Defines a name for the command. The label is visible.
     *
     * @param label command name
     * @return this
     */
    public Command label(final String label) {
        attribute("label", label);
        return this;
    }

    /**
     * Defines the name of the radiogroup this command belongs to. Use only if type is radio.
     *
     * @param radiogroup name of radiogroup
     * @return this
     */
    public Command radiogroup(final String radiogroup) {
        attribute("radiogroup", radiogroup);
        return this;
    }

    /**
     * Defines the type of command. Default value is command.<br />
     * <br />
     * <ul>
     * <li>checkbox</li>
     * <li>command</li>
     * <li>radio</li>
     * </ul>
     *
     * @param type the type of command.
     * @return this
     */
    public Command type(final String type) {
        attribute("type", type);
        return this;
    }
}
