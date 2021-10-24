package statements;

public class Investment {

    // --- attributes ---------------------------------------------------------

    private double cost = 0.003;
    private int fund;
    private int interestRate;
    private boolean active;

    // --- constructors -------------------------------------------------------

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
        this.active = true;
    }

    // --- public methods -----------------------------------------------------

    public double getYield(int numberOfDays) {
        return (double) fund * (double) interestRate / 100.0 * (double) numberOfDays / 365.0;
    }

    public double close(int numberOfDays) {
        boolean isAlreadyClosed;
        double amountPayable;

        isAlreadyClosed = !active;
        amountPayable = (fund + getYield(numberOfDays)) * (1.0 - cost);

        active = false;
        return isAlreadyClosed ? 0.0 : amountPayable;
    }
}