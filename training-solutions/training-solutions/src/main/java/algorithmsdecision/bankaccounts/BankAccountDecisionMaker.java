package algorithmsdecision.bankaccounts;

import java.util.List;

public class BankAccountDecisionMaker {

    public boolean containsBalanceGreaterThan(List<BankAccount> accounts, int min) {
        boolean contains = false;
        for (BankAccount account : accounts) {
            if (account.getBalance() > min) {
                contains = true;
                break;
            }
        }
        return contains;
    }
}