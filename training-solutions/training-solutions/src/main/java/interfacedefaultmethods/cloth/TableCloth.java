package interfacedefaultmethods.cloth;

public class TableCloth implements Square {

    // --- attributes ---------------------------------------------------------

    private double side;

    // --- constructors -------------------------------------------------------

    public TableCloth(double side) {
        this.side = side;
    }

    // --- getters and setters ------------------------------------------------

    @Override
    public double getSide() { return side; }
}