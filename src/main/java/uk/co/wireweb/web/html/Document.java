package uk.co.wireweb.web.html;

import uk.co.wireweb.web.html.html5.tag.Html;

/**
 * HTML Document.
 *
 * @author Daniel Johansson
 * @since 25 Mar 2010
 */
public class Document {

    private DocType docType = DocType.UNKNOWN;

    private Html html;

    public Document() {

    }

    public DocType getDocType() {
        return docType;
    }

    public Document setDocType(DocType docType) {
        this.docType = docType;
        return this;
    }

    public Html getHtml() {
        return html;
    }

    public Document setHtml(Html html) {
        this.html = html;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();

        if (!DocType.UNKNOWN.equals(this.docType)) {
            stringBuilder.append(this.docType.getDocType());
        }

        if (this.html != null) {
            stringBuilder.append(this.html.toString());
        }

        return stringBuilder.toString();
    }
}
