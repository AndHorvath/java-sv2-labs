package methodparam.marriage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class ManTest {

    Man man;
    RegisterDate registerDate;

    @BeforeEach
    void setUp() {
        registerDate = new RegisterDate("Short description", LocalDate.of(2000, 1, 1));
        man = new Man("Jack Doe", new ArrayList<>(Arrays.asList(registerDate)));
    }

    @Test
    void getNameTest() {
        assertEquals("Jack Doe", man.getName());
    }

    @Test
    void getRegisterDatesTest() {
        assertEquals(1, man.getRegisterDates().size());
        assertEquals(registerDate, man.getRegisterDates().get(0));
    }

    @Test
    void addRegisterDateTest() {
        RegisterDate otherRegisterDate =
                new RegisterDate("Other description", LocalDate.of(2010, 10, 10));
        man.addRegisterDate(otherRegisterDate);

        assertEquals(2, man.getRegisterDates().size());
        assertEquals(otherRegisterDate, man.getRegisterDates().get(1));
    }
}