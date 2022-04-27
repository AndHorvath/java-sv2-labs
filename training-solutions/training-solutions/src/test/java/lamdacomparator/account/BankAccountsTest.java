package lamdacomparator.account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountsTest {

    BankAccounts bankAccounts;
    BankAccounts other;

    BankAccount bankAccountA;
    BankAccount bankAccountB;
    BankAccount bankAccountC;
    BankAccount bankAccountD;
    BankAccount bankAccountE;
    BankAccount bankAccountF;

    @BeforeEach
    void setUp() {
        bankAccountA = new BankAccount("C-A1", "OwnerOA", -10.0);
        bankAccountB = new BankAccount("B-B2", "OwnerOB", 200.0);
        bankAccountC = new BankAccount("D-C3", "OwnerOC", -30.0);
        bankAccountD = new BankAccount("A-D4", "OwnerOA", 400.0);

        bankAccounts = new BankAccounts(List.of(bankAccountA, bankAccountB, bankAccountC, bankAccountD));
        other = new BankAccounts();
    }

    @Test
    void testGetBankAccounts() {
        assertEquals(
            List.of(bankAccountA, bankAccountB, bankAccountC, bankAccountD),
            bankAccounts.getBankAccounts());
        assertEquals(new ArrayList<>(), other.getBankAccounts());
    }

    @Test
    void testAddBankAccount() {
        other.addBankAccount(bankAccountA);
        assertEquals(List.of(bankAccountA), other.getBankAccounts());
    }

    @Test
    void testListBankAccountsByAccountNumber() {
        assertEquals(
            List.of(bankAccountD, bankAccountB, bankAccountA, bankAccountC),
            bankAccounts.listBankAccountsByAccountNumber());
    }

    @Test
    void testListBankAccountsByBalanceAbsoluteValue() {
        assertEquals(
            List.of(bankAccountA, bankAccountC, bankAccountB, bankAccountD),
            bankAccounts.listBankAccountsByBalanceAbsoluteValue());
    }

    @Test
    void testListBankAccountsByBalanceDescending() {
        assertEquals(
            List.of(bankAccountD, bankAccountB, bankAccountA, bankAccountC),
            bankAccounts.listBankAccountsByBalanceDescending());
    }

    @Test
    void testListBankAccountsByNameThenAccountNumber() {
        bankAccountE = new BankAccount("F-E5", 100);
        bankAccountF = new BankAccount("E-F6", 300);

        bankAccounts.addBankAccount(bankAccountE);
        bankAccounts.addBankAccount(bankAccountF);

        assertEquals(
            List.of(bankAccountF, bankAccountE, bankAccountD, bankAccountA, bankAccountB, bankAccountC),
            bankAccounts.listBankAccountsByNameThenAccountNumber());
    }
}