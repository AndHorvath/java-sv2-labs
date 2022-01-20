package exceptionmulticatch.converter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvalidBinaryStringExceptionTest {

    InvalidBinaryStringException invalidBinaryStringExceptionA;
    InvalidBinaryStringException invalidBinaryStringExceptionB;

    String message;
    Throwable cause;

    @BeforeEach
    void setUp() {
        message = "Exception message";
        cause = new Exception();

        invalidBinaryStringExceptionA = new InvalidBinaryStringException(message);
        invalidBinaryStringExceptionB = new InvalidBinaryStringException(message, cause);
    }

    @Test
    void createTestA() {
        assertEquals(message, invalidBinaryStringExceptionA.getMessage());
    }

    @Test
    void createTestB() {
        assertEquals(message, invalidBinaryStringExceptionB.getMessage());
        assertEquals(cause, invalidBinaryStringExceptionB.getCause());
    }
}