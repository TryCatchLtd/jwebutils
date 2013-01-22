package uk.co.wireweb.web.javascript;

import org.junit.Test;
import uk.co.wireweb.web.javascript.json.JsonObject;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Daniel Johansson
 * @since 22 Jan 2013
 */
public class JsonObjectTest {

    @Test
    public void member_shouldAddKeyValuePairCorrectly() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.member("int", 5);

        assertThat(jsonObject.getInt("int"), is(5));
    }
}
