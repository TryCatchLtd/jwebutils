package uk.co.wireweb.web.html.html5;

import junit.framework.Assert;
import org.junit.Test;
import uk.co.wireweb.web.html.html5.tag.*;

/**
 * ATest.
 *
 * @author Daniel Johansson
 * @since 24 Feb 2010
 */
public class ATest {

    public static void main(String[] args) {
        final Html html = new Html();
        html.child(new Head().child(new Title().body("This is the document body")));

        final Body body = new Body();
        body.child(new A().href("http://www.wireweb.co.uk"));
        body.child(new Br());
        body.child(new A().href("http://www.cdl.co.uk"));

        html.child(body);

        System.out.println(html.toString());
    }

    @Test
    public void testTag() {
        final A a = new A().href("http://www.wireweb.co.uk").body("Wireweb");

        Assert.assertEquals("<a href=\"http://www.wireweb.co.uk\">Wireweb</a>", a.toString());
    }

    @Test
    public void testTag2() {
        final A a = new A().href("http://www.wireweb.co.uk");

        Assert.assertEquals("<a href=\"http://www.wireweb.co.uk\">http://www.wireweb.co.uk</a>", a.toString());
    }

    @Test
    public void testTag3() {
        final A a = new A();

        Assert.assertEquals("<a />", a.toString());
    }

    @Test
    public void testTag4() {
        final A a = new A().href("http://www.wireweb.co.uk").body("Wireweb").hreflang("en").media("all").ping("http://www.wireweb.co.uk").rel("feed").target("blank").type("text/html");

        Assert.assertEquals("<a hreflang=\"en\" target=\"blank\" rel=\"feed\" type=\"text/html\" media=\"all\" href=\"http://www.wireweb.co.uk\" ping=\"http://www.wireweb.co.uk\">Wireweb</a>", a.toString());
    }
}
