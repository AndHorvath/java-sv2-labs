package looptypes;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {

    public void printStudyGroups(List<String> students) {
        List<String> shortNames = new ArrayList<>();
        List<String> longNames = new ArrayList<>();
        String shortNamesString;
        String longNamesString;

        for (String student : students) {
            if (student.length() - 1 <= 10) {
                shortNames.add(student);
            } else {
                longNames.add(student);
            }
        }
        shortNamesString = shortNames.toString();
        longNamesString = longNames.toString();
        shortNamesString = shortNamesString.substring(1, shortNamesString.length() - 1);
        longNamesString = longNamesString.substring(1, longNamesString.length() - 1);

        System.out.println("Members of the first group: " + shortNamesString);
        System.out.println("Members of the second group: " + longNamesString);
    }
}