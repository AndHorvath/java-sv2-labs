package exceptionclass.course;

public class InvalidMinuteException extends InvalidTimeException {

    // --- attributes ---------------------------------------------------------

    private int parameterMinute;

    // --- constructors -------------------------------------------------------

    public InvalidMinuteException(int parameterMinute) {
        super("Minute is invalid (0-59)");
        this.parameterMinute = parameterMinute;
    }

    // --- getters and setters ------------------------------------------------

    public int getParameterMinute() { return parameterMinute; }
}