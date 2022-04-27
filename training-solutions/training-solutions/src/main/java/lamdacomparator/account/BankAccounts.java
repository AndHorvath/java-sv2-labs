package lamdacomparator.account;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BankAccounts {

    // --- attributes ---------------------------------------------------------

    private List<BankAccount> bankAccounts;

    // --- constructors -------------------------------------------------------

    public BankAccounts() {
        bankAccounts = new ArrayList<>();
    }

    public BankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = new ArrayList<>(bankAccounts);
    }

    // --- getters and setters ------------------------------------------------

    public List<BankAccount> getBankAccounts() { return bankAccounts; }

    // --- public methods -----------------------------------------------------

    public void addBankAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    public List<BankAccount> listBankAccountsByAccountNumber() {
        List<BankAccount> auxList = new ArrayList<>(bankAccounts);
        auxList.sort(Comparator.naturalOrder());
        return auxList;
    }

    public List<BankAccount> listBankAccountsByBalanceAbsoluteValue() {
        List<BankAccount> auxList = new ArrayList<>(bankAccounts);
        auxList.sort(Comparator.comparingDouble(bankAccount -> Math.abs(bankAccount.getBalance())));
        return auxList;
    }

    public List<BankAccount> listBankAccountsByBalanceDescending() {
        List<BankAccount> auxList = new ArrayList<>(bankAccounts);
        auxList.sort(Comparator.comparingDouble(BankAccount::getBalance).reversed());
        return auxList;
    }

    public List<BankAccount> listBankAccountsByNameThenAccountNumber() {
        List<BankAccount> auxList = new ArrayList<>(bankAccounts);
        auxList.sort(Comparator
            .comparing(BankAccount::getNameOfOwner, Comparator.nullsFirst(String::compareTo))
            .thenComparing(BankAccount::getAccountNumber));
        return auxList;
    }
}