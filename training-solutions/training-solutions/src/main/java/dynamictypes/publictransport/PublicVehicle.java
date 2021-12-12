package dynamictypes.publictransport;

public class PublicVehicle {

    // --- attributes ---------------------------------------------------------

    private int lineNumber;
    private double length;

    // --- constructors -------------------------------------------------------

    public PublicVehicle(int lineNumber, double length) {
        this.lineNumber = lineNumber;
        this.length = length;
    }

    // --- getters and setters ------------------------------------------------

    public int getLineNumber() { return lineNumber; }
    public double getLength() { return length; }
}