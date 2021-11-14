package controliteration.day;

public class Hour {

    // --- attributes ---------------------------------------------------------

    private int hourNumber;
    private DayPeriod period;

    // --- constructors -------------------------------------------------------

    public Hour(int hourNumber) {
        this.hourNumber = hourNumber;
    }

    // --- getters and setters ------------------------------------------------

    public int getHourNumber() { return hourNumber; }
    public void setHourNumber(int hourNumber) { this.hourNumber = hourNumber; }

    public DayPeriod getPeriod() { return period; }
    public void setPeriod(DayPeriod period) { this.period = period; }
}