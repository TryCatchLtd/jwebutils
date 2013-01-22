package uk.co.wireweb.web.javascript;

import junit.framework.Assert;
import org.junit.Test;
import uk.co.wireweb.web.javascript.json.*;
import uk.co.wireweb.web.javascript.json.exception.JsonMarshallException;

/**
 * JsonTest.
 *
 * @author Daniel Johansson
 * @since 8 Mar 2010
 */
public class JsonTest {

    @Test
    public void testJsonMarshaller() throws JsonMarshallException {
        final JsonMarshaller<TestObject> jsonMarshaller = new JsonMarshaller<TestObject>(TestObject.class);

        final TestObject testObject = new TestObject();
        final JsonObject jsonObject = jsonMarshaller.marshall(testObject);

        Assert.assertEquals("{\"member\" : null,\"anotherTestObject\" : null,\"testBoolean\" : false,\"testInteger\" : 4,\"testFloat\" : 1.67,\"testBigLong\" : 123}", jsonObject.toString());
        /*
                final TestObject testObjectFromJson = jsonMarshaller.unmarshall(jsonObject.toString());

                Assert.assertEquals(testObject.getMember(), testObjectFromJson.getMember());
                Assert.assertEquals(testObject.getTestFloat(), testObjectFromJson.getTestFloat());
                Assert.assertEquals(testObject.getTestInteger(), testObjectFromJson.getTestInteger());
                Assert.assertEquals(testObject.getTransientMember(), testObjectFromJson.getTransientMember());
                Assert.assertEquals(testObject.getTestBigLong(), testObjectFromJson.getTestBigLong());
        */
    }

    @Test
    public void testJson() {
        Assert.assertEquals("{\"member\" : \"test value\"}", new JsonObject("root").member(new JsonKeyValuePair<String>("member", "test value")).toString());
        Assert.assertEquals("{\"integer\" : 5,\"string\" : \"t\\\\est\",\"string\" : 12.3457,\"object2\" : {\"key\" : true,\"key2\" : null}}", new JsonObject("object").child(new JsonObject("object2").member(new JsonKeyValuePair<Boolean>("key", true)).member(new JsonKeyValuePair<String>("key2", null))).member(new JsonKeyValuePair<Integer>("integer", 5)).member(new JsonKeyValuePair<String>("string", "t\\est")).member(new JsonKeyValuePair<Double>("string", 12.3457)).toString());
        Assert.assertEquals("{\"more\" : [\"morevalue\"],\"clients\" : [[3,5,6],null,false,\"test\"]}", new JsonObject("").array(new JsonArray("more").member(new JsonValue<String>("morevalue"))).array(new JsonArray("clients").member(new JsonValue<Void>(null)).member(new JsonValue<Boolean>(false)).member(new JsonValue<String>("test")).child(new JsonArray("newArray").member(new JsonValue<Integer>(3)).member(new JsonValue<Integer>(5)).member(new JsonValue<Integer>(6)))).toString());
        Assert.assertEquals("{\"child\" : {\"isThisWorking\" : true}}", new JsonObject("root").child(new JsonObject("child").member(new JsonKeyValuePair<Boolean>("isThisWorking", true))).toString());
        Assert.assertEquals("{\"test\" : \"this is \\\" a test \\\\ with weird characters\"}", new JsonObject("root").member(new JsonKeyValuePair<String>("test", "this is \" a test \\ with weird characters")).toString());
        Assert.assertEquals("this is \" a test \\ with weird characters", new JsonKeyValuePair<String>("test", "this is \" a test \\ with weird characters").getValue());
        Assert.assertEquals("test", new JsonKeyValuePair<String>("test", "this is \" a test \\ with weird characters").getKey());
        Assert.assertEquals("{}", new JsonObject("root").member(null).toString());
        Assert.assertEquals("{}", new JsonObject("root").array(null).toString());
        Assert.assertEquals("{}", new JsonObject("root").child(null).toString());
        Assert.assertEquals("root", new JsonObject("root").getName());
    }
}
