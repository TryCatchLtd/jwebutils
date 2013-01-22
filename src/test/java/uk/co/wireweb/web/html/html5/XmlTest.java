package uk.co.wireweb.web.html.html5;

import junit.framework.Assert;
import org.junit.Test;
import uk.co.wireweb.web.xml.Xml;

/**
 * XmlTest.
 *
 * @author Daniel Johansson
 * @since 26 Feb 2010
 */
public class XmlTest {

    @Test
    public void test() {
        Assert.assertEquals("<xmlempty />", new Xml("xmlempty", true).toString());
    }

    @Test
    public void testAnother() {
        Assert.assertEquals("<xmlopen />", new Xml("xmlopen").toString());
    }
}
