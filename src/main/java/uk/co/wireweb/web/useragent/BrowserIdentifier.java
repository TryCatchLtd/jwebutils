package uk.co.wireweb.web.useragent;

/**
 * BrowserIdentifier.
 *
 * @author Daniel Johansson
 * @since 19 May 2010
 */
public interface BrowserIdentifier {

    public boolean matches(final String userAgentString);

    public Browser identify(final String userAgentString);

}
