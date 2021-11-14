package controlselection.month;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DaysInMonthTest {

    @Test
    void getDaysInMonthTest() {
        DaysInMonth daysInMonth = new DaysInMonth();

        assertEquals(31, daysInMonth.getDaysInMonth(2000, "január"));
        assertEquals(31, daysInMonth.getDaysInMonth(2000, "Március"));
        assertEquals(31, daysInMonth.getDaysInMonth(2000, "MÁJUS"));
        assertEquals(31, daysInMonth.getDaysInMonth(2000, "július"));
        assertEquals(31, daysInMonth.getDaysInMonth(2000, "Augusztus"));
        assertEquals(31, daysInMonth.getDaysInMonth(2000, "OKTÓBER"));
        assertEquals(31, daysInMonth.getDaysInMonth(2000, "december"));

        assertEquals(30, daysInMonth.getDaysInMonth(2000, "április"));
        assertEquals(30, daysInMonth.getDaysInMonth(2000, "Június"));
        assertEquals(30, daysInMonth.getDaysInMonth(2000, "SZEPTEMBER"));
        assertEquals(30, daysInMonth.getDaysInMonth(2000, "november"));

        assertEquals(29, daysInMonth.getDaysInMonth(2000, "február"));
        assertEquals(28, daysInMonth.getDaysInMonth(2100, "Február"));
        assertEquals(28, daysInMonth.getDaysInMonth(2001, "FEBRUÁR"));

        assertEquals(0, daysInMonth.getDaysInMonth(2000, "xyzXYZ"));
    }
}