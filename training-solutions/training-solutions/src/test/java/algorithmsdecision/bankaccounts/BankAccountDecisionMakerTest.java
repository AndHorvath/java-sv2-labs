package algorithmsdecision.bankaccounts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountDecisionMakerTest {

    BankAccountDecisionMaker decisionMaker;
    List<BankAccount> accounts;
    int minA;
    int minB;

    @BeforeEach
    void setUp() {
        decisionMaker = new BankAccountDecisionMaker();
        accounts = Arrays.asList(
                new BankAccount("John Doe", "AAA-111", 40_000),
                new BankAccount("Jack Doe", "BBB-222", 60_000),
                new BankAccount("Jane Doe", "CCC-333", 80_000)
        );
        minA = 70_000;
        minB = 90_000;
    }

    @Test
    void containsBalanceGreaterThanTest() {
        assertTrue(decisionMaker.containsBalanceGreaterThan(accounts, minA));
        assertFalse(decisionMaker.containsBalanceGreaterThan(accounts, minB));
    }
}