package algorithmscount.transaction;

import java.util.List;

public class TransactionCounter {

    public int countCreditTransactionsUnderBound(List<Transaction> transactionList, int upperBound) {
        int counter = 0;
        for (Transaction transaction : transactionList) {
            if (isCredit(transaction) && isUnderBound(transaction, upperBound)) {
                counter++;
            }
        }
        return counter;
    }

    private boolean isCredit(Transaction transaction) {
        return transaction.getTransactionType() == TransactionType.CREDIT;
    }

    private boolean isUnderBound(Transaction transaction, int upperBound) {
        return transaction.getAmount() < upperBound;
    }
}