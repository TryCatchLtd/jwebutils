package uk.co.wireweb.web.javascript;


/**
 * TestObject.
 *
 * @author Daniel Johansson
 * @since 24 Mar 2010
 */
public class TestObject {

    private String member;

    private transient String transientMember;

    private AnotherTestObject anotherTestObject;

    private boolean testBoolean;

    private int testInteger = 4;

    private float testFloat = 1.67f;

    private Long testBigLong = 123L;

    public TestObject() {

    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public String getTransientMember() {
        return transientMember;
    }

    public void setTransientMember(String transientMember) {
        this.transientMember = transientMember;
    }

    public AnotherTestObject getAnotherTestObject() {
        return anotherTestObject;
    }

    public void setAnotherTestObject(AnotherTestObject anotherTestObject) {
        this.anotherTestObject = anotherTestObject;
    }

    public boolean isTestBoolean() {
        return testBoolean;
    }

    public void setTestBoolean(boolean testBoolean) {
        this.testBoolean = testBoolean;
    }

    public int getTestInteger() {
        return testInteger;
    }

    public void setTestInteger(int testInteger) {
        this.testInteger = testInteger;
    }

    public float getTestFloat() {
        return testFloat;
    }

    public void setTestFloat(float testFloat) {
        this.testFloat = testFloat;
    }

    public Long getTestBigLong() {
        return testBigLong;
    }

    public void setTestBigLong(Long testBigLong) {
        this.testBigLong = testBigLong;
    }
}
