package exceptionclass.bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LowBalanceBankOperationExceptionTest {

    LowBalanceBankOperationException lowBalanceBankOperationException;
    double EPSILON;

    @BeforeEach
    void setUp() {
        lowBalanceBankOperationException =
            new LowBalanceBankOperationException(200_000d, 100_000d);
        EPSILON = Math.pow(10d, -5d);
    }

    @Test
    void createTest() {
        assertEquals(
            "Balance is too low to withdraw specified amount.",
            lowBalanceBankOperationException.getMessage());
    }

    @Test
    void getParameterAmountTest() {
        assertEquals(
            200_000d, lowBalanceBankOperationException.getParameterAmount(), EPSILON);
    }

    @Test
    void getParameterBalanceTest() {
        assertEquals(
            100_000d, lowBalanceBankOperationException.getParameterBalance(), EPSILON);
    }
}