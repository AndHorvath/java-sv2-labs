package exceptionclass.course;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleTimeTest {

    SimpleTime simpleTimeA;
    SimpleTime simpleTimeB;

    Throwable exception;
    String invalidFormatMessage;

    @BeforeEach
    void setUp() {
        simpleTimeA = new SimpleTime(5, 3);
        simpleTimeB = new SimpleTime("05:03");

        invalidFormatMessage = "Time is not hh:mm";
    }

    @Test
    void getHourTest() {
        assertEquals(5, simpleTimeA.getHour());
        assertEquals(5, simpleTimeB.getHour());
    }

    @Test
    void getMinuteTest() {
        assertEquals(3, simpleTimeA.getMinute());
        assertEquals(3, simpleTimeB.getMinute());
    }

    @Test
    void toStringTest() {
        assertEquals("05:03", simpleTimeA.toString());
        assertEquals("05:03", simpleTimeB.toString());
    }

    @Test
    void createTestInvalidHourInteger() {
        exception = assertThrows(InvalidHourException.class, () -> new SimpleTime(25, 3));
        assertEquals("Hour is invalid (0-23)", exception.getMessage());
        assertEquals(25, ((InvalidHourException) exception).getParameterHour());
    }

    @Test
    void createTestInvalidMinuteInteger() {
        exception = assertThrows(InvalidMinuteException.class, () -> new SimpleTime(5, 61));
        assertEquals("Minute is invalid (0-59)", exception.getMessage());
        assertEquals(61, ((InvalidMinuteException) exception).getParameterMinute());
    }

    @Test
    void createTestInvalidTimeNull() {
        exception = assertThrows(InvalidTimeException.class, () -> new SimpleTime(null));
        assertEquals("Time is null", exception.getMessage());
    }

    @Test
    void createTestInvalidTimeString() {
        exception = assertThrows(InvalidTimeException.class, () -> new SimpleTime("123"));
        assertEquals(invalidFormatMessage, exception.getMessage());

        exception = assertThrows(InvalidTimeException.class, () -> new SimpleTime("1:2:3"));
        assertEquals(invalidFormatMessage, exception.getMessage());

        exception = assertThrows(InvalidTimeException.class, () -> new SimpleTime("1:23"));
        assertEquals(invalidFormatMessage, exception.getMessage());

        exception = assertThrows(InvalidTimeException.class, () -> new SimpleTime("12:3"));
        assertEquals(invalidFormatMessage, exception.getMessage());
    }

    @Test
    void createTestInvalidNumberFormatString() {
        exception = assertThrows(InvalidTimeException.class, () -> new SimpleTime("a2:34"));
        assertEquals(invalidFormatMessage, exception.getMessage());
        assertEquals(NumberFormatException.class, exception.getCause().getClass());

        exception = assertThrows(InvalidTimeException.class, () -> new SimpleTime("12:3a"));
        assertEquals(invalidFormatMessage, exception.getMessage());
        assertEquals(NumberFormatException.class, exception.getCause().getClass());
    }

    @Test
    void createTestInvalidHourString() {
        exception = assertThrows(InvalidHourException.class, () -> new SimpleTime("25:03"));
        assertEquals("Hour is invalid (0-23)", exception.getMessage());
        assertEquals(25, ((InvalidHourException) exception).getParameterHour());
    }

    @Test
    void createTestInvalidMinuteString() {
        exception = assertThrows(InvalidMinuteException.class, () -> new SimpleTime("05:61"));
        assertEquals("Minute is invalid (0-59)", exception.getMessage());
        assertEquals(61, ((InvalidMinuteException) exception).getParameterMinute());
    }
}