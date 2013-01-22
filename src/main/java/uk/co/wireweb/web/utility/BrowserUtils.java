package uk.co.wireweb.web.utility;

import uk.co.wireweb.web.useragent.Browser;
import uk.co.wireweb.web.useragent.BrowserIdentifier;
import uk.co.wireweb.web.useragent.TokenVersionBrowserIdentifier;

import java.util.ArrayList;
import java.util.List;

/**
 * BrowserUtils.
 *
 * @author Daniel Johansson
 * @since 19 May 2010
 */
public class BrowserUtils {

    /**
     * This will take a useragent string and try to identify the browser.
     *
     * @param userAgentString the useragent string
     * @return the browser, if a browser could not be found a browser object will still be returned having the useragent string as the name
     */
    public static Browser identifyBrowser(final String userAgentString) {
        if (userAgentString == null) {
            throw new IllegalArgumentException("userAgentString cannot be null");
        }

        // Try all the known identifiers first
        for (final BrowserIdentifier browserIdentifier : IDENTIFIERS) {
            if (browserIdentifier.matches(userAgentString)) {
                return browserIdentifier.identify(userAgentString);
            }
        }

        String browser = null;

        // Mozilla based browser
        if (isMozillaBased(userAgentString)) {
            // Gecko engine?
            if (userAgentString.toLowerCase().contains("gecko")) {
                final int geckoIndex = userAgentString.indexOf("Gecko");
                final String geckoString = userAgentString.substring(geckoIndex);
                final String browserAndVersion = geckoString.substring(geckoString.indexOf(' ') + 1);

                if (browserAndVersion != null) {
                    if (browserAndVersion.contains("/")) {
                        browser = browserAndVersion.substring(0, browserAndVersion.indexOf('/'));
                    } else if (browserAndVersion.contains(" ")) {
                        browser = browserAndVersion.substring(0, browserAndVersion.indexOf(' '));
                    } else {
                        browser = browserAndVersion;
                    }
                }
            }
        } else {
            if (userAgentString.contains("/")) {
                browser = userAgentString.substring(0, userAgentString.indexOf('/'));
            } else if (userAgentString.contains(" ")) {
                browser = userAgentString.substring(0, userAgentString.indexOf(' '));
            }
        }

        if (browser != null) {
            final TokenVersionBrowserIdentifier identifier = new TokenVersionBrowserIdentifier(browser, browser);
            return identifier.identify(userAgentString);
        }

        return new Browser(userAgentString, "");
    }

    /**
     * Returns true if the browser passed in is Internet Explorer
     *
     * @param browser the browser to check
     * @return true if IE
     */
    public static boolean isInternetExplorer(final Browser browser) {
        return "internet explorer".equalsIgnoreCase(browser.getName());
    }

    /**
     * Returns true if the browser passed in is Google Chrome
     *
     * @param browser the browser to check
     * @return true if Chrome
     */
    public static boolean isGoogleChrome(final Browser browser) {
        return "google chrome".equalsIgnoreCase(browser.getName());
    }

    /**
     * Returns true if the browser passed in is Mozilla Firefox
     *
     * @param browser the browser to check
     * @return true if Firefox
     */
    public static boolean isMozillaFirefox(final Browser browser) {
        return "mozilla firefox".equalsIgnoreCase(browser.getName());
    }

    /**
     * Returns true if the browser passed in is Opera
     *
     * @param browser the browser to check
     * @return true if Opera
     */
    public static boolean isOpera(final Browser browser) {
        return "opera".equalsIgnoreCase(browser.getName());
    }

    /**
     * Returns true if the browser passed in is Safari
     *
     * @param browser the browser to check
     * @return true if Safari
     */
    public static boolean isSafari(final Browser browser) {
        return "apple safari".equalsIgnoreCase(browser.getName());
    }

    /**
     * Returns true if the useragent string passed in is a Mozilla based useragent.
     *
     * @param userAgentString the useragent string
     * @return true if it starts with "Mozilla/"
     */
    public static boolean isMozillaBased(final String userAgentString) {
        return userAgentString != null && userAgentString.toLowerCase().startsWith("mozilla/");
    }

    private BrowserUtils() {

    }

    private static final List<BrowserIdentifier> IDENTIFIERS = new ArrayList<BrowserIdentifier>();

    static {
        // Browsers
        IDENTIFIERS.add(new TokenVersionBrowserIdentifier("Google Chrome", "Chrome/")); // IMPORTANT: This one needs to come before Safari in this list
        IDENTIFIERS.add(new TokenVersionBrowserIdentifier("TeaShark", "TeaShark/")); // IMPORTANT: This one needs to come before Safari in this list
        IDENTIFIERS.add(new TokenVersionBrowserIdentifier("Apple Safari", "Safari/"));

        IDENTIFIERS.add(new TokenVersionBrowserIdentifier("Camino", "Camino/")); // IMPORTANT: This one needs to come before Firefox in this list
        IDENTIFIERS.add(new TokenVersionBrowserIdentifier("Galeon", "Galeon/")); // IMPORTANT: This one needs to come before Firefox in this list
        IDENTIFIERS.add(new TokenVersionBrowserIdentifier("Mozilla Firefox", "Firefox/"));

        IDENTIFIERS.add(new TokenVersionBrowserIdentifier("Lobo", "Lobo/")); // IMPORTANT: This one needs to come before Internet Explorer in this list
        IDENTIFIERS.add(new TokenVersionBrowserIdentifier("Internet Explorer", "MSIE"));

        IDENTIFIERS.add(new TokenVersionBrowserIdentifier("Opera Mini", "Opera Mini/")); // IMPORTANT: This one needs to come before Opera in this list
        IDENTIFIERS.add(new TokenVersionBrowserIdentifier("Opera", "Opera/"));

        IDENTIFIERS.add(new TokenVersionBrowserIdentifier("Minefield", "Minefield/"));
        IDENTIFIERS.add(new TokenVersionBrowserIdentifier("Konqueror", "Konqueror/"));
        IDENTIFIERS.add(new TokenVersionBrowserIdentifier("SeaMonkey", "SeaMonkey/"));
        IDENTIFIERS.add(new TokenVersionBrowserIdentifier("Lynx", "Lynx/"));
        IDENTIFIERS.add(new TokenVersionBrowserIdentifier("iCab", "iCab/"));
        IDENTIFIERS.add(new TokenVersionBrowserIdentifier("iCab", "iCab"));

        // Email clients
        IDENTIFIERS.add(new TokenVersionBrowserIdentifier("Thunderbird", "Thunderbird/"));

        // Consoles
        IDENTIFIERS.add(new TokenVersionBrowserIdentifier("Playstation 3", "PLAYSTATION 3;"));
        IDENTIFIERS.add(new TokenVersionBrowserIdentifier("Playstation 3", "PlayStation 3);"));

        // API
        IDENTIFIERS.add(new TokenVersionBrowserIdentifier("Java", "Java"));

        // Robots
        IDENTIFIERS.add(new TokenVersionBrowserIdentifier("msnbot", "msnbot/", true));
        IDENTIFIERS.add(new TokenVersionBrowserIdentifier("Googlebot", "Googlebot/", true));
        IDENTIFIERS.add(new TokenVersionBrowserIdentifier("NutchCVS", "NutchCVS/", true));
    }
}
