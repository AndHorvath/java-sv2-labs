package enumtype.university;

public class UniversityMain {

    public static void main(String[] args) {
        University universityA = University.DE;
        University universityB = University.ELTE;
        String name;

        name = universityA.getName();
        System.out.println(name);
        name = universityB.getName();
        System.out.println(name);
    }
}