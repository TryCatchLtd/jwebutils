package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.FormEventsTag;

/**
 * The form element creates a form for user input.<br />
 * <br />
 * The form element contains one or more form elements: button, input, keygen, object, output, select, and textarea.<br />
 * <br />
 * Forms are used to pass user-data to a server.
 *
 * @author Daniel Johansson
 * @since 13 May 2010
 */
public class Form extends FormEventsTag<Form> {

    public Form() {
        super("form");
    }

    /**
     * A comma separated list of possible character sets for the form data.
     *
     * @param acceptCharset charset_list
     * @return this
     */
    public Form acceptCharset(final String acceptCharset) {
        attribute("accept-charset", acceptCharset);
        return this;
    }

    /**
     * A URL that defines where to send the data when the submit button is pushed.
     *
     * @param action URL
     * @return this
     */
    public Form action(final String action) {
        attribute("action", action);
        return this;
    }

    /**
     * If "on" browsers can store the form's input values, to auto-fill the form if the user returns to the page.<br />
     * If "off" browsers should not store this information.
     *
     * @param autocomplete <b>on</b> or <b>off</b>
     * @return this
     */
    public Form autocomplete(final String autocomplete) {
        attribute("autocomplete", autocomplete);
        return this;
    }

    /**
     * The mime type used to encode the content of the form.<br />
     * <br />
     * <ul>
     * <li>application/x-www-form-urlencoded</li>
     * <li>multipart/form-data</li>
     * <li>text/plain</li>
     * </ul>
     *
     * @param enctype see list above
     * @return this
     */
    public Form enctype(final String enctype) {
        attribute("enctype", enctype);
        return this;
    }

    /**
     * The HTTP method for sending data to the action URL. Default is get.<br />
     * <br />
     * <b>method="get":</b> This method sends the form contents in the URL: URL?name=value&name=value.<br />
     * <b>Note:</b> If the form values contains non-ASCII characters or exceeds 100 characters you MUST use method="post".<br />
     * <br />
     * <b>method="post":</b> This method sends the form contents in the body of the request.<br />
     * <b>Note:</b> Most browsers are unable to bookmark post requests.
     *
     * @param method get, post, put, delete
     * @return this
     */
    public Form method(final String method) {
        attribute("method", method);
        return this;
    }

    /**
     * Defines a unique name for the form.
     *
     * @param name form name
     * @return this
     */
    public Form name(final String name) {
        attribute("name", name);
        return this;
    }

    /**
     * If present the form should not be validated when submitted.
     *
     * @param novalidate novalidate
     * @return this
     */
    public Form novalidate(final String novalidate) {
        attribute("novalidate", novalidate);
        return this;
    }

    /**
     * Where to open the target URL.<br />
     * <br />
     * <ul>
     * <li><b>_blank</b> - the target URL will open in a new window</li>
     * <li><b>_self</b> - the target URL will open in the same frame as it was clicked</li>
     * <li><b>_parent</b> - the target URL will open in the parent frameset</li>
     * <li><b>_top</b> - the target URL will open in the full body of the window</li>
     * </ul>
     *
     * @param target see list above
     * @return this
     */
    public Form target(final String target) {
        attribute("target", target);
        return this;
    }
}
