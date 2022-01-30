package searching;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class LostAndFoundOfficeTest {

    LostAndFoundOffice lostAndFoundOffice;
    LostProperty lostPropertyA;
    LostProperty lostPropertyB;
    LostProperty lostPropertyC;
    LostProperty lostPropertyD;
    Throwable exception;

    @BeforeEach
    void setUp() {
        lostAndFoundOffice = new LostAndFoundOffice();

        lostPropertyA = new LostProperty(1, "Description A", LocalDate.of(2022, 1, 10));
        lostPropertyB = new LostProperty(2, "Description B", LocalDate.of(2022, 1, 10));
        lostPropertyC = new LostProperty(3, "Description C", LocalDate.of(2022, 1, 20));
        lostPropertyD = new LostProperty(4, "Description C", LocalDate.of(2022, 1, 30));
    }

    @Test
    void getLostPropertiesTest() {
        assertEquals(new ArrayList<>(), lostAndFoundOffice.getLostProperties());
    }

    @Test
    void addLostPropertyTest() {
        lostAndFoundOffice.addLostProperty(lostPropertyA);
        assertEquals(new ArrayList<>(List.of(lostPropertyA)), lostAndFoundOffice.getLostProperties());
    }

    @Test
    void findLostPropertyTest() {
        lostAndFoundOffice.addLostProperty(lostPropertyA);
        lostAndFoundOffice.addLostProperty(lostPropertyB);
        lostAndFoundOffice.addLostProperty(lostPropertyC);
        assertEquals(lostPropertyC, lostAndFoundOffice.findLostProperty(lostPropertyC));

        exception = assertThrows(
            IllegalStateException.class, () -> lostAndFoundOffice.findLostProperty(lostPropertyD));
        assertEquals("Specified property is not in the collection.", exception.getMessage());
    }
}