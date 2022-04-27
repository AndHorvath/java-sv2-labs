package lamdacomparator.cloud;

public enum PayPeriod {

    MONTHLY(1), ANNUAL(12), LIFETIME(60);

    // --- attributes ---------------------------------------------------------

    private final int length;

    // --- constructors -------------------------------------------------------

    PayPeriod(int length) {
        this.length = length;
    }

    // --- getters and setters ------------------------------------------------

    public int getLength() { return length; }
}