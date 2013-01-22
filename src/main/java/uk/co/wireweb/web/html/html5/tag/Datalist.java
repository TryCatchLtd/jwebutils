package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.StandardAttributesTag;

/**
 * The <datalist> tag defines a list of options. Use this element together with the input element, to define which
 * values the input element can have.<br />
 * <br />
 * The datalist and its options will not be displayed, it is only a list of legal input values.<br />
 * <br />
 * Use the input element's list attribute to bind it together with a datalist.
 *
 * @author Daniel Johansson
 * @since 12 May 2010
 */
public class Datalist extends StandardAttributesTag<Datalist> {

    public Datalist() {
        super("datalist");
    }
}
