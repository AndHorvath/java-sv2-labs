package exceptionclass.bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvalidBankOperationExceptionTest {

    InvalidBankOperationException invalidBankOperationExceptionA;
    InvalidBankOperationException invalidBankOperationExceptionB;
    String message;
    Throwable cause;

    @BeforeEach
    void setUp() {
        message = "Exception message";
        cause = new Exception();
        invalidBankOperationExceptionA = new InvalidBankOperationException(message);
        invalidBankOperationExceptionB = new InvalidBankOperationException(message, cause);
    }

    @Test
    void createTestA() {
        assertEquals(message, invalidBankOperationExceptionA.getMessage());
    }

    @Test
    void createTestB() {
        assertEquals(message, invalidBankOperationExceptionB.getMessage());
        assertEquals(cause, invalidBankOperationExceptionB.getCause());
    }
}