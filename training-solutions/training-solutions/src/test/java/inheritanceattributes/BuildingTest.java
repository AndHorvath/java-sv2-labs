package inheritanceattributes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BuildingTest {

    Building building;

    @BeforeEach
    void setUp() {
        building = new Building("Building", 400.1d, 2);
    }

    @Test
    void protectedNameAttributeTest() {
        assertEquals("Building", building.name);
    }

    @Test
    void protectedAreaAttributeTest() {
        assertEquals(400.1d, building.area, Math.pow(10d, -5d));
    }

    @Test
    void getFloorsTest() {
        assertEquals(2, building.getFloors());
    }
}