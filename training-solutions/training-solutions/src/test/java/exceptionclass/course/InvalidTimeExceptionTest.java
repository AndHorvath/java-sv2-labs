package exceptionclass.course;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvalidTimeExceptionTest {

    InvalidTimeException invalidTimeExceptionA;
    InvalidTimeException invalidTimeExceptionB;
    String message;
    Throwable cause;

    @BeforeEach
    void setUp() {
        message = "Exception message";
        cause = new Exception();
        invalidTimeExceptionA = new InvalidTimeException(message);
        invalidTimeExceptionB = new InvalidTimeException(message, cause);
    }

    @Test
    void createTestA() {
        assertEquals(message, invalidTimeExceptionA.getMessage());
    }

    @Test
    void createTestB() {
        assertEquals(message, invalidTimeExceptionB.getMessage());
        assertEquals(cause, invalidTimeExceptionB.getCause());
    }
}