package controlselection.week;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DayOfWeekTest {

    @Test
    void getTypeOfDayTest() {
        DayOfWeek dayOfWeek = new DayOfWeek();

        assertEquals("hét eleje", dayOfWeek.getTypeOfDay("Hétfő"));
        assertEquals("hét közepe", dayOfWeek.getTypeOfDay("kedd"));
        assertEquals("hét közepe", dayOfWeek.getTypeOfDay("SZERDA"));
        assertEquals("majdnem hétvége", dayOfWeek.getTypeOfDay("péntek"));
        assertEquals("hétvége", dayOfWeek.getTypeOfDay("Szombat"));
        assertEquals("ismeretlen nap", dayOfWeek.getTypeOfDay("xyzXYZ"));
    }
}