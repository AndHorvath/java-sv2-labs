package methodoverloading;

import java.nio.file.Paths;
import java.util.List;
import java.util.Locale;

public class ClassFiveA {

    // --- attributes ---------------------------------------------------------

    private List<String> students;

    // --- constructors -------------------------------------------------------

    public ClassFiveA(List<String> students) {
        this.students = students;
    }

    // --- getters and setters ------------------------------------------------

    public List<String> getStudents() { return students; }

    // --- public methods -----------------------------------------------------

    public String getTodayReferringStudent(int number) {
        return students.get(number);
    }

    public String getTodayReferringStudent(Number number) {
        return students.get(number.getValue());
    }

    public String getTodayReferringStudent(String number) {
        return students.get(Number.valueOf(number.toUpperCase()).getValue());
    }
}