package uk.co.wireweb.web.css;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CssBuilder.
 *
 * @author Daniel Johansson
 * @since 8 Mar 2010
 */
public class CssBuilder {

    private Map<String, List<Css<?>>> blocks = new HashMap<String, List<Css<?>>>();

    private boolean lineBreaks = false;

    public CssBuilder() {

    }

    public CssBuilder(final boolean lineBreaks) {
        this.lineBreaks = lineBreaks;
    }

    public CssBuilder append(final String selector, final Css<?> child) {
        List<Css<?>> styles = this.blocks.get(selector);

        if (styles == null) {
            styles = new ArrayList<Css<?>>();
        }

        styles.add(child);

        this.blocks.put(selector, styles);

        return this;
    }

    private String lineBreak() {
        if (this.lineBreaks) {
            return "\r\n";
        }

        return "";
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();

        if (!this.blocks.isEmpty()) {
            for (final Map.Entry<String, List<Css<?>>> entry : this.blocks.entrySet()) {
                stringBuilder.append(lineBreak());
                stringBuilder.append(entry.getKey());
                stringBuilder.append(" {");
                stringBuilder.append(lineBreak());

                if (entry.getValue() != null) {
                    for (final Css<?> child : entry.getValue()) {
                        stringBuilder.append(child.toString());
                        stringBuilder.append(lineBreak());
                    }
                }

                stringBuilder.append("}");
                stringBuilder.append(lineBreak());
            }
        }

        return stringBuilder.toString();
    }

    public boolean isLineBreaks() {
        return lineBreaks;
    }

    public void setLineBreaks(boolean lineBreaks) {
        this.lineBreaks = lineBreaks;
    }
}
