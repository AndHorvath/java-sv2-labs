package exceptionclass.bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    Bank bank;
    List<Account> accounts;
    Throwable exception;

    double EPSILON;

    @BeforeEach
    void setUp() {
        accounts = new ArrayList<>(Arrays.asList(
            new Account("AA12", 200_000d), new Account("BB34", 400_000d)));
        bank = new Bank(accounts);

        EPSILON = Math.pow(10d, -5d);
    }

    @Test
    void createTestInvalid() {
        accounts = null;
        exception = assertThrows(IllegalArgumentException.class, () -> new Bank(accounts));
        assertEquals("List of accounts cannot be null.", exception.getMessage());
    }

    @Test
    void getAccountsTest() {
        assertEquals(accounts, bank.getAccounts());
    }

    @Test
    void subtractAccountTest() {
        bank.subtractAccount("AA12", 100_000d);
        assertEquals(100_000d, bank.getAccounts().get(0).getBalance(), EPSILON);
    }

    @Test
    void subtractAccountTestInvalid() {
        exception = assertThrows(
            InvalidAccountNumberBankOperationException.class,
            () -> bank.subtractAccount("CC56", 100_000d));
        assertEquals("No account with specified number.", exception.getMessage());
        assertEquals(
            "CC56", ((InvalidAccountNumberBankOperationException) exception).getParameterAccountNumber());
    }

    @Test
    void depositAccountTest() {
        bank.depositAccount("BB34", 100_000d);
        assertEquals(500_000d, bank.getAccounts().get(1).getBalance(), EPSILON);
    }

    @Test
    void depositAccountTestInvalid() {
        exception = assertThrows(
            InvalidAccountNumberBankOperationException.class,
            () -> bank.depositAccount("CC56", 100_000d));
        assertEquals("No account with specified number.", exception.getMessage());
        assertEquals(
            "CC56", ((InvalidAccountNumberBankOperationException) exception).getParameterAccountNumber());
    }
}