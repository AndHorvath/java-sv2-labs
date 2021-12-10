package constructoroverloading.bus;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleTimeTest {

    SimpleTime simpleTimeA;
    SimpleTime simpleTimeB;
    int hours;
    int minutes;

    @BeforeEach
    void setUp() {
        hours = 5;
        minutes = 10;
        simpleTimeA = new SimpleTime(hours);
        simpleTimeB = new SimpleTime(hours, minutes);
    }

    @Test
    void getHoursTest() {
        assertEquals(hours, simpleTimeA.getHours());
        assertEquals(hours, simpleTimeB.getHours());
    }

    @Test
    void getMinutesTest() {
        assertEquals(0, simpleTimeA.getMinutes());
        assertEquals(minutes, simpleTimeB.getMinutes());
    }

    @Test
    void getDifferenceTest() {
        assertEquals(10, simpleTimeB.getDifference(simpleTimeA));
    }

    @Test
    void testToStringTest() {
        assertEquals("5:10", simpleTimeB.toString());
    }
}