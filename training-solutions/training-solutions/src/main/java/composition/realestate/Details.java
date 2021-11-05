package composition.realestate;

public class Details {

    // --- attributes ---------------------------------------------------------

    private String description;
    private Address address;
    private int squareMeter;
    private int areaOfSite;

    // --- constructors -------------------------------------------------------

    public Details(String description, Address address, int squareMeter, int areaOfSite) {
        this.description = description;
        this.address = address;
        this.squareMeter = squareMeter;
        this.areaOfSite = areaOfSite;
    }

    // --- getters and setters ------------------------------------------------

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }

    public int getSquareMeter() { return squareMeter; }
    public void setSquareMeter(int squareMeter) { this.squareMeter = squareMeter; }

    public int getAreaOfSite() { return areaOfSite; }
    public void setAreaOfSite(int areaOfSite) { this.areaOfSite = areaOfSite; }

    // --- public methods -----------------------------------------------------

    @Override
    public String toString() {
        return description + " " + address.toString() + " " + squareMeter + " " + areaOfSite;
    }
}