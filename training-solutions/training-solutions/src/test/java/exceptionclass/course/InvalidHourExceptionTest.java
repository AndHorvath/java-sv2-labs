package exceptionclass.course;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvalidHourExceptionTest {

    InvalidHourException invalidHourException;

    @BeforeEach
    void setUp() {
        invalidHourException = new InvalidHourException(25);
    }

    @Test
    void createTest() {
        assertEquals("Hour is invalid (0-23)", invalidHourException.getMessage());
    }

    @Test
    void getParameterHourTest() {
        assertEquals(25, invalidHourException.getParameterHour());
    }
}