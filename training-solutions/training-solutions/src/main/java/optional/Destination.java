package optional;

public class Destination {

    // --- attributes ---------------------------------------------------------

    private String name;
    private String description;
    private int kmFromHome;

    // --- constructors -------------------------------------------------------

    public Destination(String name, String description, int kmFromHome) {
        this.name = name;
        this.description = description;
        this.kmFromHome = kmFromHome;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public String getDescription() { return description; }
    public int getKmFromHome() { return kmFromHome; }
}