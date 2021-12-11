package initializer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

    CreditCard creditCardA;
    CreditCard creditCardB;

    @BeforeEach
    void setUp() {
        creditCardA = new CreditCard(10_000L);
        creditCardB = new CreditCard(100L, Currency.EUR);
    }

    @Test
    void getBalanceTest() {
        assertEquals(10_000L, creditCardA.getBalance());
        assertEquals(36_580L, creditCardB.getBalance());
    }

    @Test
    void paymentTest() {
        creditCardA.payment(5_000L);
        assertEquals(5_000L, creditCardA.getBalance());
    }

    @Test
    void paymentTestOverload() {
        creditCardB.payment(50L, Currency.EUR);
        assertEquals(18_290L, creditCardB.getBalance());
    }
}