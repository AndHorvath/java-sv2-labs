package constructoroverloading.bus;

public class SimpleTime {

    // --- attributes ---------------------------------------------------------

    private int hours;
    private int minutes;

    // --- constructors -------------------------------------------------------

    public SimpleTime(int hours) {
        this.hours = hours;
    }

    public SimpleTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public SimpleTime(SimpleTime time) {
        this(time.hours, time.minutes);
    }

    // --- getters and setters ------------------------------------------------

    public int getHours() { return hours; }
    public int getMinutes() { return minutes; }

    // --- public methods -----------------------------------------------------

    public int getDifference(SimpleTime time) {
        return hours * 60 + minutes - time.hours * 60 - time.minutes;
    }

    @Override
    public String toString() {
        return hours + ":" + minutes;
    }
}