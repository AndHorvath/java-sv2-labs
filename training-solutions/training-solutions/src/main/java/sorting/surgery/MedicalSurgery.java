package sorting.surgery;

import java.util.ArrayList;
import java.util.List;

public class MedicalSurgery {

    // --- attributes ---------------------------------------------------------

    private List<Patient> patients;

    // --- constructors -------------------------------------------------------

    public MedicalSurgery(List<Patient> patients) {
        this.patients = patients;
    }

    // --- getters and setters ------------------------------------------------

    public List<Patient> getPatients() { return patients; }

    // --- public methods -----------------------------------------------------

    public List<Patient> getPatientsInTimeOrder() {
        List<Patient> auxPatients = new ArrayList<>(patients);
        auxPatients.sort(new PatientComparator());
        return auxPatients;
    }
}