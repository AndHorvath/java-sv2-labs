package algorithmsdecision.bankaccounts;

public class BankAccount {

    // --- attributes ---------------------------------------------------------

    private String nameOfOwner;
    private String accountNumber;
    private int balance;

    // --- constructors -------------------------------------------------------

    public BankAccount(String nameOfOwner, String accountNumber, int balance) {
        this.nameOfOwner = nameOfOwner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // --- setters and getters ------------------------------------------------

    public String getNameOfOwner() { return nameOfOwner; }
    public String getAccountNumber() { return accountNumber; }
    public int getBalance() { return balance; }

    // --- public methods -----------------------------------------------------

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void deposit(int amount) {
        balance += amount;
    }
}