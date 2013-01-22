package uk.co.wireweb.web.html;

/**
 * A list of HTML doc types.<br />
 * <br />
 * According to HTML standards, each HTML document requires a document type declaration.
 * The "DOCTYPE" begins the HTML document and tells a validator which version of HTML to
 * use in checking the document's syntax.
 *
 * @author Daniel Johansson
 * @since 25 Mar 2010
 */
public enum DocType {
    /**
     * HTML 5<br /><br />&lt;!DOCTYPE HTML&gt;
     */
    HTML5("<!DOCTYPE HTML>"),

    /**
     * HTML 4.01 Strict<br /><br />&lt;!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd"&gt;
     */
    HTML401_STRICT("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">"),

    /**
     * HTML 4.01 Transitional<br /><br />&lt;!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"&gt;
     */
    HTML401_TRANSITIONAL("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">"),

    /**
     * HTML 4.01 Frameset<br /><br />&lt;!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd"&gt;
     */
    HTML401_FRAMESET("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Frameset//EN\" \"http://www.w3.org/TR/html4/frameset.dtd\">"),

    /**
     * HTML 3.2 Final<br /><br />&lt;!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 3.2 Final//EN"&gt;
     */
    HTML32_FINAL("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 3.2 Final//EN\">"),

    /**
     * HTML 2.0<br /><br />&lt;!DOCTYPE HTML PUBLIC "-//IETF//DTD HTML//EN"&gt;
     */
    HTML20("<!DOCTYPE HTML PUBLIC \"-//IETF//DTD HTML//EN\">"),

    /**
     * XHTML 1.1<br /><br />&lt;!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd"&gt;
     */
    XHTML11("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\" \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">"),

    /**
     * XHTML 1.0 Strict<br /><br />&lt;!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"&gt;
     */
    XHTML10_STRICT("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">"),

    /**
     * XHTML 1.0 Transitional<br /><br />&lt;!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"&gt;
     */
    XHTML10_TRANSITIONAL("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">"),

    /**
     * XHTML 1.0 Frameset<br /><br />&lt;!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd"&gt;
     */
    XHTML10_FRAMESET("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">"),

    /**
     * Unknown doctype
     */
    UNKNOWN("Unknown");

    private final String docType;

    private DocType(final String docType) {
        this.docType = docType;
    }

    public String getDocType() {
        return docType;
    }

    public static DocType parseDocType(final String docType) {
        if (docType == null) {
            throw new NullPointerException("docType is null");
        }

        if (docType.toLowerCase().contains("-//W3C//DTD HTML 4.01//EN".toLowerCase())) {
            return DocType.HTML401_STRICT;
        } else if (docType.toLowerCase().contains("-//W3C//DTD HTML 4.01 Transitional//EN".toLowerCase())) {
            return DocType.HTML401_TRANSITIONAL;
        } else if (docType.toLowerCase().contains("-//W3C//DTD HTML 4.01 Frameset//EN".toLowerCase())) {
            return DocType.HTML401_FRAMESET;
        } else if (docType.toLowerCase().contains("-//W3C//DTD HTML 3.2 Final//EN".toLowerCase())) {
            return DocType.HTML32_FINAL;
        } else if (docType.toLowerCase().contains("-//IETF//DTD HTML//EN".toLowerCase())) {
            return DocType.HTML20;
        } else if (docType.toLowerCase().contains("-//W3C//DTD XHTML 1.1//EN".toLowerCase())) {
            return DocType.XHTML11;
        } else if (docType.toLowerCase().contains("-//W3C//DTD XHTML 1.0 Strict//EN".toLowerCase())) {
            return DocType.XHTML10_STRICT;
        } else if (docType.toLowerCase().contains("-//W3C//DTD XHTML 1.0 Transitional//EN".toLowerCase())) {
            return DocType.XHTML10_TRANSITIONAL;
        } else if (docType.toLowerCase().contains("-//W3C//DTD XHTML 1.0 Frameset//EN".toLowerCase())) {
            return DocType.XHTML10_FRAMESET;
        } else if ("<!DOCTYPE HTML>".equalsIgnoreCase(docType)) {
            return DocType.HTML5;
        }

        throw new IllegalArgumentException("Unable to determine HTML DOCTYPE from input [" + docType + "]");
    }
}
