package methodparam.marriage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RegisterDateTest {

    RegisterDate registerDate;

    @BeforeEach
    void setUp() {
        registerDate = new RegisterDate("Short description", LocalDate.of(2000, 1, 1));
    }

    @Test
    void getDescriptionTest() {
        assertEquals("Short description", registerDate.getDescription());
    }

    @Test
    void getDateTest() {
        assertEquals(LocalDate.of(2000, 1, 1), registerDate.getDate());
    }
}