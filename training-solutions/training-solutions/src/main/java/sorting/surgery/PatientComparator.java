package sorting.surgery;

import java.util.Comparator;

public class PatientComparator implements Comparator<Patient> {

    @Override
    public int compare(Patient patient, Patient other) {
        return patient.getTime().compareTo(other.getTime());
    }
}