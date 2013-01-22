package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.StandardAttributesTag;

/**
 * The &lt;abbr&gt; tag indicates an abbrevation or an acronym, like "WWW" or "NATO".<br />
 * <br />
 * By marking up abbreviations you can give useful information to browsers, spell checkers,
 * translation systems and search-engine indexers.
 *
 * @author Daniel Johansson
 * @since 25 Feb 2010
 */
public class Abbr extends StandardAttributesTag<Abbr> {

    public Abbr() {
        super("abbr");
    }
}
