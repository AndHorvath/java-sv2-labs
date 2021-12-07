package methodoverloading;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    Time time;
    Time other;

    @BeforeEach
    void setUp() {
        time = new Time(10, 11, 12);
        other = new Time(10, 11, 13);
    }

    @Test
    void getHoursTest() {
        assertEquals(10, time.getHours());
    }

    @Test
    void getMinutesTest() {
        assertEquals(11, time.getMinutes());
    }

    @Test
    void getSecondsTest() {
        assertEquals(12, time.getSeconds());
    }

    @Test
    void isEqualTimeTest() {
        assertFalse(time.isEqual(other));
    }

    @Test
    void isEqualIntTest() {
        assertTrue(time.isEqual(10, 11, 12));
    }

    @Test
    void isEarlierTimeTest() {
        assertTrue(time.isEarlier(other));
    }

    @Test
    void isEarlierIntTest() {
        assertFalse(time.isEarlier(10, 11, 12));
    }
}