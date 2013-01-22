package uk.co.wireweb.web.html.html5.tag;

import uk.co.wireweb.web.html.html5.FormEventsTag;

/**
 * The &lt;meter&gt; tag defines a measurement. Used only for measurements with a known minimum and maximum value.
 *
 * @author Daniel Johansson
 * @since 25 May 2010
 */
public class Meter extends FormEventsTag<Meter> {

    public Meter() {
        super("meter");
    }

    /**
     * Defines at which point the measurement's value is consider a high value.
     *
     * @param high number
     * @return this
     */
    public Meter high(final String high) {
        attribute("high", high);
        return this;
    }

    /**
     * Defines at which point the measurement's value is consider a low value.
     *
     * @param low number
     * @return this
     */
    public Meter low(final String low) {
        attribute("low", low);
        return this;
    }

    /**
     * Defines the maximum value. Default value is 1.
     *
     * @param max number
     * @return this
     */
    public Meter max(final String max) {
        attribute("max", max);
        return this;
    }

    /**
     * Defines the minimum value. Default value is 0.
     *
     * @param min number
     * @return this
     */
    public Meter min(final String min) {
        attribute("min", min);
        return this;
    }

    /**
     * Defines what measurement's value is the best value. If this value is higher then the
     * "high" attribute's value, it means that the higher value the better. If this value is
     * lower than the "low" attribute's value, it means that the lower value the better.
     *
     * @param optimum number
     * @return this
     */
    public Meter optimum(final String optimum) {
        attribute("optimum", optimum);
        return this;
    }

    /**
     * Defines the measurement's value.
     *
     * @param value number
     * @return this
     */
    public Meter value(final String value) {
        attribute("value", value);
        return this;
    }
}
