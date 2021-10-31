package looptypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyGroupMain {

    public static void main(String[] args) {
        String[] studentsArray = new String[] {
                "William Adamson", "James Wilson", "Evelyn Burton", "Scarlett Harris", "Jack Lewis",
                "Hazel Stevens", "Carter Chapman", "Julian Owen", "Lily Webb", "Robert Holmes" };
        List<String> students = new ArrayList(Arrays.asList(studentsArray));
        StudyGroup studyGroup = new StudyGroup();

        studyGroup.printStudyGroups(students);
    }
}