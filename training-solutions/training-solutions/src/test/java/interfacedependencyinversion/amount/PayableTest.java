package interfacedependencyinversion.amount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PayableTest {

    Payable amount;
    Payable cash;
    Payable bankAtm;

    @BeforeEach
    void setUp() {
        amount = new Amount();
        cash = new Cash();
        bankAtm = new BankAtm();
    }

    @Test
    void getPayableAmountTestAmount() {
        assertEquals(1234, amount.getPayableAmount(1234));
    }

    @Test
    void getPayableAmountTestCash() {
        assertEquals(1230, cash.getPayableAmount(1230));
        assertEquals(1230, cash.getPayableAmount(1231));
        assertEquals(1230, cash.getPayableAmount(1232));
        assertEquals(1235, cash.getPayableAmount(1233));
        assertEquals(1235, cash.getPayableAmount(1234));
        assertEquals(1235, cash.getPayableAmount(1235));
        assertEquals(1235, cash.getPayableAmount(1236));
        assertEquals(1235, cash.getPayableAmount(1237));
        assertEquals(1240, cash.getPayableAmount(1238));
        assertEquals(1240, cash.getPayableAmount(1239));
    }

    @Test
    void getPayableAmountTestBankAtm() {
        assertEquals(1000, bankAtm.getPayableAmount(1000));
        assertEquals(1000, bankAtm.getPayableAmount(1234));
        assertEquals(1000, bankAtm.getPayableAmount(1999));
    }
}
