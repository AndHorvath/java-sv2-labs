package collectionscomp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BuildingTest {

    Building buildingA;
    Building buildingB;
    Building buildingC;

    @BeforeEach
    void setUp() {
        buildingA = new Building("Street A", 2, 100);
        buildingB = new Building("Street B", 1, 100);
        buildingC = new Building("Street C", 1, 200);
    }

    @Test
    void getAddressTest() {
        assertEquals("Street A", buildingA.getAddress());
    }

    @Test
    void getFloorsTest() {
        assertEquals(2, buildingA.getFloors());
    }

    @Test
    void getAreaTest() {
        assertEquals(100, buildingA.getArea());
    }

    @Test
    void compareToTest() {
        assertTrue(buildingA.compareTo(buildingB) > 0);
    }

    @Test
    void testEqualsTest() {
        assertEquals(buildingB, buildingC);
    }

    @Test
    void testHashCodeTest() {
        assertEquals(buildingB.hashCode(), buildingC.hashCode());
    }

    @Test
    void testToStringTest() {
        assertEquals("Address: Street A, floors: 2, area: 100", buildingA.toString());
    }
}