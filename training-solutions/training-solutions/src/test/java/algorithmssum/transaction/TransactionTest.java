package algorithmssum.transaction;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    Transaction transaction;

    @BeforeEach
    void setUp() {
        transaction = new Transaction("AAA-111", TransactionOperation.DEBIT ,1000);
    }

    @Test
    void getAccountNumberTest() {
        String expectedAccountNumber = "AAA-111";
        assertEquals(expectedAccountNumber, transaction.getAccountNumber());
    }

    @Test
    void getTransactionOperationTest() {
        TransactionOperation expectedTransactionOperation = TransactionOperation.DEBIT;
        assertEquals(expectedTransactionOperation, transaction.getTransactionOperation());
    }

    @Test
    void getAmountTest() {
        int expectedAmount = 1000;
        assertEquals(expectedAmount, transaction.getAmount());
    }
}