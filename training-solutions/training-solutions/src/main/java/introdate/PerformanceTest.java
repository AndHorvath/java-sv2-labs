package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {

    public static void main(String[] args) {
        String name = "Queen";
        LocalDate date = LocalDate.of(1989, 6, 2);
        LocalTime startTime = LocalTime.of(18, 0);
        LocalTime endTime = LocalTime.of(20, 0);
        Performance performance = new Performance(name, date, startTime, endTime);

        System.out.println(performance.getInfo());
    }
}
