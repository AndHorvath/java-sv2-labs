package algorithmscount.transaction;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionCounterTest {

    TransactionCounter transactionCounter;

    @BeforeEach
    void setUp() {
        transactionCounter = new TransactionCounter();
    }

    @Test
    void countCreditTransactionsUnderBoundTest() {
        List<Transaction> transactionList = Arrays.asList(
                new Transaction("AAA-111", TransactionType.CREDIT, 1000),
                new Transaction("BBB-222", TransactionType.DEBIT, 2000),
                new Transaction("CCC-333", TransactionType.CREDIT, 3000)
        );
        int upperBound = 2500;
        int expectedResult = 1;
        assertEquals(
                expectedResult,
                transactionCounter.countCreditTransactionsUnderBound(transactionList, upperBound));
    }
}