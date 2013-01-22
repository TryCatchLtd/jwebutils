package uk.co.wireweb.web.html.html5;

import junit.framework.Assert;
import org.junit.Test;
import uk.co.wireweb.web.html.html5.tag.Script;

/**
 * ScriptTest.
 *
 * @author Daniel Johansson
 * @since 25 Feb 2010
 */
public class ScriptTest {

    @Test
    public void scriptTest() {
        final String test = "<script src=\"javascript/testscript1.js\" type=\"text/javascript\"></script>";

        final Script script = new Script();
        script.type("text/javascript");
        script.src("javascript/testscript1.js");

        Assert.assertEquals(test, script.toString());
    }
}
