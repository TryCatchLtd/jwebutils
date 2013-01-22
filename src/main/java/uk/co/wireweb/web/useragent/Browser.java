package uk.co.wireweb.web.useragent;

/**
 * Browser.
 *
 * @author Daniel Johansson
 * @since 19 May 2010
 */
public class Browser {

    private final String name;

    private final String version;

    private final boolean robot;

    public Browser(final String name, final String version, final boolean robot) {
        this.name = name;
        this.version = version;
        this.robot = robot;
    }

    public Browser(final String name, final String version) {
        this(name, version, false);
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder(this.name);

        if (this.version != null && this.version.length() > 0) {
            stringBuilder.append(" ").append(this.version);
        }

        return stringBuilder.toString();
    }

    public boolean isRobot() {
        return robot;
    }
}
