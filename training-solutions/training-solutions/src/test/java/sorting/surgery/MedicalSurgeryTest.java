package sorting.surgery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class MedicalSurgeryTest {

    MedicalSurgery medicalSurgery;
    LocalDate date;
    LocalTime time;
    Patient patientA;
    Patient patientB;
    Patient patientC;

    @BeforeEach
    void setUp() {
        date = LocalDate.now();
        time = LocalTime.of(10, 0);
        patientA = new Patient("A", "A-1", LocalDateTime.of(date, time));
        patientB = new Patient("B", "B-2", LocalDateTime.of(date, time.plusHours(1)));
        patientC = new Patient("C", "C-3", LocalDateTime.of(date, time.plusHours(2)));

        medicalSurgery = new MedicalSurgery(new ArrayList<>(Arrays.asList(
            patientC, patientB, patientA
        )));
    }

    @Test
    void getPatientsTest() {
        assertEquals(
            new ArrayList<>(Arrays.asList(patientC, patientB, patientA)),
            medicalSurgery.getPatients());
    }

    @Test
    void getPatientsInTimeOrderTest() {
        assertEquals(
            new ArrayList<>(Arrays.asList(patientA, patientB, patientC)),
            medicalSurgery.getPatientsInTimeOrder()
        );
        assertEquals(
            new ArrayList<>(Arrays.asList(patientC, patientB, patientA)),
            medicalSurgery.getPatients()
        );
    }
}