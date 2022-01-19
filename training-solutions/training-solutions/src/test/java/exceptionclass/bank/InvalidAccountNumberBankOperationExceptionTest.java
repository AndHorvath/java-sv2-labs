package exceptionclass.bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvalidAccountNumberBankOperationExceptionTest {

    InvalidAccountNumberBankOperationException invalidAccountNumberBankOperationException;

    @BeforeEach
    void setUp() {
        invalidAccountNumberBankOperationException =
            new InvalidAccountNumberBankOperationException("AAA111");
    }

    @Test
    void createTest() {
        assertEquals(
            "No account with specified number.",
            invalidAccountNumberBankOperationException.getMessage());
    }

    @Test
    void getParameterAccountNumberTest() {
        assertEquals(
            "AAA111",
            invalidAccountNumberBankOperationException.getParameterAccountNumber());
    }
}