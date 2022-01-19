package exceptionclass.bank;

public class Account {

    // --- attributes ---------------------------------------------------------

    private String accountNumber;
    private double balance;
    private double maxSubtract;

    private static final double MAX_SUBTRACT = 100_000d;
    private static final double EPSILON = Math.pow(10d, -5d);

    // --- constructors -------------------------------------------------------

    public Account(String accountNumber, double balance) {
        validateParameters(accountNumber, balance);

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.maxSubtract = MAX_SUBTRACT;
    }

    // --- getters and setters ------------------------------------------------

    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }
    public double getMaxSubtract() { return maxSubtract; }

    public void setMaxSubtract(double maxSubtract) {
        validateSign(maxSubtract);
        this.maxSubtract = maxSubtract;
    }

    // --- public methods -----------------------------------------------------

    public void subtract(double amount) {
        validateParameter(amount);
        balance -= amount;
    }

    public void deposit(double amount) {
        validateSign(amount);
        balance += amount;
    }

    // --- private methods ----------------------------------------------------

    private void validateParameters(String accountNumber, double balance) {
        if (accountNumber == null) {
            throw new IllegalArgumentException("Account number cannot be null.");
        }
        validateSign(balance);
    }

    private void validateParameter(double amount) {
        validateSign(amount);
        if (isGreater(amount, maxSubtract)) {
            throw new InvalidAmountBankOperationException(amount, maxSubtract);
        } else if (isGreater(amount, balance)) {
            throw new LowBalanceBankOperationException(amount, balance);
        }
    }

    private void validateSign(double value) {
        if (isLess(value, 0d)) {
            throw new InvalidAmountBankOperationException(value);
        }
    }

    private boolean isGreater(double valueA, double valueB) {
        return valueA > valueB + EPSILON;
    }

    private boolean isLess(double valueA, double valueB) {
        return valueA < valueB - EPSILON;
    }
}