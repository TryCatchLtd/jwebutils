package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.StandardAttributesTag;

/**
 * The &lt;audio&gt; tag defines sound, such as music or other audio streams.<br />
 * <br />
 * This tag is new to HTML5.
 *
 * @author Daniel Johansson
 * @since 11 May 2010
 */
public class Audio extends StandardAttributesTag<Audio> {

    public Audio() {
        super("audio");
    }

    /**
     * If present, the audio will start playing as soon as it is ready.
     *
     * @param autoplay autoplay
     * @return this
     */
    public Audio autoplay(final String autoplay) {
        attribute("autoplay", autoplay);
        return this;
    }

    /**
     * If present, controls will be displayed, such as a play button.
     *
     * @param controls controls
     * @return this
     */
    public Audio controls(final String controls) {
        attribute("controls", controls);
        return this;
    }

    /**
     * If present, the audio will be loaded at page load, and ready to run. Ignored if autoplay is present.
     *
     * @param preload preload
     * @return this
     */
    public Audio preload(final String preload) {
        attribute("preload", preload);
        return this;
    }

    /**
     * Defines the URL of the audio to play.
     *
     * @param src URL
     * @return this
     */
    public Audio src(final String src) {
        attribute("src", src);
        return this;
    }
}
