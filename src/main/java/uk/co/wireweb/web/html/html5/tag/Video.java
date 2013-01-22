package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.FormEventsTag;

/**
 * The &lt;video&gt; tag defines video, such as a movie clip or other video streams.
 *
 * @author Daniel Johansson
 * @since 3 Jun 2010
 */
public class Video extends FormEventsTag<Video> {

    public Video() {
        super("video");
    }

    /**
     * If present, then the video will start playing as soon as it is ready.
     *
     * @param autoplay autoplay
     * @return this
     */
    public Video autoplay(final String autoplay) {
        attribute("autoplay", autoplay);
        return this;
    }

    /**
     * If present, controls will be displayed, such as a play button.
     *
     * @param controls controls
     * @return this
     */
    public Video controls(final String controls) {
        attribute("controls", controls);
        return this;
    }

    /**
     * Sets the height of the video player.
     *
     * @param height pixels
     * @return this
     */
    public Video height(final String height) {
        attribute("height", height);
        return this;
    }

    /**
     * If present, the media file will start over again, every time it is finished.
     *
     * @param loop loop
     * @return this
     */
    public Video loop(final String loop) {
        attribute("loop", loop);
        return this;
    }

    /**
     * If present, the video will be loaded at page load, and ready to run. Ignored if "autoplay" is present.
     *
     * @param preload preload
     * @return this
     */
    public Video preload(final String preload) {
        attribute("preload", preload);
        return this;
    }

    /**
     * The URL of the video to play.
     *
     * @param src URL
     * @return this
     */
    public Video src(final String src) {
        attribute("src", src);
        return this;
    }

    /**
     * Sets the width of the video player.
     *
     * @param width pixels
     * @return this
     */
    public Video width(final String width) {
        attribute("width", width);
        return this;
    }
}
