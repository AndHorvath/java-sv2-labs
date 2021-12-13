package inheritanceattributes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SchoolBuildingTest {

    SchoolBuilding schoolBuilding;

    @BeforeEach
    void setUp() {
        schoolBuilding = new SchoolBuilding("SchoolBuilding", 800.2d, 3, 12);
    }

    @Test
    void protectedNameAttributeTest() {
        assertEquals("SchoolBuilding", schoolBuilding.name);
    }

    @Test
    void protectedAreaAttributeTest() {
        assertEquals(800.2d, schoolBuilding.area, Math.pow(10d, -5d));
    }

    @Test
    void inheritedPrivateFloorsAttributeTest() {
        assertEquals(3, schoolBuilding.getFloors());
    }

    @Test
    void getNumberOfClassRoomsTest() {
        assertEquals(12, schoolBuilding.getNumberOfClassRooms());
    }
}