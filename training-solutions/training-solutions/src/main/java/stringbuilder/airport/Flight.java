package stringbuilder.airport;

public class Flight {

    // --- attributes ---------------------------------------------------------

    private final String flightNumber;
    private Status status;

    // --- constructors -------------------------------------------------------

    public Flight(String flightNumber, Status status) {
        this.flightNumber = flightNumber;
        this.status = status;
    }

    // --- getters and setters ------------------------------------------------

    public String getFlightNumber() { return flightNumber; }

    public Status getStatus() { return status; }

    public void setStatus(Status status) { this.status = status; }
}