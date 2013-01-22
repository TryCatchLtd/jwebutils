package uk.co.wireweb.web.html.html5;

import uk.co.wireweb.web.html.Tag;
import uk.co.wireweb.web.html.html5.tag.*;

import java.util.HashMap;
import java.util.Map;

/**
 * TagFactory.
 *
 * @author Daniel Johansson
 * @since 25 Mar 2010
 */
public class TagFactory {

    private static final Map<String, Class<? extends Tag<?>>> tagMap = new HashMap<String, Class<? extends Tag<?>>>();

    static {
        tagMap.put("a", A.class);
        tagMap.put("abbr", Abbr.class);
        tagMap.put("address", Address.class);
        tagMap.put("area", Area.class);
        tagMap.put("article", Article.class);
        tagMap.put("aside", Aside.class);
        tagMap.put("audio", Audio.class);
        tagMap.put("b", B.class);
        tagMap.put("base", Base.class);
        tagMap.put("bdo", Bdo.class);
        tagMap.put("blockquote", Blockquote.class);
        tagMap.put("body", Body.class);
        tagMap.put("br", Br.class);
        tagMap.put("button", Button.class);
        tagMap.put("canvas", Canvas.class);
        tagMap.put("caption", Caption.class);
        tagMap.put("cite", Cite.class);
        tagMap.put("code", Code.class);
        tagMap.put("col", Col.class);
        tagMap.put("colgroup", Colgroup.class);
        tagMap.put("command", Command.class);
        tagMap.put("datalist", Datalist.class);
        tagMap.put("dd", Dd.class);
        tagMap.put("del", Del.class);
        tagMap.put("details", Details.class);
        tagMap.put("dfn", Dfn.class);
        tagMap.put("div", Div.class);
        tagMap.put("dl", Dl.class);
        tagMap.put("dt", Dt.class);
        tagMap.put("em", Em.class);
        tagMap.put("embed", Embed.class);
        tagMap.put("fieldset", Fieldset.class);
        tagMap.put("figcaption", Figcaption.class);
        tagMap.put("figure", Figure.class);
        tagMap.put("footer", Footer.class);
        tagMap.put("form", Form.class);
        tagMap.put("h1", H1.class);
        tagMap.put("h2", H2.class);
        tagMap.put("h3", H3.class);
        tagMap.put("h4", H4.class);
        tagMap.put("h5", H5.class);
        tagMap.put("h6", H6.class);
        tagMap.put("head", Head.class);
        tagMap.put("header", Header.class);
        tagMap.put("hgroup", Hgroup.class);
        tagMap.put("hr", Hr.class);
        tagMap.put("html", Html.class);
        tagMap.put("i", I.class);
        tagMap.put("iframe", Iframe.class);
        tagMap.put("img", Img.class);
        tagMap.put("input", Input.class);
        tagMap.put("ins", Ins.class);
        tagMap.put("kbd", Kbd.class);
        tagMap.put("keygen", Keygen.class);
        tagMap.put("label", Label.class);
        tagMap.put("legend", Legend.class);
        tagMap.put("li", Li.class);
        tagMap.put("link", Link.class);
        tagMap.put("map", uk.co.wireweb.web.html.html5.tag.Map.class);
        tagMap.put("mark", Mark.class);
        tagMap.put("menu", Menu.class);
        tagMap.put("meta", Meta.class);
        tagMap.put("meter", Meter.class);
        tagMap.put("nav", Nav.class);
        tagMap.put("noscript", Noscript.class);
        tagMap.put("object", uk.co.wireweb.web.html.html5.tag.Object.class);
        tagMap.put("ol", Ol.class);
        tagMap.put("optgroup", Optgroup.class);
        tagMap.put("option", Option.class);
        tagMap.put("output", Output.class);
        tagMap.put("p", P.class);
        tagMap.put("param", Param.class);
        tagMap.put("pre", Pre.class);
        tagMap.put("progress", Progress.class);
        tagMap.put("q", Q.class);
        tagMap.put("rp", Rp.class);
        tagMap.put("rt", Rt.class);
        tagMap.put("ruby", Ruby.class);
        tagMap.put("samp", Samp.class);
        tagMap.put("script", Script.class);
        tagMap.put("section", Section.class);
        tagMap.put("select", Select.class);
        tagMap.put("small", Small.class);
        tagMap.put("source", Source.class);
        tagMap.put("span", Span.class);
        tagMap.put("strong", Strong.class);
        tagMap.put("style", Style.class);
        tagMap.put("sub", Sub.class);
        tagMap.put("summary", Summary.class);
        tagMap.put("sup", Sup.class);
        tagMap.put("table", Table.class);
        tagMap.put("tbody", Tbody.class);
        tagMap.put("td", Td.class);
        tagMap.put("textarea", Textarea.class);
        tagMap.put("tfoot", Tfoot.class);
        tagMap.put("th", Th.class);
        tagMap.put("thead", Thead.class);
        tagMap.put("time", Time.class);
        tagMap.put("title", Title.class);
        tagMap.put("tr", Tr.class);
        tagMap.put("ul", Ul.class);
        tagMap.put("var", Var.class);
        tagMap.put("video", Video.class);
    }

    public static Tag<?> createTagByName(final String name) {
        if (name == null) {
            throw new NullPointerException("name is null");
        }

        try {
            final Class<? extends Tag<?>> clazz = tagMap.get(name.toLowerCase());

            if (clazz != null) {
                return clazz.newInstance();
            }

            return null;
        } catch (final Exception exception) {
            return null;
        }
    }

    private TagFactory() {

    }
}
