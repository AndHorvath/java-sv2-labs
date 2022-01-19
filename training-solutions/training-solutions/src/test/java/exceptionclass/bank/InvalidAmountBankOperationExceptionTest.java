package exceptionclass.bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvalidAmountBankOperationExceptionTest {

    InvalidAmountBankOperationException invalidAmountBankOperationExceptionA;
    InvalidAmountBankOperationException invalidAmountBankOperationExceptionB;
    double EPSILON;

    @BeforeEach
    void setUp() {
        invalidAmountBankOperationExceptionA =
            new InvalidAmountBankOperationException(-100_000d);
        invalidAmountBankOperationExceptionB =
            new InvalidAmountBankOperationException(200_000d, 100_000d);

        EPSILON = Math.pow(10d, -5d);
    }

    @Test
    void createTestA() {
        assertEquals(
            "Value cannot be negative.",
            invalidAmountBankOperationExceptionA.getMessage());
    }

    @Test
    void createTestB() {
        assertEquals(
            "Specified amount exceeds withdrawal limit.",
            invalidAmountBankOperationExceptionB.getMessage());
    }

    @Test
    void getParameterValueTest() {
        assertEquals(
            -100_000d, invalidAmountBankOperationExceptionA.getParameterValue(), EPSILON);
    }

    @Test
    void getParameterAmountTest() {
        assertEquals(
            200_000d, invalidAmountBankOperationExceptionB.getParameterAmount(), EPSILON);
    }

    @Test
    void getParameterMaxSubtractTest() {
        assertEquals(
            100_000d, invalidAmountBankOperationExceptionB.getParameterMaxSubtract(), EPSILON);
    }
}