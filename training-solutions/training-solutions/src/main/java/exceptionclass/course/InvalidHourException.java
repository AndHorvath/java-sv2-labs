package exceptionclass.course;

public class InvalidHourException extends InvalidTimeException {

    // --- attributes ---------------------------------------------------------

    private int parameterHour;

    // --- constructors -------------------------------------------------------

    public InvalidHourException(int parameterHour) {
        super("Hour is invalid (0-23)");
        this.parameterHour = parameterHour;
    }

    // --- getters and setters ------------------------------------------------

    public int getParameterHour() { return parameterHour; }
}