package uk.co.wireweb.web.xml;

import uk.co.wireweb.web.html.Tag;

/**
 * Xml.
 *
 * @author Daniel Johansson
 * @since 24 Feb 2010
 */
public class Xml extends Tag<Xml> {

    public Xml(final String tag) {
        super(tag, false);
    }

    public Xml(final String tag, final boolean empty) {
        super(tag, empty);
    }
}
