package interfacedependencyinversion.vaccine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class VaccineTest {

    Vaccine firstVaccine;
    Vaccine secondVaccine;
    List<Person> registrated;

    @BeforeEach
    void setUp() {
        registrated = new ArrayList<>(List.of(
            new Person("Jill Doe", 70, ChronicDisease.NO, Pregnancy.NO),
            new Person("Jeff Doe", 80, ChronicDisease.YES, Pregnancy.NO),
            new Person("John Doe", 40, ChronicDisease.NO, Pregnancy.NO),
            new Person("Jane Doe", 30, ChronicDisease.NO, Pregnancy.YES),
            new Person("Jack Doe", 50, ChronicDisease.YES, Pregnancy.NO)
        ));
        firstVaccine = new FirstVaccine();
        secondVaccine = new SecondVaccine();
    }

    @Test
    void getVaccinationListTest() {
        assertEquals(0, firstVaccine.getVaccinationList().size());
        assertEquals(0, secondVaccine.getVaccinationList().size());
    }

    @Test
    void generateVaccinationListTest() {
        firstVaccine.generateVaccinationList(registrated);
        assertEquals(5, firstVaccine.getVaccinationList().size());
        assertEquals(registrated.get(3), firstVaccine.getVaccinationList().get(0));
        assertEquals(registrated.get(0), firstVaccine.getVaccinationList().get(1));
        assertEquals(registrated.get(1), firstVaccine.getVaccinationList().get(2));
        assertEquals(registrated.get(2), firstVaccine.getVaccinationList().get(3));
        assertEquals(registrated.get(4), firstVaccine.getVaccinationList().get(4));

        secondVaccine.generateVaccinationList(registrated);
        assertEquals(2, secondVaccine.getVaccinationList().size());
        assertEquals(registrated.get(2), secondVaccine.getVaccinationList().get(0));
        assertEquals(registrated.get(0), secondVaccine.getVaccinationList().get(1));
    }
}