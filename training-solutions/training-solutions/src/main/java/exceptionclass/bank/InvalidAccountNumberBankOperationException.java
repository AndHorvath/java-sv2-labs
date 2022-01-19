package exceptionclass.bank;

public class InvalidAccountNumberBankOperationException extends InvalidBankOperationException {

    // --- attributes ---------------------------------------------------------

    private String parameterAccountNumber;

    // --- constructors -------------------------------------------------------

    public InvalidAccountNumberBankOperationException(String parameterAccountNumber) {
        super("No account with specified number.");
        this.parameterAccountNumber = parameterAccountNumber;
    }

    // --- getters and setters ------------------------------------------------

    public String getParameterAccountNumber() { return parameterAccountNumber; }
}