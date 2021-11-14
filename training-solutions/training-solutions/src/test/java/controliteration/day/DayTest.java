package controliteration.day;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DayTest {

    Day day;
    int firstTime;
    int secondTime;

    @BeforeEach
    void initDay() {
        day = new Day();
        firstTime = 5;
        secondTime = 17;

        day.addHour(new Hour(firstTime));
        day.addHour(new Hour(secondTime));
        day.setDayPeriod();
    }

    @Test
    void addHourTest() {
        int[] expectedHours = new int[] { 5, 17 };

        for (int i = 0; i < day.getHoursOfDay().size(); i++) {
            assertEquals(expectedHours[i], day.getHoursOfDay().get(i).getHourNumber());
        }
    }

    @Test
    void setDayPeriodTest() {
        DayPeriod[] expectedDayPeriods = new DayPeriod[] { DayPeriod.NIGHTTIME, DayPeriod.DAYTIME };

        for (int i = 0; i < day.getHoursOfDay().size(); i++) {
            assertEquals(expectedDayPeriods[i], day.getHoursOfDay().get(i).getPeriod());
        }
    }
}