package stringbuilder.airport;

public class AirportMain {

    public static void main(String[] args) {
        Airport airport = new Airport();
        Flight flightA = new Flight("A-4949", Status.ACTIVE);
        Flight flightB = new Flight("B-2351", Status.DELETED);
        Flight flightC = new Flight("M-1108", Status.ACTIVE);
        Flight flightD = new Flight("N-3125", Status.DELETED);
        Flight flightE = new Flight("R-3022", Status.ACTIVE);
        Flight flightF = new Flight("S-6135", Status.DELETED);

        airport.addFlight(flightA);
        airport.addFlight(flightB);
        airport.addFlight(flightC);
        airport.addFlight(flightD);
        airport.addFlight(flightE);
        airport.addFlight(flightF);

        System.out.println(airport.getFlights().size());
        System.out.println(airport.getDeletedFlights());
    }
}