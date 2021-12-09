package defaultconstructor.date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleDateTest {

    SimpleDate simpleDate;

    @BeforeEach
    void setUp() {
        simpleDate = new SimpleDate();
    }

    @Test
    void getYearTest() {
        assertEquals(0, simpleDate.getYear());
    }

    @Test
    void getMonthTest() {
        assertEquals(0, simpleDate.getMonth());
    }

    @Test
    void getDayTest() {
        assertEquals(0, simpleDate.getYear());
    }

    @Test
    void setDateTest() {
        simpleDate.setDate(2020, 7, 1);

        assertEquals(2020, simpleDate.getYear());
        assertEquals(7, simpleDate.getMonth());
        assertEquals(1, simpleDate.getDay());
    }

    @Test
    void setDateTestException() {
        handleDateException(1899, 7, 1);
        handleDateException(2020, 14, 1);
        handleDateException(2020, 7, 32);
        handleDateException(2020, 6, 31);
        handleDateException(2021, 2, 29);
        handleDateException(1900, 2, 29);
    }

    private void handleDateException(int year, int month, int day) {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class, () -> simpleDate.setDate(year, month, day));
        assertEquals("Incorrect date data.", exception.getMessage());
    }
}