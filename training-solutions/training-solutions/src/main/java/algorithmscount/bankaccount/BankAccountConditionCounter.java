package algorithmscount.bankaccount;

import java.util.List;

public class BankAccountConditionCounter {

    public int countWithBalanceGreaterThan(List<BankAccount> bankAccountList, int lowerBound) {
        int counter = 0;
        for (BankAccount bankaccount : bankAccountList) {
            if (bankaccount.getBalance() > lowerBound) {
                counter++;
            }
        }
        return counter;
    }
}