package interfacerules;

public class Equator implements Name, Length {

    // --- attributes ---------------------------------------------------------

    private static final String NAME = "Equator";
    private static final double LENGTH = 40_000.0;

    // --- getters and setters ------------------------------------------------

    @Override
    public String getName() { return NAME; }

    @Override
    public double gerLength() { return LENGTH; }
}