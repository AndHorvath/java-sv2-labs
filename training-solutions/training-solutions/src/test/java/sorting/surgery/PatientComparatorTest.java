package sorting.surgery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

class PatientComparatorTest {

    PatientComparator patientComparator;
    Patient patientA;
    Patient patientB;
    LocalDateTime time;

    @BeforeEach
    void setUp() {
        patientComparator = new PatientComparator();
        time = LocalDateTime.now();
        patientA = new Patient("Patient A", "AA-11", time);
        patientB = new Patient("Patient B", "BB-22", time.plusHours(1));
    }

    @Test
    void compareTest() {
        assertTrue(patientComparator.compare(patientA, patientB) < 0);
    }
}