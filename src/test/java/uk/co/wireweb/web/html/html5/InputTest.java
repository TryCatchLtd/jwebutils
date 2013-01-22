package uk.co.wireweb.web.html.html5;

import junit.framework.Assert;
import org.junit.Test;
import uk.co.wireweb.web.html.html5.tag.Input;

/**
 * InputTest.
 *
 * @author Daniel Johansson
 * @since 24 Feb 2010
 */
public class InputTest {

    @Test
    public void inputTest() {
        final String time = String.valueOf(System.currentTimeMillis());
        final String test = "<input id=\"textInput\" value=\"" + time + "\" type=\"text\" />";
        final Input input = new Input();
        input.id("textInput");
        input.type("text");
        input.value(time);

        Assert.assertEquals(test, input.toString());
    }
}
