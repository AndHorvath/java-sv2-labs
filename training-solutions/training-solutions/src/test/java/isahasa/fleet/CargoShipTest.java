package isahasa.fleet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CargoShipTest {

    CargoShip cargoShip;

    @BeforeEach
    void setUp() {
        cargoShip = new CargoShip(1000);
    }

    @Test
    void getCanCarryGoodsTest() {
        assertEquals(
            1000, ((CanCarryGoodsBehaviour) cargoShip.getCanCarryGoods()).getMaxCargoWeight());
    }

    @Test
    void loadCargoTest() {
        assertEquals(200, cargoShip.loadCargo(1200));
        assertEquals(1000, cargoShip.getCargoWeight());
    }

    @Test
    void getCargoWeightTest() {
        assertEquals(0, cargoShip.getCargoWeight());
    }
}