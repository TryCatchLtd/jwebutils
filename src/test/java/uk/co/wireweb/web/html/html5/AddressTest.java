package uk.co.wireweb.web.html.html5;

import junit.framework.Assert;
import org.junit.Test;
import uk.co.wireweb.web.html.html5.tag.Address;

/**
 * AddressTest.
 *
 * @author Daniel Johansson
 * @since 25 Feb 2010
 */
public class AddressTest {

    @Test
    public void addressTest() {
        Assert.assertEquals("<address />", new Address().toString());
        Assert.assertEquals("<address>Some address</address>", new Address().body("Some address").toString());
    }
}
