package exceptionclass.bank;

public class LowBalanceBankOperationException extends InvalidBankOperationException {

    // --- attributes ---------------------------------------------------------

    private double parameterAmount;
    private double parameterBalance;

    // --- constructors -------------------------------------------------------

    public LowBalanceBankOperationException(double parameterAmount, double parameterBalance) {
        super("Balance is too low to withdraw specified amount.");
        this.parameterAmount = parameterAmount;
        this.parameterBalance = parameterBalance;
    }

    // --- getters and setters ------------------------------------------------

    public double getParameterAmount() { return parameterAmount; }
    public double getParameterBalance() { return parameterBalance; }
}