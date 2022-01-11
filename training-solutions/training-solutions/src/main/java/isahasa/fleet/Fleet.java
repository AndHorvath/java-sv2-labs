package isahasa.fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet {

    // --- attributes ---------------------------------------------------------

    private List<Ship> ships;
    private int waitingPeople;
    private int waitingCargo;

    // --- constructors -------------------------------------------------------

    public Fleet() {
        ships = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<Ship> getShips() { return ships; }
    public int getWaitingPeople() {return waitingPeople; }
    public int getWaitingCargo() { return waitingCargo; }

    // --- public methods -----------------------------------------------------

    public void addShips(List<Ship> ships) {
        for (Ship ship : ships) {
            addShip(ship);
        }
    }

    public void addShip(Ship ship) {
        ships.add(ship);
    }

    public void loadShip(int passengers, int cargoWeight) {
        int passengersToLoad = passengers;
        int cargoToLoad = cargoWeight;
        for (Ship ship : ships) {
            if (ship instanceof CanCarryPassengers) {
                passengersToLoad = ((CanCarryPassengers) ship).loadPassenger(passengersToLoad);
            }
            if (ship instanceof CanCarryGoods) {
                cargoToLoad = ((CanCarryGoods) ship).loadCargo(cargoToLoad);
            }
        }
        waitingPeople = passengersToLoad;
        waitingCargo = cargoToLoad;
    }
}