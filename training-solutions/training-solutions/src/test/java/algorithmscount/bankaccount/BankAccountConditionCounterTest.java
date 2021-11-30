package algorithmscount.bankaccount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountConditionCounterTest {

    BankAccountConditionCounter bankAccountConditionCounter;

    @BeforeEach
    void setUp() {
        bankAccountConditionCounter = new BankAccountConditionCounter();
    }

    @Test
    void countWithBalanceGreaterThanTest() {
        List<BankAccount> bankAccountList = Arrays.asList(
                new BankAccount("John Doe", "AAA-111", 1000),
                new BankAccount("Jack Doe", "BBB-222", 2000),
                new BankAccount("Jane Doe", "CCC-333", 3000)
        );
        int lowerBound = 1500;
        int expectedCount = 2;
        assertEquals(
                expectedCount,
                bankAccountConditionCounter.countWithBalanceGreaterThan(bankAccountList, lowerBound));
    }
}