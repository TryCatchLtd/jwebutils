package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.FormEventsTag;

/**
 * The &lt;source&gt; tag defines media resources for media elements, such as &lt;video&gt; and &lt;audio&gt;.
 *
 * @author Daniel Johansson
 * @since 3 Jun 2010
 */
public class Source extends FormEventsTag<Source> {

    public Source() {
        super("source");
    }

    /**
     * Defines the type of media resource, for browsers to decide if it shall download it or not.
     *
     * @param media media query
     * @return this
     */
    public Source media(final String media) {
        attribute("media", media);
        return this;
    }

    /**
     * The URL of the media.
     *
     * @param src URL
     * @return this
     */
    public Source src(final String src) {
        attribute("src", src);
        return this;
    }

    /**
     * Defines where in the audio stream the player should start playing. As default, the audio starts playing at the beginning.
     *
     * @param type numeric value
     * @return this
     */
    public Source type(final String type) {
        attribute("type", type);
        return this;
    }
}
