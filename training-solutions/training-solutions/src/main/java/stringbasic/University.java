package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class University {

    // --- attributes ---------------------------------------------------------

    private final List<Student> studentList;

    // --- constructors -------------------------------------------------------

    public University() {
        studentList = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<Student> getStudentList() { return studentList; }

    // --- public methods -----------------------------------------------------

    public void addStudent(Student student) {
        for (Student actualStudent : studentList) {
            if (areEqual(student, actualStudent)) {
                return;
            }
        }
        studentList.add(student);
    }

    public boolean areEqual(Student student, Student otherStudent) {
        return
                student.getNeptunCode().equals(otherStudent.getNeptunCode()) &&
                student.getEducationId().equals(otherStudent.getEducationId());
    }
}