package exceptionclass.bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account account;
    Throwable exception;
    double EPSILON;

    @BeforeEach
    void setUp() {
        account = new Account("AA12", 200_000d);
        EPSILON = Math.pow(10d, -5d);
    }

    @Test
    void createTestInvalid() {
        exception = assertThrows(
            IllegalArgumentException.class,
            () -> new Account(null, 200_000d));
        assertEquals("Account number cannot be null.", exception.getMessage());

        exception = assertThrows(
            InvalidAmountBankOperationException.class,
            () -> new Account("AA12", -200_000d));
        assertEquals("Value cannot be negative.", exception.getMessage());
        assertEquals(-200_000, ((InvalidAmountBankOperationException) exception).getParameterValue());
    }

    @Test
    void getAccountNumberTest() {
        assertEquals("AA12", account.getAccountNumber());
    }

    @Test
    void getBalanceTest() {
        assertEquals(200_000d, account.getBalance(), EPSILON);
    }

    @Test
    void getMaxSubtractTest() {
        assertEquals(100_000d, account.getMaxSubtract(), EPSILON);
    }

    @Test
    void setMaxSubtractTest() {
        account.setMaxSubtract(200_000d);
        assertEquals(200_000d, account.getMaxSubtract(), EPSILON);
    }

    @Test
    void setMaxSubtractTestException() {
        exception = assertThrows(
            InvalidAmountBankOperationException.class,
            () -> account.setMaxSubtract(-100_000d));
        assertEquals("Value cannot be negative.", exception.getMessage());
        assertEquals(-100_000d, ((InvalidAmountBankOperationException) exception).getParameterValue());
    }

    @Test
    void subtractTest() {
        account.subtract(100_000d);
        assertEquals(100_000d, account.getBalance(), EPSILON);
    }

    @Test
    void subtractTestInvalid() {
        exception = assertThrows(
            InvalidAmountBankOperationException.class,
            () -> account.subtract(-100_000d));
        assertEquals("Value cannot be negative.", exception.getMessage());
        assertEquals(-100_000d, ((InvalidAmountBankOperationException) exception).getParameterValue());

        exception = assertThrows(
            InvalidAmountBankOperationException.class,
            () -> account.subtract(200_000d));
        assertEquals("Specified amount exceeds withdrawal limit.", exception.getMessage());
        assertEquals(200_000d, ((InvalidAmountBankOperationException) exception).getParameterAmount());
        assertEquals(100_000d, ((InvalidAmountBankOperationException) exception).getParameterMaxSubtract());

        account.subtract(100_000d);
        account.subtract(100_000d);
        exception = assertThrows(
            LowBalanceBankOperationException.class,
            () -> account.subtract(100_000d));
        assertEquals("Balance is too low to withdraw specified amount.", exception.getMessage());
        assertEquals(100_000d, ((LowBalanceBankOperationException) exception).getParameterAmount());
        assertEquals(0d, ((LowBalanceBankOperationException) exception).getParameterBalance());
    }

    @Test
    void depositTest() {
        account.deposit(100_000d);
        assertEquals(300_000d, account.getBalance(), EPSILON);
    }

    @Test
    void depositTextInvalid() {
        exception = assertThrows(
            InvalidAmountBankOperationException.class,
            () -> account.deposit(-100_000));
        assertEquals("Value cannot be negative.", exception.getMessage());
        assertEquals(-100_000d, ((InvalidAmountBankOperationException) exception).getParameterValue());
    }
}