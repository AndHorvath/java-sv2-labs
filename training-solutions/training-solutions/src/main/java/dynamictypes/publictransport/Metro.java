package dynamictypes.publictransport;

public class Metro extends PublicVehicle {

    // --- attributes ---------------------------------------------------------

    private int numberOfStations;

    // --- constructors -------------------------------------------------------

    public Metro(int lineNumber, double length, int numberOfStations) {
        super(lineNumber, length);
        this.numberOfStations = numberOfStations;
    }

    // --- getters and setters ------------------------------------------------

    public int getNumberOfStations() { return numberOfStations; }
}