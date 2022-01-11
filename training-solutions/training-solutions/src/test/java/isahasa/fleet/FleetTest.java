package isahasa.fleet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class FleetTest {

    Fleet fleet;

    Liner liner;
    CargoShip cargoShip;
    FerryBoat ferryBoat;

    @BeforeEach
    void setUp() {
        fleet = new Fleet();

        liner = new Liner(200);
        cargoShip = new CargoShip(2000);
        ferryBoat = new FerryBoat(1000, 100);
    }

    @Test
    void getShipsTest() {
        assertEquals(0, fleet.getShips().size());

        addShips();
        assertEquals(3, fleet.getShips().size());
    }

    @Test
    void getWaitingPeopleTest() {
        assertEquals(0, fleet.getWaitingPeople());

        addShips();
        fleet.loadShip(330, 3300);
        assertEquals(30, fleet.getWaitingPeople());
    }

    @Test
    void getWaitingCargoTest() {
        assertEquals(0, fleet.getWaitingCargo());

        addShips();
        fleet.loadShip(330, 3300);
        assertEquals(300, fleet.getWaitingCargo());
    }

    @Test
    void addShipsTest() {
        addShips();
        assertEquals(3, fleet.getShips().size());
        assertEquals(liner, fleet.getShips().get(0));
        assertEquals(cargoShip, fleet.getShips().get(1));
        assertEquals(ferryBoat, fleet.getShips().get(2));
    }

    @Test
    void addShipTest() {
        fleet.addShip(liner);
        assertEquals(1, fleet.getShips().size());
        assertEquals(liner, fleet.getShips().get(0));
    }

    @Test
    void loadShipTest() {
        addShips();
        fleet.loadShip(330, 3300);

        assertEquals(200, ((Liner) fleet.getShips().get(0)).getPassengers());
        assertEquals(2000, ((CargoShip) fleet.getShips().get(1)).getCargoWeight());
        assertEquals(100, ((FerryBoat) fleet.getShips().get(2)).getPassengers());
        assertEquals(1000, ((FerryBoat) fleet.getShips().get(2)).getCargoWeight());

        assertEquals(30, fleet.getWaitingPeople());
        assertEquals(300, fleet.getWaitingCargo());
    }

    // --- private methods ----------------------------------------------------

    private void addShips() {
        fleet.addShips(new ArrayList<>(Arrays.asList(liner, cargoShip, ferryBoat)));
    }
}