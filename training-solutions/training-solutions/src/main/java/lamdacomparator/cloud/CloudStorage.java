package lamdacomparator.cloud;

public class CloudStorage implements Comparable<CloudStorage> {

    // --- attributes ---------------------------------------------------------

    private String provider;
    private int space;
    private double price;
    private PayPeriod payPeriod;

    private static final int SPACE_UNIT = 1_000;
    private static final PayPeriod PERIOD_UNIT = PayPeriod.ANNUAL;

    // --- constructors -------------------------------------------------------

    public CloudStorage(String provider, int space) {
        this.provider = provider;
        this.space = space;
    }

    public CloudStorage(String provider, int space, double price, PayPeriod payPeriod) {
        this.provider = provider;
        this.space = space;
        this.price = price;
        this.payPeriod = payPeriod;
    }

    // --- getters and setters ------------------------------------------------

    public String getProvider() { return provider; }
    public int getSpace() { return space; }
    public double getPrice() { return price; }
    public PayPeriod getPayPeriod() { return payPeriod; }

    // --- public methods -----------------------------------------------------

    @Override
    public int compareTo(CloudStorage other) {
        return Double.compare(this.getPriceToCapacity(), other.getPriceToCapacity());
    }

    // --- private methods ----------------------------------------------------

    private double getPriceToCapacity() {
        return payPeriod == null ?
            0.0 : price / payPeriod.getLength() * PERIOD_UNIT.getLength() / space * SPACE_UNIT;
    }
}