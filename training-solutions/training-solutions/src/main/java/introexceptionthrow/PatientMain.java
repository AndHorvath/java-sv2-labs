package introexceptionthrow;

public class PatientMain {

    public static void main(String[] args) {
        String nameA = "James Doe";
        String nameB = "Jim Doe";
        String socialSecurityNumberA = "123456788";
        String socialSecurityNumberB = "123456788";
        int yearOfBirthA = 1999;
        int yearOfBirthB = 1899;
        Patient patientA;
        Patient patientB;

        patientA = new Patient(nameA, socialSecurityNumberA, yearOfBirthA);
        System.out.println(patientA.getName());
        System.out.println(patientA.getSocialSecurityNumber());
        System.out.println(patientA.getYearOfBirth());

        patientB = new Patient(nameB, socialSecurityNumberB, yearOfBirthB);
        System.out.println(patientB.getName());
        System.out.println(patientB.getSocialSecurityNumber());
        System.out.println(patientB.getYearOfBirth());
    }
}