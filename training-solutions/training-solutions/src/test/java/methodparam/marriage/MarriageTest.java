package methodparam.marriage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MarriageTest {

    Marriage marriage;

    @BeforeEach
    void setUp() {
        marriage = new Marriage();
    }

    @Test
    void getMarriedTest() {
        Woman woman = new Woman("Jane Smith", new ArrayList<>());
        Man man = new Man("Jack Doe", new ArrayList<>());
        marriage.getMarried(woman, man);

        assertEquals("Jane Doe", woman.getName());
        assertEquals(1, woman.getRegisterDates().size());
        assertEquals("házasságkötés ideje", woman.getRegisterDates().get(0).getDescription());
        assertEquals(LocalDate.now(), woman.getRegisterDates().get(0).getDate());

        assertEquals(1, man.getRegisterDates().size());
        assertEquals("házasságkötés ideje", man.getRegisterDates().get(0).getDescription());
        assertEquals(LocalDate.now(), man.getRegisterDates().get(0).getDate());
    }
}