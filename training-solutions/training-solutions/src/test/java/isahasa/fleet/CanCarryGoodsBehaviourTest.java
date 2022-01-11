package isahasa.fleet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CanCarryGoodsBehaviourTest {

    CanCarryGoodsBehaviour canCarryGoodsBehaviour;

    @BeforeEach
    void setUp() {
        canCarryGoodsBehaviour = new CanCarryGoodsBehaviour(1000);
    }

    @Test
    void getCargoWeightTest() {
        assertEquals(0, canCarryGoodsBehaviour.getCargoWeight());
    }

    @Test
    void getMaxCargoWeightTest() {
        assertEquals(1000, canCarryGoodsBehaviour.getMaxCargoWeight());
    }

    @Test
    void loadCargoTest() {
        assertEquals(200, canCarryGoodsBehaviour.loadCargo(1200));
        assertEquals(1000, canCarryGoodsBehaviour.getCargoWeight());
    }
}