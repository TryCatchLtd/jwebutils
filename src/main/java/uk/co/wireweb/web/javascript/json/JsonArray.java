package uk.co.wireweb.web.javascript.json;

import java.util.ArrayList;
import java.util.List;

/**
 * JsonArray.
 *
 * @author Daniel Johansson
 * @since 8 Mar 2010
 */
public class JsonArray {

    private String name;

    private JsonArray parent;

    private List<JsonArray> children = new ArrayList<JsonArray>();

    private List<JsonValue<?>> members = new ArrayList<JsonValue<?>>();

    private List<JsonObject> objects = new ArrayList<JsonObject>();

    public JsonArray() {

    }

    public JsonArray(final String name) {
        this.name = name;
    }

    public JsonArray child(final JsonArray jsonArray) {
        if (jsonArray != null) {
            jsonArray.parent = this;
            this.children.add(jsonArray);
        }

        return this;
    }

    public JsonArray member(final JsonValue<?> jsonArrayValue) {
        if (jsonArrayValue != null) {
            this.members.add(jsonArrayValue);
        }

        return this;
    }

    public JsonArray object(final JsonObject jsonObject) {
        if (jsonObject != null) {
            this.objects.add(jsonObject);
        }

        return this;
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();

        if (this.parent == null) {
            stringBuilder.append("\"");
            stringBuilder.append(this.name);
            stringBuilder.append("\" : ");
        }

        stringBuilder.append("[");

        if (!this.children.isEmpty()) {
            for (int i = 0; i < this.children.size(); ++i) {
                stringBuilder.append(this.children.get(i).toString());

                if (i < (this.children.size() - 1)) {
                    stringBuilder.append(",");
                }
            }
        }

        if (!this.children.isEmpty() && !this.members.isEmpty()) {
            stringBuilder.append(",");
        }

        if (!this.members.isEmpty()) {
            for (int i = 0; i < this.members.size(); ++i) {
                stringBuilder.append(this.members.get(i).toString());

                if (i < (this.members.size() - 1)) {
                    stringBuilder.append(",");
                }
            }
        }

        if ((!this.children.isEmpty() || !this.members.isEmpty()) && !this.objects.isEmpty()) {
            stringBuilder.append(",");
        }

        if (!this.objects.isEmpty()) {
            for (int i = 0; i < this.objects.size(); ++i) {
                stringBuilder.append(this.objects.get(i).toString());

                if (i < (this.objects.size() - 1)) {
                    stringBuilder.append(",");
                }
            }
        }

        stringBuilder.append("]");

        return stringBuilder.toString();
    }

    public String getName() {
        return name;
    }
}
