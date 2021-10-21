package classstructureintegrate;

public class BankAccount {

    // --- attributes ---------------------------------------------------------

    private String accountNumber;
    private String owner;
    private int balance;

    // --- constructors -------------------------------------------------------

    public BankAccount(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    // --- public methods -----------------------------------------------------

    public void deposit(int amount) { this.balance += amount; }
    public void withdraw(int amount) { this.balance -= amount; }

    public String getInfo() {
        return this.owner + " (" + this.accountNumber + "): " + this.balance + " Ft";
    }
}
