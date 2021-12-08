package staticattrmeth;

public class BankTransaction {

    // --- attributes ---------------------------------------------------------

    private static final long MIN_TRANSACTION_VALUE = 1L;
    private static final long MAX_TRANSACTION_VALUE = 10_000_000L;
    private static long currentMinValue = MAX_TRANSACTION_VALUE;
    private static long currentMaxValue = MIN_TRANSACTION_VALUE;
    private static long countOfTransactions;
    private static long sumOfTransactions;

    private long transactionVale;

    // --- constructors -------------------------------------------------------

    public BankTransaction(long transactionValue) {
        validateTransactionValue(transactionValue);
        this.transactionVale = transactionValue;

        countOfTransactions++;
        sumOfTransactions += transactionValue;
        currentMinValue = Math.min(currentMaxValue, transactionValue);
        currentMaxValue = Math.max(currentMaxValue, transactionValue);
    }

    // --- getters and setters ------------------------------------------------

    public static long getCurrentMinValue() { return countOfTransactions == 0L ? 0L : currentMinValue; }
    public static long getCurrentMaxValue() { return countOfTransactions == 0L ? 0L : currentMaxValue; }
    public static long getSumOfTransactions() { return sumOfTransactions; }

    public long getTransactionVale() { return transactionVale; }

    // --- public methods -----------------------------------------------------

    public static void intTheDay() {
        currentMinValue = MAX_TRANSACTION_VALUE;
        currentMaxValue = MIN_TRANSACTION_VALUE;
        countOfTransactions = 0;
        sumOfTransactions = 0;
    }

    public static long getAverageOfTransactions() {
        return countOfTransactions == 0L ?
                0L : Math.round((double) sumOfTransactions / (double) countOfTransactions);
    }

    // --- private methods ----------------------------------------------------

    private void validateTransactionValue(long transactionVale) {
        if (transactionVale < MIN_TRANSACTION_VALUE || transactionVale > MAX_TRANSACTION_VALUE) {
            throw new IllegalArgumentException("Transaction value outside the limits.");
        }
    }
}