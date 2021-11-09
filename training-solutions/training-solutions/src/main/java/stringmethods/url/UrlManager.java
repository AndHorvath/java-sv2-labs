package stringmethods.url;

public class UrlManager {

    // --- attributes ---------------------------------------------------------

    private String protocol;
    private String host;
    private String path;
    private String query;
    private Integer port;

    // --- constructors -------------------------------------------------------

    public UrlManager(String url) {
        protocol = determineProtocol(url);
        host = determineHost(url);
        path = determinePath(url);
        query = determineQuery(url);
        port = determinePort(url);
    }

    // --- getters and setters ------------------------------------------------

    public String getProtocol() { return protocol; }
    public String getHost() { return host; }
    public String getPath() { return path; }
    public String getQuery() {return query; }
    public Integer getPort() { return port; }

    // --- public methods -----------------------------------------------------

    public boolean hasProperty(String property) {
        return
                getQuery().indexOf(property.concat("=")) == 0 ||
                getQuery().contains("&".concat(property).concat("="));
    }

    public String getPropertyValue(String property) {
        if (hasProperty(property)) {
            String auxString =
                    getQuery().replace(
                            getQuery().substring(0, getQuery().indexOf(property) + property.length() + 1),
                            "");
            return auxString.contains("&") ? auxString.substring(0, auxString.indexOf("&")) : auxString;
        }
        return "There is no \"" + property + "\" property in the URL.";
    }

    // --- private methods ----------------------------------------------------

    private String determineProtocol(String url) {
        return url.substring(0, url.indexOf("://")).toLowerCase();
    }

    private String determineHost(String url) {
        String auxUrl = url.replace(determineProtocol(url).concat("://"), "");
        if (hasPort(url)) {
            return auxUrl.substring(0, auxUrl.indexOf(":"));
        }
        return auxUrl.substring(0, auxUrl.indexOf("/")).toLowerCase();
    }

    private Integer determinePort(String url) {
        if (!hasPort(url)) {
            return null;
        }
        String auxUrl =
                url.replace(determineProtocol(url).concat("://").concat(determineHost(url).concat(":")), "");
        return Integer.parseInt(auxUrl.substring(0, auxUrl.indexOf("/")));
    }

    private String determinePath(String url) {
        String auxUrl = url.replace(determinePartBeforePath(url), "");

        if (hasPropertyValuePairs(url)) {
            return auxUrl.substring(0, auxUrl.indexOf("?"));
        }
        return auxUrl;
    }

    private String determineQuery(String url) {
        if (!hasPropertyValuePairs(url)) {
            return "";
        }
        return url.replace(determinePartBeforePath(url).concat(determinePath(url).concat("?")), "");
    }

    private String determinePartBeforePath(String url) {
        String portString = "";

        if (hasPort(url)) {
            portString = portString.concat(":").concat(Integer.toString(determinePort(url)));
        }
        return determineProtocol(url).concat("://").concat(determineHost(url)).concat(portString).concat("/");
    }

    private boolean hasPort(String url) {
        String auxUrl = url.replace(determineProtocol(url).concat("://"), "");
        return auxUrl.substring(0, auxUrl.indexOf("/")).contains(":");
    }

    private boolean hasPropertyValuePairs(String url) {
        String auxUrl = url.replace(determinePartBeforePath(url), "");
        return auxUrl.contains("?");
    }
}