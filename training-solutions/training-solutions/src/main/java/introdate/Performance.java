package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class Performance {

    // --- attributes ---------------------------------------------------------

    private String name;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;

    // --- constructors -------------------------------------------------------

    public Performance(String name, LocalDate date, LocalTime startTime, LocalTime endTime) {
        this.name = name;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return this.name; }
    public LocalDate getDate() { return this.date; }
    public LocalTime getStartTime() { return this.startTime; }
    public LocalTime getEndTime() { return this.endTime; }

    // --- public methods -----------------------------------------------------

    public String getInfo() {
        return this.getName() + ": " + this.getDate() + " " + this.getStartTime() + " - " + this.getEndTime();
    }
}
