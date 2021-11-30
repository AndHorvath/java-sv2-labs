package algorithmscount.transaction;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    Transaction transaction;

    @BeforeEach
    void setUp() {
        transaction = new Transaction("AAA-111", TransactionType.CREDIT, 1000);
    }

    @Test
    void getAccountNumberTest() {
        String expectedAccountNumber = "AAA-111";
        assertEquals(expectedAccountNumber, transaction.getAccountNumber());
    }

    @Test
    void getTransactionTypeTest() {
        TransactionType expectedTransactionType = TransactionType.CREDIT;
        assertEquals(expectedTransactionType, transaction.getTransactionType());
    }

    @Test
    void getAmountTest() {
        int expectedAmount = 1000;
        assertEquals(expectedAmount, transaction.getAmount());
    }
}