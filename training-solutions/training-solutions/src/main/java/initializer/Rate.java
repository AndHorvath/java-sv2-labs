package initializer;

public class Rate {

    // --- attributes ---------------------------------------------------------

    private Currency currency;
    private double exchangeRate;

    // --- constructors -------------------------------------------------------

    public Rate(Currency currency, double exchangeRate) {
        this.currency = currency;
        this.exchangeRate = exchangeRate;
    }

    // --- getters and setters ------------------------------------------------

    public Currency getCurrency() { return currency; }
    public double getExchangeRate() { return exchangeRate; }

    public void setExchangeRate(double exchangeRate) { this.exchangeRate = exchangeRate; }
}