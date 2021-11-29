package algorithmssum.transaction;

public class Transaction {

    // --- attributes ---------------------------------------------------------

    private String accountNumber;
    private TransactionOperation transactionOperation;
    private int amount;

    // --- constructors -------------------------------------------------------

    public Transaction(String accountNumber, TransactionOperation transactionOperation, int amount) {
        this.accountNumber = accountNumber;
        this.transactionOperation = transactionOperation;
        this.amount = amount;
    }

    // --- getters and setters ------------------------------------------------

    public String getAccountNumber() { return accountNumber; }
    public TransactionOperation getTransactionOperation() { return transactionOperation; }
    public int getAmount() { return amount; }
}