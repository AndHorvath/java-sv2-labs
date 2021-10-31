package looptypesmodify;

import java.util.ArrayList;
import java.util.List;

public class LanguageSchool {

    // --- attributes ---------------------------------------------------------

    private final List<Student> students;

    // --- constructors -------------------------------------------------------

    public LanguageSchool() { students = new ArrayList<>(); }

    // --- getters and setters ------------------------------------------------

    public List<Student> getStudents() { return students; }

    // --- public methods -----------------------------------------------------

    public void addStudents(List<Student> students) {
        for (Student student : students) {
            this.students.add(student);
        }
    }

    public void deleteInactive() {
        List<Student> studentsToDelete = new ArrayList<>();

        for (Student student : students) {
            if (!student.getActive()) {
                studentsToDelete.add(student);
            }
        }
        students.removeAll(studentsToDelete);
    }

    public void printSchoolAndSchoolSize() {
        List<String> names = new ArrayList<>();

        for (Student student: students) {
            names.add(student.getName());
        }
        System.out.println(names + ", " + names.size());
    }
}
