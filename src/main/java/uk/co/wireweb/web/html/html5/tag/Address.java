package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.StandardAttributesTag;

/**
 * The &lt;address&gt; tag defines the contact information for the author or owner of a document.<br />
 * <br />
 * If the &lt;address&gt; element is inside an &lt;article&gt; element, it represents the contact
 * information of the author/owner of that article.
 *
 * @author Daniel Johansson
 * @since 25 Feb 2010
 */
public class Address extends StandardAttributesTag<Address> {

    public Address() {
        super("address");
    }
}
