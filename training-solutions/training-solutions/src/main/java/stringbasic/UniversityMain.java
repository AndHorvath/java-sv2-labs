package stringbasic;

public class UniversityMain {

    public static void main(String[] args) {
        University university = new University();

        Person personA = new Person(
                "John Doe", "johndoe@doemail.com", "Main St. 1. 10101 London",
                "SSN111", "1111-2222", "12-21-1221");
        Person personB = new Person(
                "Jack Doe", "jackdoe@doemail.com", "Main St. 1. 10101 London",
                "SSN222", "2222-3333", "23-32-2332");
        Person personC = new Person(
                "Judd Doe", "judddoe@doemail.com", "Main St. 1. 10101 London",
                "SSN333", "3333-4444", "34-43-3443");

        Student studentA = new Student(personA, "NC-A12", "EI-A12");
        Student studentB = new Student(personB, "NC-B23", "EI-B23");
        Student studentC = new Student(personC, "NC-A12", "EI-A12");

        System.out.println(university.areEqual(studentA, studentB));
        System.out.println(university.areEqual(studentA, studentC));

        university.addStudent(studentA);
        university.addStudent(studentB);
        university.addStudent(studentC);

        System.out.println(university.getStudentList().size());
    }
}