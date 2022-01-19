package exceptionclass.course;

public class SimpleTime {

    // --- attributes ---------------------------------------------------------

    private int hour;
    private int minute;

    // --- constructors -------------------------------------------------------

    public SimpleTime(int hour, int minute) {
        validateParameters(hour, minute);

        this.hour = hour;
        this.minute = minute;
    }

    public SimpleTime(String timeString) {
        validateParameter(timeString);

        this.hour = Integer.parseInt(timeString.split(":")[0]);
        this.minute = Integer.parseInt(timeString.split(":")[1]);
    }

    // --- getters and setters ------------------------------------------------

    public int getHour() { return hour; }
    public int getMinute() { return minute; }

    // --- public methods -----------------------------------------------------

    @Override
    public String toString() {
        return String.format("%02d", hour) + ":" + String.format("%02d", minute);
    }

    // --- private methods ----------------------------------------------------

    private void validateParameters(int hour, int minute) {
        if (hour < 0 || hour > 23) {
            throw new InvalidHourException(hour);
        }
        if (minute < 0 || minute > 59) {
            throw new InvalidMinuteException(minute);
        }
    }

    private void validateParameter(String timeString) {
        String regex = ":";
        if (timeString == null) {
            throw new InvalidTimeException("Time is null");
        }
        if (!timeString.contains(regex) ||
            timeString.split(regex).length != 2 ||
            timeString.split(regex)[0].length() != 2 ||
            timeString.split(regex)[0].length() != timeString.split(regex)[1].length()) {

            throw new InvalidTimeException(createFormatExceptionText());
        }
        try {
            Integer.parseInt(timeString.split(regex)[0]);
            Integer.parseInt(timeString.split(regex)[1]);
        } catch (NumberFormatException exception) {
            throw new InvalidTimeException(createFormatExceptionText(), exception);
        }
        validateParameters(
            Integer.parseInt(timeString.split(regex)[0]),
            Integer.parseInt(timeString.split(regex)[1]));
    }

    private String createFormatExceptionText() {
        return "Time is not hh:mm";
    }
}