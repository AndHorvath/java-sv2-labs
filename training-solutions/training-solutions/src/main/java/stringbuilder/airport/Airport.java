package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    // --- attributes ---------------------------------------------------------

    private final List<Flight> flights;

    // --- constructors -------------------------------------------------------

    public Airport() {
        flights = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<Flight> getFlights() { return flights; }

    // --- public methods -----------------------------------------------------

    public void addFlight(Flight flight) {
        if (!isFlightAlreadyAdded(flight)) {
            flights.add(flight);
        }
    }

    public String getDeletedFlights() {
        StringBuilder stringBuilder = new StringBuilder("Deleted flights:\n");

        for (Flight flight : flights) {
            if (flight.getStatus() == Status.DELETED) {
                stringBuilder.append(flight.getFlightNumber());
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString();
    }

    // --- private methods ----------------------------------------------------

    private boolean isFlightAlreadyAdded(Flight flight) {
        for (Flight addedFlight : flights) {
            if (addedFlight.getFlightNumber().equals(flight.getFlightNumber())) {
                return true;
            }
        }
        return false;
    }
}