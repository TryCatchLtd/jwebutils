package uk.co.wireweb.web.html.html5;

import junit.framework.Assert;
import org.junit.Test;
import uk.co.wireweb.web.html.Tag;

/**
 * TagTest.
 *
 * @author Daniel Johansson
 * @since 26 Feb 2010
 */
public class TagTest {

    @Test
    public void test() {
        final MyTestTag myTestTag = new MyTestTag();
        myTestTag.myAttribute("test");
        myTestTag.child(new MyTestTag());

        Assert.assertEquals("test", myTestTag.getAttribute("myattribute"));
        Assert.assertEquals("<mytesttag myattribute=\"test\"><mytesttag /></mytesttag>", myTestTag.toString());
    }

    public static class MyTestTag extends Tag<MyTestTag> {
        public MyTestTag() {
            super("mytesttag");
        }

        public MyTestTag myAttribute(final String myAttribute) {
            attribute("myattribute", myAttribute);
            return this;
        }
    }
}
