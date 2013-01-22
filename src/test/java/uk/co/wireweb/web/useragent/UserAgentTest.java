package uk.co.wireweb.web.useragent;

import junit.framework.Assert;
import org.junit.Test;
import uk.co.wireweb.web.utility.BrowserUtils;

/**
 * UserAgentTest.
 *
 * @author Daniel Johansson
 * @since 30 Jun 2010
 */
public class UserAgentTest {

    @Test(expected = IllegalArgumentException.class)
    public void testBrowserUtils() {
        assertBrowser("Mozilla/5.0 (something like Gecko) jwebutils/1.0", "jwebutils", "1.0");
        assertBrowser("Mozilla/5.0 (something like Gecko) jwebutils 1.0", "jwebutils", "1.0");
        assertBrowser("Mozilla/5.0 (something like Gecko) jwebutils", "jwebutils", "");
        assertBrowser("Mozilla/5.0 jwebutils/1.0", "Mozilla/5.0 jwebutils/1.0", "");
        assertBrowser("jwebutils/1.0", "jwebutils", "1.0");
        assertBrowser("jwebutils 1.0", "jwebutils", "1.0");
        assertBrowser("jwebutils", "jwebutils", "");

        Assert.assertEquals(false, BrowserUtils.isMozillaBased(null));
        Assert.assertEquals("Google Chrome 4.0.288.1", BrowserUtils.identifyBrowser("Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US) AppleWebKit/532.8 (KHTML, like Gecko) Chrome/4.0.288.1 Safari/532.8").toString());

        BrowserUtils.identifyBrowser(null);
    }

    @Test
    public void testChrome() {
        assertBrowser("Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US) AppleWebKit/533.9 (KHTML, like Gecko) Chrome/6.0.401.1 Safari/533.9", "Google Chrome", "6.0.401.1");
        assertBrowser("Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US) AppleWebKit/533.3 (KHTML, like Gecko) Chrome/5.0.357.0 Safari/533.3", "Google Chrome", "5.0.357.0");
        assertBrowser("Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US) AppleWebKit/532.8 (KHTML, like Gecko) Chrome/4.0.288.1 Safari/532.8", "Google Chrome", "4.0.288.1");
        assertBrowser("Mozilla/5.0 (Windows; U; Windows NT 6.1; en-US) AppleWebKit/532.5 (KHTML, like Gecko) Chrome/4.1.249.1025 Safari/532.5", "Google Chrome", "4.1.249.1025");

        Browser browser = BrowserUtils.identifyBrowser("Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US) AppleWebKit/532.8 (KHTML, like Gecko) Chrome/4.0.288.1 Safari/532.8");
        Assert.assertEquals(true, BrowserUtils.isGoogleChrome(browser));

        browser = BrowserUtils.identifyBrowser("Mozilla/5.0 (Windows; U; Windows NT 6.1; it; rv:1.9.2.3) Gecko/20100401 Firefox/3.6.3");
        Assert.assertEquals(false, BrowserUtils.isGoogleChrome(browser));
    }

    @Test
    public void testFirefox() {
        assertBrowser("Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.9.2.3) Gecko/20100403 Firefox/3.6.3", "Mozilla Firefox", "3.6.3");
        assertBrowser("Mozilla/5.0 (X11; U; Linux i686; pl-PL; rv:1.9.0.2) Gecko/20121223 Ubuntu/9.25 (jaunty) Firefox/3.8", "Mozilla Firefox", "3.8");
        assertBrowser("Mozilla/5.0 (Windows; U; Windows NT 6.1; it; rv:1.9.2.3) Gecko/20100401 Firefox/3.6.3", "Mozilla Firefox", "3.6.3");
        assertBrowser("Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.9.2a1pre) Gecko/20090428 Firefox/3.6a1pre", "Mozilla Firefox", "3.6a1pre");
        assertBrowser("Mozilla/5.0 (Windows; U; Windows NT 6.1; en-US; rv:1.9.2b5) Gecko/20091204 Firefox/3.6b5", "Mozilla Firefox", "3.6b5");

        Browser browser = BrowserUtils.identifyBrowser("Mozilla/5.0 (Windows; U; Windows NT 6.1; it; rv:1.9.2.3) Gecko/20100401 Firefox/3.6.3");
        Assert.assertEquals(true, BrowserUtils.isMozillaFirefox(browser));

        browser = BrowserUtils.identifyBrowser("Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.9.3a4pre) Gecko/20100318 Minefield/3.7a4pre");
        Assert.assertEquals(false, BrowserUtils.isMozillaFirefox(browser));
    }

    @Test
    public void testMinefield() {
        assertBrowser("Mozilla/5.0 (Windows; U; Windows NT 6.0; en-US; rv:1.9.3a3pre) Gecko/20100312 Minefield/3.7a3pre", "Minefield", "3.7a3pre");
        assertBrowser("Mozilla/5.0 (Windows; U; Windows NT 6.1; en-US; rv:1.9.3a3pre) Gecko/20100306 Minefield/3.7a3pre (.NET CLR 3.5.30729)", "Minefield", "3.7a3pre");
        assertBrowser("Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.9.3a4pre) Gecko/20100318 Minefield/3.7a4pre", "Minefield", "3.7a4pre");
        assertBrowser("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:2.0a1pre) Gecko/2008060602 Minefield/4.0a1pre", "Minefield", "4.0a1pre");
        assertBrowser("Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:2.0a1pre) Gecko/2008032902 Minefield/4.0a1pre", "Minefield", "4.0a1pre");
        assertBrowser("Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.9.3a5pre) Gecko/20100418 Minefield/3.7a5pre", "Minefield", "3.7a5pre");
        assertBrowser("Mozilla/5.0 (Windows; U; Windows NT 6.0; en-US; rv:2.0a1pre) Gecko/2008032002 Minefield/4.0a1pre", "Minefield", "4.0a1pre");
    }

    @Test
    public void testInternetExplorer() {
        assertBrowser("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.2; Trident/4.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0)", "Internet Explorer", "8.0");
        assertBrowser("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1; WOW64; Trident/4.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; msn OptimizedIE8;ZHCN)", "Internet Explorer", "8.0");
        assertBrowser("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1; WOW64; Trident/4.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; InfoPath.2; OfficeLiveConnector.1.3; OfficeLivePatch.0.0; Zune 3.0; MS-RTC LM 8)", "Internet Explorer", "8.0");
        assertBrowser("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1; WOW64; Trident/4.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; InfoPath.2; FDM; OfficeLiveConnector.1.4; OfficeLivePatch.1.3; .NET CLR 1.1.4322)", "Internet Explorer", "8.0");
        assertBrowser("Mozilla/4.0 (compatible; MSIE 7.0b; Windows NT 6.0)", "Internet Explorer", "7.0b");
        assertBrowser("Mozilla/4.0 (compatible; MSIE 7.0b; Windows NT 5.1; .NET CLR 1.1.4322; Alexa Toolbar)", "Internet Explorer", "7.0b");
        assertBrowser("Mozilla/5.0 (compatible; MSIE 7.0; Windows NT 6.0; SLCC1; .NET CLR 2.0.50727; Media Center PC 5.0; c .NET CLR 3.0.04506; .NET CLR 3.5.30707; InfoPath.1; el-GR)", "Internet Explorer", "7.0");
        assertBrowser("Mozilla/4.0 (Windows; MSIE 7.0; Windows NT 5.1; SV1; .NET CLR 2.0.50727)", "Internet Explorer", "7.0");
        assertBrowser("Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.0; YPC 3.2.0; SLCC1; .NET CLR 2.0.50727; Media Center PC 5.0; InfoPath.2; .NET CLR 3.5.30729; .NET CLR 3.0.30618)", "Internet Explorer", "7.0");
        assertBrowser("Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.0; Trident/5.0)", "Internet Explorer", "7.0");
        assertBrowser("Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; Trident/5.0)", "Internet Explorer", "9.0");

        Browser browser = BrowserUtils.identifyBrowser("Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; Trident/5.0)");
        Assert.assertEquals(true, BrowserUtils.isInternetExplorer(browser));

        browser = BrowserUtils.identifyBrowser("Mozilla/5.0 (Windows; U; Windows NT 6.0; en-US; rv:2.0a1pre) Gecko/2008032002 Minefield/4.0a1pre");
        Assert.assertEquals(false, BrowserUtils.isInternetExplorer(browser));
    }

    @Test
    public void testSafari() {
        assertBrowser("Mozilla/5.0 (Macintosh; U; PPC Mac OS X 10_4_11; tr) AppleWebKit/528.4+ (KHTML, like Gecko) Version/4.0dp1 Safari/526.11.2", "Apple Safari", "526.11.2");
        assertBrowser("Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10_5_6; en-gb) AppleWebKit/528.10+ (KHTML, like Gecko) Version/4.0dp1 Safari/526.11.2", "Apple Safari", "526.11.2");
        assertBrowser("Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10_7; en-us) AppleWebKit/533.4 (KHTML, like Gecko) Version/4.1 Safari/533.4", "Apple Safari", "533.4");
        assertBrowser("Mozilla/5.0 (Windows; U; Windows NT 5.1; cs-CZ) AppleWebKit/531.22.7 (KHTML, like Gecko) Version/4.0.5 Safari/531.22.7", "Apple Safari", "531.22.7");
        assertBrowser("Mozilla/5.0(iPad; U; CPU iPhone OS 3_2 like Mac OS X; en-us) AppleWebKit/531.21.10 (KHTML, like Gecko) Version/4.0.4 Mobile/7B314 Safari/531.21.10", "Apple Safari", "531.21.10");
        assertBrowser("Mozilla/5.0 (Windows; U; Windows NT 5.2; en-US) AppleWebKit/531.21.8 (KHTML, like Gecko) Version/4.0.4 Safari/531.21.10", "Apple Safari", "531.21.10");

        Browser browser = BrowserUtils.identifyBrowser("Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10_7; en-us) AppleWebKit/533.4 (KHTML, like Gecko) Version/4.1 Safari/533.4");
        Assert.assertEquals(true, BrowserUtils.isSafari(browser));

        browser = BrowserUtils.identifyBrowser("Opera/9.64 (X11; Linux x86_64; U; en) Presto/2.1.1");
        Assert.assertEquals(false, BrowserUtils.isSafari(browser));
    }

    @Test
    public void testOpera() {
        assertBrowser("Opera/9.99 (Windows NT 5.1; U; pl) Presto/9.9.9", "Opera", "9.99");
        assertBrowser("Opera/9.70 (Linux ppc64 ; U; en) Presto/2.2.1", "Opera", "9.70");
        assertBrowser("Opera/9.70 (Linux i686 ; U; en) Presto/2.2.0", "Opera", "9.70");
        assertBrowser("Opera/9.64 (X11; Linux x86_64; U; en) Presto/2.1.1", "Opera", "9.64");
        assertBrowser("Opera/9.63 (X11; Linux i686; U; de) Presto/2.1.1", "Opera", "9.63");
        assertBrowser("Opera/9.63 (X11; Linux i686)", "Opera", "9.63");
        assertBrowser("Opera/9.60 (Windows NT 5.1; U; sv) Presto/2.1.1", "Opera", "9.60");
        assertBrowser("Opera/9.51 (Windows NT 5.1; U; es-AR)", "Opera", "9.51");
        assertBrowser("Opera/9.80 (Windows NT 6.1; U; en) Presto/2.5.22 Version/10.51", "Opera", "9.80");

        Browser browser = BrowserUtils.identifyBrowser("Opera/9.51 (Windows NT 5.1; U; es-AR)");
        Assert.assertEquals(true, BrowserUtils.isOpera(browser));

        browser = BrowserUtils.identifyBrowser("Googlebot/2.1 (+http://www.google.com/bot.html)");
        Assert.assertEquals(false, BrowserUtils.isOpera(browser));
    }

    @Test
    public void testGoogleBot() {
        assertBrowser("Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)", "Googlebot", "2.1", true);
        assertBrowser("Googlebot/2.1 (+http://www.googlebot.com/bot.html)", "Googlebot", "2.1", true);
        assertBrowser("Googlebot/2.1 (+http://www.google.com/bot.html)", "Googlebot", "2.1", true);
    }

    @Test
    public void testMsnbot() {
        assertBrowser("msnbot/2.1", "msnbot", "2.1", true);
        assertBrowser("msnbot/2.0b", "msnbot", "2.0b", true);
        assertBrowser("msnbot/1.1 (+http://search.msn.com/msnbot.htm)", "msnbot", "1.1", true);
        assertBrowser("msnbot/0.11 ( http://search.msn.com/msnbot.htm)", "msnbot", "0.11", true);
    }

    @Test
    public void testPlaystation() {
        assertBrowser("Mozilla/5.0 (PLAYSTATION 3; 2.00)", "Playstation 3", "2.00");
        assertBrowser("Mozilla/5.0 (PLAYSTATION 3; 1.90)", "Playstation 3", "1.90");
        assertBrowser("Mozilla/5.0 (PLAYSTATION 3; 1.70)", "Playstation 3", "1.70");
        assertBrowser("Mozilla/5.0 (PLAYSTATION 3; 1.5)", "Playstation 3", "1.5");
        assertBrowser("Mozilla/4.0 (PS3 (PlayStation 3); 1.00)", "Playstation 3", "1.00");
    }

    @Test
    public void testCamino() {
        assertBrowser("Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.5; en; rv:1.9.0.8pre) Gecko/2009022800 Camino/2.0b3pre", "Camino", "2.0b3pre");
        assertBrowser("Mozilla/5.0 (Macintosh; U; PPC Mac OS X Mach-O; en; rv:1.8.1.4pre) Gecko/20070511 Camino/1.6pre", "Camino", "1.6pre");
        assertBrowser("Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.6; en; rv:1.9.0.18) Gecko/2010021619 Camino/2.0.2 (like Firefox/3.0.18)", "Camino", "2.0.2");
        assertBrowser("Mozilla/5.0 (Macintosh; U; Intel Mac OS X; en; rv:1.8.1.4pre) Gecko/20070417 Camino/1.1b+", "Camino", "1.1b+");
        assertBrowser("Mozilla/5.0 (Macintosh; U; Intel Mac OS X; en; rv:1.8.1.6) Gecko/20070809 Firefox/2.0.0.6 Camino/1.5.1", "Camino", "1.5.1");
        assertBrowser("Mozilla/5.0 (Macintosh; U; PPC Mac OS X Mach-O; en; rv:1.8.1.21) Gecko/20090327 Camino/1.6.7 (like Firefox/2.0.0.21pre)", "Camino", "1.6.7");
        assertBrowser("Mozilla/5.0 (Macintosh; U; PPC Mac OS X Mach-O; de; rv:1.8.1.5pre) Gecko/20070605 Camino/1.6a1pre", "Camino", "1.6a1pre");
    }

    @Test
    public void testKonqueror() {
        assertBrowser("Mozilla/5.0 (compatible; Konqueror/4.4; Linux) KHTML/4.4.1 (like Gecko) Fedora/4.4.1-1.fc12", "Konqueror", "4.4");
        assertBrowser("Mozilla/5.0 (compatible; Konqueror/4.3; Linux) KHTML/4.3.1 (like Gecko) Fedora/4.3.1-3.fc11", "Konqueror", "4.3");
        assertBrowser("Mozilla/5.0 (compatible; Konqueror/4.2; Linux) KHTML/4.2.4 (like Gecko) Fedora/4.2.4-2.fc11", "Konqueror", "4.2");
        assertBrowser("Mozilla/5.0 (compatible; Konqueror/4.1; OpenBSD) KHTML/4.1.4 (like Gecko)", "Konqueror", "4.1");
        assertBrowser("Mozilla/5.0 (compatible; Konqueror/3.5; SunOS)", "Konqueror", "3.5");
        assertBrowser("Mozilla/5.0 (compatible; Konqueror/4.0; Linux) KHTML/4.0.82 (like Gecko)", "Konqueror", "4.0");
        assertBrowser("Mozilla/5.0 (compatible; Konqueror/3.4; Linux) KHTML/3.4.3 (like Gecko) (Kubuntu package 4:3.4.3-0ubuntu1)", "Konqueror", "3.4");
        assertBrowser("Mozilla/5.0 (compatible; Konqueror/3.3; Linux 2.6.11.12-whnetz-xenU; X11; i686; en_US) KHTML/3.3.2 (like Gecko)", "Konqueror", "3.3");
    }

    @Test
    public void testJava() {
        assertBrowser("Java/1.6.0_13", "Java", "1.6.0_13");
        assertBrowser("Java/1.6.0_04", "Java", "1.6.0_04");
        assertBrowser("Java/1.5.0_08", "Java", "1.5.0_08");
        assertBrowser("Java1.3.1_04", "Java", "1.3.1_04");
    }

    @Test
    public void testSeaMonkey() {
        assertBrowser("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.3a4pre) Gecko/20100404 SeaMonkey/2.1a1pre", "SeaMonkey", "2.1a1pre");
        assertBrowser("Mozilla/5.0 (Windows; U; Windows NT 6.0; ru; rv:1.9.1b4pre) Gecko/20090419 SeaMonkey/2.0b1pre", "SeaMonkey", "2.0b1pre");
        assertBrowser("Mozilla/5.0 (Windows; U; Windows NT 6.0; en-US; rv:1.9.1.1pre) Gecko/20090717 SeaMonkey/2.0b1", "SeaMonkey", "2.0b1");
        assertBrowser("Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.1b3pre) Gecko/20090223 SeaMonkey/2.0a3", "SeaMonkey", "2.0a3");
    }

    @Test
    public void testFennec() {
        assertBrowser("Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.5; en-US; rv:1.9.2a1pre) Gecko/20090626 Fennec/1.0b2", "Fennec", "1.0b2");
        assertBrowser("Mozilla/5.0 (Windows; U; Windows NT 6.1; en-US; rv:1.9.2a1pre) Gecko/20090317 Fennec/1.0b1", "Fennec", "1.0b1");
        assertBrowser("Mozilla/5.0 (X11; U; Linux armv7l; en-US; rv:1.9.2a1pre) Gecko/20090322 Fennec/1.0b2pre", "Fennec", "1.0b2pre");
    }

    @Test
    public void testGaleon() {
        assertBrowser("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.8) Gecko Galeon/2.0.6 (Ubuntu 2.0.6-2)", "Galeon", "2.0.6");
        assertBrowser("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.8.1.16) Gecko/20080716 (Gentoo) Galeon/2.0.4", "Galeon", "2.0.4");
        assertBrowser("Mozilla/5.0 (X11; U; Linux sparc64; en-GB; rv:1.8.1.11) Gecko/20071217 Galeon/2.0.3 Firefox/2.0.0.11", "Galeon", "2.0.3");
    }

    @Test
    public void testKMeleon() {
        assertBrowser("Mozilla/5.0 (Windows; U; Windows NT 6.1; en-US; rv:1.9.1.7pre) Gecko K-Meleon/1.5.3", "K-Meleon", "1.5.3");
        assertBrowser("Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.8.1.21) Gecko/20090331 K-Meleon/1.5.3", "K-Meleon", "1.5.3");
        assertBrowser("Mozilla/5.0 (Windows; U; Windows NT 5.1; pl-PL; rv:1.8.1.24pre) Gecko/20100228 K-Meleon/1.5.4", "K-Meleon", "1.5.4");
    }

    @Test
    public void testICab() {
        assertBrowser("iCab/4.5 (Macintosh; U; PPC Mac OS X)", "iCab", "4.5");
        assertBrowser("iCab/4.0 (Macintosh; U; Intel Mac OS X)", "iCab", "4.0");
        assertBrowser("Mozilla/5.0 (compatible; iCab 3.0.3; Macintosh; U; PPC Mac OS)", "iCab", "3.0.3");
        assertBrowser("Mozilla/5.0 (Macintosh; U; PPC Mac OS; en) iCab 3", "iCab", "3");
    }

    @Test
    public void testLobo() {
        assertBrowser("Mozilla/4.0 (compatible; MSIE 6.0; Windows XP 5.1) Lobo/0.98.4", "Lobo", "0.98.4");
        assertBrowser("Mozilla/4.0 (compatible; MSIE 6.0; Linux 2.6.26-1-amd64) Lobo/0.98.3", "Lobo", "0.98.3");
        assertBrowser("Mozilla/4.0 (compatible; MSIE 6.0; U; Windows;) Lobo/0.98.2", "Lobo", "0.98.2");
    }

    @Test
    public void testOperaMini() {
        assertBrowser("Opera/9.80 (J2ME/MIDP; Opera Mini/5.0.3521/886; U; en) Presto/2.4.15", "Opera Mini", "5.0.3521/886");
        assertBrowser("Opera/9.80 (J2ME/MIDP; Opera Mini/5.0.19693/870; U; en) Presto/2.4.15", "Opera Mini", "5.0.19693/870");
    }

    @Test
    public void testLynx() {
        assertBrowser("Lynx/2.8.7dev.4 libwww-FM/2.14 SSL-MM/1.4.1 OpenSSL/0.9.8d", "Lynx", "2.8.7dev.4");
        assertBrowser("Lynx/2.8.7dev.9 libwww-FM/2.14", "Lynx", "2.8.7dev.9");
        assertBrowser("Lynx/2.8.6rel.4 libwww-FM/2.14 SSL-MM/1.4.1 OpenSSL/0.9.8d", "Lynx", "2.8.6rel.4");
    }

    public void testTeaShark() {
        assertBrowser("Mozilla/5.0 (Macintosh; U; Intel Mac OS X; en) AppleWebKit/418.9.1 (KHTML, like Gecko) Safari/419.3 TeaShark/0.8", "TeaShark", "0.8");
    }

    private void assertBrowser(final String userAgent, final String name, final String version, final boolean robot) {
        final Browser browser = BrowserUtils.identifyBrowser(userAgent);
        Assert.assertEquals(browser.getName(), name);
        Assert.assertEquals(browser.getVersion(), version);
        Assert.assertEquals(browser.isRobot(), robot);
    }

    private void assertBrowser(final String userAgent, final String name, final String version) {
        assertBrowser(userAgent, name, version, false);
    }
}
