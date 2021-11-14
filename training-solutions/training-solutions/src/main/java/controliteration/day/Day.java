package controliteration.day;

import java.util.ArrayList;
import java.util.List;

public class Day {

    // --- attributes ---------------------------------------------------------

    private List<Hour> hoursOfDay;

    // --- constructors -------------------------------------------------------

    public Day() {
        hoursOfDay = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<Hour> getHoursOfDay() { return hoursOfDay; }

    // --- public methods -----------------------------------------------------

    public void addHour(Hour hour) {
        hoursOfDay.add(hour);
    }

    public void setDayPeriod() {
        for (Hour hour : hoursOfDay) {
            if (6 <= hour.getHourNumber() && hour.getHourNumber() < 22) {
                hour.setPeriod(DayPeriod.DAYTIME);
            } else {
                hour.setPeriod(DayPeriod.NIGHTTIME);
            }
        }
    }
}