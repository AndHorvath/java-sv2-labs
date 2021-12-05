package methodstructure.pendrives;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PenDriveTest {

    PenDrive penDrive;
    PenDrive otherA;
    PenDrive otherB;

    @BeforeEach
    void setUp() {
        penDrive = new PenDrive("PD-1", 16, 10_000);
    }

    @Test
    void getNameTest() {
        assertEquals("PD-1", penDrive.getName());
    }

    @Test
    void getCapacityTest() {
        assertEquals(16, penDrive.getCapacity());
    }

    @Test
    void getPriceTest() {
        assertEquals(10_000, penDrive.getPrice());
    }

    @Test
    void toStringTest() {
        assertEquals("PD-1 16 10000", penDrive.toString());
    }

    @Test
    void risePriceTest() {
        penDrive.risePrice(15);
        assertEquals(11500, penDrive.getPrice());
    }

    @Test
    void comparePricePerCapacityTest() {
        otherA = new PenDrive("PD-A", 32, 15_000);
        otherB = new PenDrive("PD-B", 32, 25_000);

        assertEquals(1, penDrive.comparePricePerCapacity(otherA));
        assertEquals(-1, penDrive.comparePricePerCapacity(otherB));
        assertEquals(0, penDrive.comparePricePerCapacity(penDrive));
    }

    @Test
    void isCheaperThanTest() {
        otherA = new PenDrive("PD-A", 32, 15_000);
        assertTrue(penDrive.isCheaperThan(otherA));
    }
}