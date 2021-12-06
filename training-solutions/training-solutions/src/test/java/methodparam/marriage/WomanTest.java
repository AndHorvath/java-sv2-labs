package methodparam.marriage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class WomanTest {

    Woman woman;
    RegisterDate registerDate;

    @BeforeEach
    void setUp() {
        registerDate = new RegisterDate("Short description", LocalDate.of(2000, 1, 1));
        woman = new Woman("Jane Smith", new ArrayList<>(Arrays.asList(registerDate)));
    }

    @Test
    void getNameTest() {
        assertEquals("Jane Smith", woman.getName());
    }

    @Test
    void setNameTest() {
        woman.setName("Jane Doe");
        assertEquals("Jane Doe", woman.getName());
    }

    @Test
    void getRegisterDatesTest() {
        assertEquals(1, woman.getRegisterDates().size());
        assertEquals(registerDate, woman.getRegisterDates().get(0));
    }

    @Test
    void addRegisterDateTest() {
        RegisterDate otherRegisterDate =
                new RegisterDate("Other description", LocalDate.of(2010, 10, 10));
        woman.addRegisterDate(otherRegisterDate);

        assertEquals(2, woman.getRegisterDates().size());
        assertEquals(otherRegisterDate, woman.getRegisterDates().get(1));
    }
}