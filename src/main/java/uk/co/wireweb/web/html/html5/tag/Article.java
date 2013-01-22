package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.StandardAttributesTag;

/**
 * The <article> tag defines external content.<br />
 * <br />
 * The external content could be a news-article from an external provider, or a text from a web log (blog), or a
 * text from a forum, or any other content from an external source.<br />
 * <br />
 * This tag is new to HTML5.
 *
 * @author Daniel Johansson
 * @since 11 May 2010
 */
public class Article extends StandardAttributesTag<Article> {

    public Article() {
        super("article");
    }

    /**
     * URL of the article, if it is taken from the web.
     *
     * @param cite URL
     * @return this
     */
    public Article cite(final String cite) {
        attribute("cite", cite);
        return this;
    }

    /**
     * Defines the time and date that the article was first published.
     *
     * @param pubdate date
     * @return this
     */
    public Article pubdate(final String pubdate) {
        attribute("pubdate", pubdate);
        return this;
    }
}
