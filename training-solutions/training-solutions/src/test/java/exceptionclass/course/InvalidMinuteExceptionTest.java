package exceptionclass.course;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvalidMinuteExceptionTest {

    InvalidMinuteException invalidMinuteException;

    @BeforeEach
    void setUp() {
        invalidMinuteException = new InvalidMinuteException(61);
    }

    @Test
    void createTest() {
        assertEquals("Minute is invalid (0-59)", invalidMinuteException.getMessage());
    }

    @Test
    void getParameterMinuteTest() {
        assertEquals(61, invalidMinuteException.getParameterMinute());
    }
}