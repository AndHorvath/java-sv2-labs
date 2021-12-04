package algorithmstransformation.student;

import java.util.ArrayList;
import java.util.List;

public class PrimarySchool {

    // --- attributes ---------------------------------------------------------

    private List<Person> personList;

    // --- constructors -------------------------------------------------------

    public PrimarySchool(List<Person> personList) {
        this.personList = personList;
    }

    // --- getters and setters ------------------------------------------------

    public List<Person> getPersonList() { return personList; }

    // --- public methods -----------------------------------------------------

    public void addPerson(Person person) {
        personList.add(person);
    }

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        for (Person person : personList) {
            if (isStudentAge(person.getAge())) {
                students.add(new Student(person.getName(), person.getAddress()));
            }
        }
        return students;
    }

    // --- private methods ----------------------------------------------------

    private boolean isStudentAge(int age) {
        return 6 <= age && age <= 14;
    }
}