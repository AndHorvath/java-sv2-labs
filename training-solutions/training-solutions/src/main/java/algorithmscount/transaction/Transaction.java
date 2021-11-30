package algorithmscount.transaction;

public class Transaction {

    // --- attributes ---------------------------------------------------------

    private String accountNumber;
    private TransactionType transactionType;
    private int amount;

    // --- constructors -------------------------------------------------------

    public Transaction(String accountNumber, TransactionType transactionType, int amount) {
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    // --- getters and setters ------------------------------------------------

    public String getAccountNumber() { return accountNumber; }
    public TransactionType getTransactionType() { return transactionType; }
    public int getAmount() { return amount; }
}