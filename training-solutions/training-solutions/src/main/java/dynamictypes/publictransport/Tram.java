package dynamictypes.publictransport;

public class Tram extends PublicVehicle {

    // --- attributes ---------------------------------------------------------

    private int numberOfTramcars;

    // --- constructors -------------------------------------------------------

    public Tram(int lineNumber, double length, int numberOfTramcars) {
        super(lineNumber, length);
        this.numberOfTramcars = numberOfTramcars;
    }

    // --- getters and setters ------------------------------------------------

    public int getNumberOfTramcars() { return numberOfTramcars; }
}