package dynamictypes.publictransport;

public class Bus extends PublicVehicle {

    // --- attributes ---------------------------------------------------------

    private String brand;

    // --- constructors -------------------------------------------------------

    public Bus(int lineNumber, double length, String brand) {
        super(lineNumber, length);
        this.brand = brand;
    }

    // --- getters and setters ------------------------------------------------

    public String getBrand() { return brand; }
}