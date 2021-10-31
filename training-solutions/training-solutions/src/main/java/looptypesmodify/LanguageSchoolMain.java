package looptypesmodify;

import java.util.ArrayList;
import java.util.List;

public class LanguageSchoolMain {

    public static void main(String[] args) {
        String[] studentsArray = new String[] {
                "William Adamson", "James Wilson", "Evelyn Burton", "Scarlett Harris", "Jack Lewis",
                "Hazel Stevens", "Carter Chapman", "Julian Owen", "Lily Webb", "Robert Holmes" };
        List<Student> students = new ArrayList<>();
        LanguageSchool languageSchool = new LanguageSchool();

        for (String student : studentsArray) {
            students.add(new Student(student));
        }
        languageSchool.addStudents(students);
        languageSchool.printSchoolAndSchoolSize();

        for (Student student : languageSchool.getStudents()) {
            if (student.getName().equals("James Wilson") ||
                student.getName().equals("Evelyn Burton") ||
                student.getName().equals("Julian Owen") ||
                student.getName().equals("Robert Holmes")) {

                student.setActive(false);
            }
        }
        languageSchool.deleteInactive();
        languageSchool.printSchoolAndSchoolSize();
    }
}
