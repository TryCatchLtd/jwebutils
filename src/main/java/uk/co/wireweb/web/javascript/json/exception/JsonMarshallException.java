package uk.co.wireweb.web.javascript.json.exception;

/**
 * JsonMarshallException.
 *
 * @author Daniel Johansson
 * @since 9 Mar 2010
 */
public class JsonMarshallException extends Exception {

    private static final long serialVersionUID = 1068159380914818980L;

    public JsonMarshallException() {

    }

    public JsonMarshallException(final String message) {
        super(message);
    }

    public JsonMarshallException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
