package uk.co.wireweb.web.html.html5;

import junit.framework.Assert;
import org.junit.Test;
import uk.co.wireweb.web.html.html5.tag.Span;

/**
 * SpanTest.
 *
 * @author Daniel Johansson
 * @since 11 Feb 2010
 */
public class SpanTest {

    @Test
    public void testTag() {
        final String test1 = "<span id=\"test1\">test1 body</span>";

        final Span span = new Span();
        span.id("test1");
        span.body("test1 body");

        Assert.assertEquals(test1, span.toString());
    }
}
