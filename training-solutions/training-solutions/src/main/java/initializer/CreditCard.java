package initializer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreditCard {

    // --- attributes ---------------------------------------------------------

    public static final List<Rate> EXCHANGE_RATES;

    private long balance;

    // --- initializers -------------------------------------------------------

    static {
        EXCHANGE_RATES = new ArrayList<>(Arrays.asList(
                new Rate(Currency.HUF, 1d),
                new Rate(Currency.EUR, 365.8d),
                new Rate(Currency.CHF, 350.99d),
                new Rate(Currency.GBP, 428.94d),
                new Rate(Currency.USD, 323.24d)
        ));
    }

    // --- constructors -------------------------------------------------------

    public CreditCard(long balance) {
        this.balance = balance;
    }

    public CreditCard(long balance, Currency currency) {
        this.balance = convertToHUF(balance, currency);
    }

    // --- getters and setters ------------------------------------------------

    public long getBalance() { return this.balance; }

    // --- public methods -----------------------------------------------------

    public void payment(long amount) {
        balance -= amount;
    }

    public void payment(long amount, Currency currency) {
        balance -= convertToHUF(amount, currency);
    }

    // --- private methods ----------------------------------------------------

    private long convertToHUF(long amount, Currency currency) {
        return Math.round(amount * getExchangeRate(currency));
    }

    private double getExchangeRate(Currency currency) {
        for (Rate rate : EXCHANGE_RATES) {
            if (rate.getCurrency() == currency) {
                return rate.getExchangeRate();
            }
        }
        throw new IllegalArgumentException("Currency mismatch.");
    }
}