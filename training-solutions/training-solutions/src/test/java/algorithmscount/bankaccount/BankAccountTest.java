package algorithmscount.bankaccount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount bankAccount;

    @BeforeEach
    void setUp() {
        bankAccount = new BankAccount("John Doe", "AAA-111", 1000);
    }

    @Test
    void getNameOfOwnerTest() {
        String expectedNameOfOwner = "John Doe";
        assertEquals(expectedNameOfOwner, bankAccount.getNameOfOwner());
    }

    @Test
    void getAccountNumberTest() {
        String expectedAccountNumber = "AAA-111";
        assertEquals(expectedAccountNumber, bankAccount.getAccountNumber());
    }

    @Test
    void getBalanceTest() {
        int expectedBalance = 1000;
        assertEquals(expectedBalance, bankAccount.getBalance());
    }
}