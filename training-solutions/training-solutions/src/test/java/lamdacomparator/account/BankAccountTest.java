package lamdacomparator.account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount bankAccount;
    BankAccount other;

    double epsilon;

    @BeforeEach
    void setUp() {
        bankAccount = new BankAccount("B1", "Owner", 100.51);
        other = new BankAccount("A2", 100.501);

        epsilon = Math.pow(10, -5);
    }

    @Test
    void testGetAccountNumber() {
        assertEquals("B1", bankAccount.getAccountNumber());
        assertEquals("A2", other.getAccountNumber());
    }

    @Test
    void testGetNameOfOwner() {
        assertEquals("Owner", bankAccount.getNameOfOwner());
        assertNull(other.getNameOfOwner());
    }

    @Test
    void testGetBalance() {
        assertEquals(100.51, bankAccount.getBalance(), epsilon);
        assertEquals(100.501, other.getBalance(), epsilon);
    }

    @Test
    void testCompareTo() {
        assertTrue(bankAccount.compareTo(other) > 0);
    }
}