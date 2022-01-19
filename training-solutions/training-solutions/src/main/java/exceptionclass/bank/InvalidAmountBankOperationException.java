package exceptionclass.bank;

public class InvalidAmountBankOperationException extends InvalidBankOperationException {

    // --- attributes ---------------------------------------------------------

    private double parameterValue;
    private double parameterAmount;
    private double parameterMaxSubtract;

    // --- constructors -------------------------------------------------------

    public InvalidAmountBankOperationException(double parameterValue) {
        super("Value cannot be negative.");
        this.parameterValue = parameterValue;
    }

    public InvalidAmountBankOperationException(double parameterAmount, double parameterMaxSubtract) {
        super("Specified amount exceeds withdrawal limit.");
        this.parameterAmount = parameterAmount;
        this.parameterMaxSubtract = parameterMaxSubtract;
    }

    // --- getters and setters ------------------------------------------------

    public double getParameterValue() { return parameterValue; }
    public double getParameterAmount() { return parameterAmount; }
    public double getParameterMaxSubtract() { return parameterMaxSubtract; }
}