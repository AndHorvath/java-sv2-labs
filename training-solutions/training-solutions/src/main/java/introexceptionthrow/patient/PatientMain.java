package introexceptionthrow.patient;

public class PatientMain {
    public static void main(String[] args) {
        String name = "James Doe";
        String socialSecurityNumberA = "123456788";
        String socialSecurityNumberB = "123456789";
        int yearOfBirth = 2000;
        Patient patientA;
        Patient patientB;

        patientA = new Patient(name, socialSecurityNumberA, yearOfBirth);
        System.out.println(patientA.getName());
        System.out.println(patientA.getSocialSecurityNumber());
        System.out.println(patientA.getYearOfBirth());

        patientB = new Patient(name, socialSecurityNumberB, yearOfBirth);
        System.out.println(patientB.getName());
        System.out.println(patientB.getSocialSecurityNumber());
        System.out.println(patientB.getYearOfBirth());
    }
}