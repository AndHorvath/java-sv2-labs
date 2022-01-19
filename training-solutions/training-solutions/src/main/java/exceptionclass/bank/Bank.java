package exceptionclass.bank;

import java.util.List;

public class Bank {

    // --- attributes ---------------------------------------------------------

    private List<Account> accounts;

    // --- constructors -------------------------------------------------------

    public Bank(List<Account> accounts) {
        validateParameter(accounts);

        this.accounts = accounts;
    }

    // --- getters and setters ------------------------------------------------

    public List<Account> getAccounts() { return accounts; }

    // --- public methods -----------------------------------------------------

    public void subtractAccount(String accountNumber, double amount) {
        Account accountToOperateOn = getAccount(accountNumber);
        accountToOperateOn.subtract(amount);
    }

    public void depositAccount(String accountNumber, double amount) {
        Account accountToOperateOn = getAccount(accountNumber);
        accountToOperateOn.deposit(amount);
    }

    // --- private methods ----------------------------------------------------

    private Account getAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        throw new InvalidAccountNumberBankOperationException(accountNumber);
    }

    private void validateParameter(List<Account> accounts) {
        if (accounts == null) {
            throw new IllegalArgumentException("List of accounts cannot be null.");
        }
    }
}