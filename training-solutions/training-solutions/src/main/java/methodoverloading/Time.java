package methodoverloading;

public class Time {

    // --- attributes ---------------------------------------------------------

    private int hours;
    private int minutes;
    private int seconds;

    // --- constructors -------------------------------------------------------


    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // --- getters and setters ------------------------------------------------


    public int getHours() { return hours; }
    public int getMinutes() { return minutes; }
    public int getSeconds() { return seconds; }

    // --- public methods -----------------------------------------------------

    public boolean isEqual(Time time) {
        return hours == time.getHours() && minutes == time.getMinutes() && seconds == time.getSeconds();
    }

    public boolean isEqual(int hours, int minutes, int seconds) {
        return this.hours == hours && this.minutes == minutes && this.seconds == seconds;
    }

    public boolean isEarlier(Time time) {
        return
                hours * 3600 + minutes * 60 + seconds <
                time.getHours() * 3600 + time.getMinutes() * 60 + time.getSeconds();
    }

    public boolean isEarlier(int hours, int minutes, int seconds) {
        return this.hours * 3600 + this.minutes * 60 + this.seconds < hours * 3600 + minutes * 60 + seconds;
    }
}