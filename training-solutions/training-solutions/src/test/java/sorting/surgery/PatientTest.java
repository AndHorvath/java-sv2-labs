package sorting.surgery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

class PatientTest {

    Patient patient;
    LocalDateTime time;

    @BeforeEach
    void setUp() {
        time = LocalDateTime.now();
        patient = new Patient("Patient", "AA-11", time);
    }

    @Test
    void getNameTest() {
        assertEquals("Patient", patient.getName());
    }

    @Test
    void getSocialSecurityNumberTest() {
        assertEquals("AA-11", patient.getSocialSecurityNumber());
    }

    @Test
    void getTimeTest() {
        assertEquals(time, patient.getTime());
    }
}