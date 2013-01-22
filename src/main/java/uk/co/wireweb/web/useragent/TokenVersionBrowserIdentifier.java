package uk.co.wireweb.web.useragent;

/**
 * TokenVersionBrowserIdentifier.
 *
 * @author Daniel Johansson
 * @since 19 May 2010
 */
public class TokenVersionBrowserIdentifier implements BrowserIdentifier {

    private final String name;

    protected final String token;

    private final boolean robot;

    public TokenVersionBrowserIdentifier(final String name, final String token) {
        this(name, token, false);
    }

    public TokenVersionBrowserIdentifier(final String name, final String token, final boolean robot) {
        this.name = name;

        if (token == null || token.length() == 0) {
            this.token = "/";
        } else {
            this.token = token;
        }

        this.robot = robot;
    }

    public Browser identify(final String userAgentString) {
        if (userAgentString == null) {
            return null;
        }

        return new Browser(this.name, getVersion(userAgentString), this.robot);
    }

    protected String getVersion(final String userAgentString) {
        String version = userAgentString.substring(userAgentString.indexOf(this.token) + this.token.length()).trim();

        if (version.contains(" ")) {
            version = version.substring(0, version.indexOf(" "));
        }

        if (version.startsWith("/")) {
            version = version.substring(1);
        }

        version = version.replaceAll("[;():]", "");

        return version;
    }

    public boolean matches(final String userAgentString) {
        return userAgentString != null && userAgentString.contains(this.token);
    }

    public boolean isRobot() {
        return robot;
    }
}
