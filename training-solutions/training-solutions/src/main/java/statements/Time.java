package statements;

public class Time {

    // --- attributes ---------------------------------------------------------

    private int hour;
    private int minute;
    private int second;

    // --- constructors -------------------------------------------------------

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // --- getters and setters ------------------------------------------------

    public int getHour() { return this.hour; }

    public void setHour(int hour) { this.hour = hour; }

    public int getMinute() { return this.minute; }

    public void setMinute(int minute) { this.minute = minute; }

    public int getSecond() { return this.second; }

    public void setSecond(int second) { this.second = second; }

    // --- public methods -----------------------------------------------------

    public int getInMinutes() {
        return hour * 60 + minute;
    }

    public int getInSeconds() {
        return hour * 60 * 60 + minute * 60 + second;
    }

    public boolean earlierThan(Time otherTime) {
        return this.getInSeconds() < otherTime.getInSeconds();
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}