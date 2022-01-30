package searching;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class LostPropertyTest {

    LostProperty lostPropertyA;
    LostProperty lostPropertyB;
    LostProperty lostPropertyC;
    LostProperty lostPropertyD;

    @BeforeEach
    void setUp() {
        lostPropertyA = new LostProperty(1, "Description A", LocalDate.of(2022, 1, 10));
        lostPropertyB = new LostProperty(1, "Description B", LocalDate.of(2022, 1, 10));
        lostPropertyC = new LostProperty(1, "Description A", LocalDate.of(2022, 1, 20));
        lostPropertyD = new LostProperty(2, "Description A", LocalDate.of(2022, 1, 10));
    }

    @Test
    void getRegistryNumberTest() {
        assertEquals(1, lostPropertyA.getRegistryNumber());
    }

    @Test
    void getDescriptionTest() {
        assertEquals("Description A", lostPropertyA.getDescription());
    }

    @Test
    void getRegistrationDateTest() {
        assertEquals(LocalDate.of(2022, 1, 10), lostPropertyA.getRegistrationDate());
    }

    @Test
    void compareToTest() {
        assertTrue(lostPropertyA.compareTo(lostPropertyB) < 0);
        assertTrue(lostPropertyA.compareTo(lostPropertyC) < 0);
    }

    @Test
    void testEqualsTest() {
        assertEquals(lostPropertyA, lostPropertyD);
    }

    @Test
    void testHashCodeTest() {
        assertEquals(lostPropertyA.hashCode(), lostPropertyD.hashCode());
    }
}