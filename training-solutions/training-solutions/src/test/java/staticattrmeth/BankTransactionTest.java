package staticattrmeth;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankTransactionTest {

    BankTransaction bankTransactionA;
    BankTransaction bankTransactionB;

    @Test
    void createTestException() {
        handleCreateException(0L);
        handleCreateException(10_000_001L);
    }

    @Test
    void getCurrentMinValueTest() {
        BankTransaction.intTheDay();
        assertEquals(0L, BankTransaction.getCurrentMinValue());

        bankTransactionA = new BankTransaction(1_000_000L);
        bankTransactionB = new BankTransaction(2_000_000L);
        assertEquals(1_000_000L, BankTransaction.getCurrentMinValue());
    }

    @Test
    void getCurrentMaxValueTest() {
        BankTransaction.intTheDay();
        assertEquals(0L, BankTransaction.getCurrentMaxValue());

        bankTransactionA = new BankTransaction(1_000_000L);
        bankTransactionB = new BankTransaction(2_000_000L);
        assertEquals(2_000_000L, BankTransaction.getCurrentMaxValue());
    }

    @Test
    void getSumOfTransactionsTest() {
        BankTransaction.intTheDay();
        bankTransactionA = new BankTransaction(1_000_000L);
        bankTransactionB = new BankTransaction(2_000_000L);
        assertEquals(3_000_000L, BankTransaction.getSumOfTransactions());
    }

    @Test
    void getTransactionValeTest() {
        bankTransactionA = new BankTransaction(1_000_000L);
        bankTransactionB = new BankTransaction(2_000_000L);
        assertEquals(1_000_000L, bankTransactionA.getTransactionVale());
        assertEquals(2_000_000L, bankTransactionB.getTransactionVale());
    }

    @Test
    void intTheDayTest() {
        BankTransaction.intTheDay();
        assertEquals(0L, BankTransaction.getCurrentMinValue());
        assertEquals(0L, BankTransaction.getCurrentMaxValue());
        assertEquals(0L, BankTransaction.getSumOfTransactions());
    }

    @Test
    void getAverageOfTransactionsTest() {
        BankTransaction.intTheDay();
        assertEquals(0L, BankTransaction.getAverageOfTransactions());

        bankTransactionA = new BankTransaction(1_000_000L);
        bankTransactionB = new BankTransaction(2_000_000L);
        assertEquals(1_500_000L, BankTransaction.getAverageOfTransactions());
    }

    private void handleCreateException(long transactionValue) {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class, () -> new BankTransaction(transactionValue));
        assertEquals("Transaction value outside the limits.", exception.getMessage());
    }
}