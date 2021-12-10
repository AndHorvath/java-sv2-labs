package constructoroverloading.bus;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class BusTimeTableTest {

    BusTimeTable timeTableA;
    BusTimeTable timeTableB;
    List<SimpleTime> simpleTimeList;
    SimpleTime actual;

    @BeforeEach
    void setUp() {
        simpleTimeList = new ArrayList<>(Arrays.asList(
                new SimpleTime(5, 5), new SimpleTime(10, 10),
                new SimpleTime(9, 9), new SimpleTime(22, 22),
                new SimpleTime(4, 4), new SimpleTime(20, 20)));
        timeTableA = new BusTimeTable(simpleTimeList);
        timeTableB = new BusTimeTable(7, 21, 45);
    }

    @Test
    void getTimeTableTest() {
        assertEquals(simpleTimeList, timeTableA.getTimeTable());
        assertEquals(15, timeTableB.getTimeTable().size());
        assertEquals("15:45", timeTableB.getTimeTable().get(8).toString());
    }

    @Test
    void getNextBusTest() {
        actual = new SimpleTime(16, 30);
        assertEquals("20:20", timeTableA.getNextBus(actual).toString());
        assertEquals("16:45", timeTableB.getNextBus(actual).toString());

        actual = new SimpleTime(23);
        IllegalStateException exception = assertThrows(
                IllegalStateException.class, () -> timeTableA.getNextBus(actual));
        assertEquals("No departure after specified time.", exception.getMessage());
    }
}