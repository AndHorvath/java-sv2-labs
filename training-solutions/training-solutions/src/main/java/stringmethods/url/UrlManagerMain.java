package stringmethods.url;

public class UrlManagerMain {

    public static void main(String[] args) {
        String testUrl =
                "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";
        String testUrlWithPortWithoutProperties =
                "https://earthquake.usgs.gov:123/fdsnws/event/1/query";

        UrlManager urlManager = new UrlManager(testUrl);
        UrlManager urlManagerWithPortWithoutProperties = new UrlManager(testUrlWithPortWithoutProperties);

        System.out.println(urlManager.getProtocol());
        System.out.println(urlManager.getHost());
        System.out.println(urlManager.getPort());
        System.out.println(urlManager.getPath());
        System.out.println(urlManager.getQuery());
        System.out.println(urlManager.hasProperty("format"));
        System.out.println(urlManager.hasProperty("shape"));
        System.out.println(urlManager.getPropertyValue("format"));
        System.out.println(urlManager.getPropertyValue("shape"));
        System.out.println(urlManager.getPropertyValue("endtime"));

        System.out.println(urlManagerWithPortWithoutProperties.getProtocol());
        System.out.println(urlManagerWithPortWithoutProperties.getHost());
        System.out.println(urlManagerWithPortWithoutProperties.getPort());
        System.out.println(urlManagerWithPortWithoutProperties.getPath());
        System.out.println(urlManagerWithPortWithoutProperties.getQuery());
        System.out.println(urlManagerWithPortWithoutProperties.hasProperty("format"));
        System.out.println(urlManagerWithPortWithoutProperties.getPropertyValue("format"));
    }
}