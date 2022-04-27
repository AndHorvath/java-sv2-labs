package lamdacomparator.account;

public class BankAccount implements Comparable<BankAccount> {

    // --- attributes ---------------------------------------------------------

    private String accountNumber;
    private String nameOfOwner;
    private double balance;

    // --- constructors -------------------------------------------------------


    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount(String accountNumber, String nameOfOwner, double balance) {
        this.accountNumber = accountNumber;
        this.nameOfOwner = nameOfOwner;
        this.balance = balance;
    }

    // --- getters and setters ------------------------------------------------

    public String getAccountNumber() { return accountNumber; }
    public String getNameOfOwner() { return nameOfOwner; }
    public double getBalance() { return balance; }

    // --- public methods -----------------------------------------------------

    @Override
    public int compareTo(BankAccount other) {
        return this.accountNumber.compareTo(other.accountNumber);
    }
}