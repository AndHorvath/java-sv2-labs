package isahasa.fleet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FerryBoatTest {

    FerryBoat ferryBoat;

    @BeforeEach
    void setUp() {
        ferryBoat = new FerryBoat(1000, 100);
    }

    @Test
    void getCanCarryGoodsTest() {
        assertEquals(
            1000, ((CanCarryGoodsBehaviour) ferryBoat.getCanCarryGoods()).getMaxCargoWeight());
    }

    @Test
    void getCanCarryPassengersTest() {
        assertEquals(
            100, ((CanCarryPassengersBehaviour) ferryBoat.getCanCarryPassengers()).getMaxPassengers());
    }

    @Test
    void loadCargoTest() {
        assertEquals(200, ferryBoat.loadCargo(1200));
    }

    @Test
    void getCargoWeightTest() {
        assertEquals(0, ferryBoat.getCargoWeight());
    }

    @Test
    void loadPassengerTest() {
        assertEquals(20, ferryBoat.loadPassenger(120));
    }

    @Test
    void getPassengersTest() {
        assertEquals(0, ferryBoat.getPassengers());
    }
}