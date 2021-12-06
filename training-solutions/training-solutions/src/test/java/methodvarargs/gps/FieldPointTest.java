package methodvarargs.gps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class FieldPointTest {

    FieldPoint fieldPoint;

    @BeforeEach
    void setUp() {
        fieldPoint = new FieldPoint(
                LocalDateTime.of(2020, Month.JUNE, 1, 12, 0),
                47.87d, 20.01d);
    }

    @Test
    void getTimeOfSettingTest() {
        assertEquals(2020, fieldPoint.getTimeOfSetting().getYear());
        assertEquals(Month.JUNE, fieldPoint.getTimeOfSetting().getMonth());
        assertEquals(1, fieldPoint.getTimeOfSetting().getDayOfMonth());
        assertEquals(12, fieldPoint.getTimeOfSetting().getHour());
        assertEquals(0, fieldPoint.getTimeOfSetting().getMinute());
    }

    @Test
    void getTimeOfLoggingTest() {
        assertNull(fieldPoint.getTimeOfLogging());
    }

    @Test
    void getLatitudeTest() {
        assertEquals(47.87d, fieldPoint.getLatitude(), Math.pow(10d, -5d));
    }

    @Test
    void getLongitudeTest() {
        assertEquals(20.01d, fieldPoint.getLongitude(), Math.pow(10d, -5d));
    }

    @Test
    void setTimeOfLoggingTest() {
        fieldPoint.setTimeOfLogging(
                LocalDateTime.of(2020, Month.JUNE, 5, 10, 30));

        assertEquals(2020, fieldPoint.getTimeOfLogging().getYear());
        assertEquals(Month.JUNE, fieldPoint.getTimeOfLogging().getMonth());
        assertEquals(5, fieldPoint.getTimeOfLogging().getDayOfMonth());
        assertEquals(10, fieldPoint.getTimeOfLogging().getHour());
        assertEquals(30, fieldPoint.getTimeOfLogging().getMinute());
    }
}