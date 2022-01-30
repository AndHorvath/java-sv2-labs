package collectionscomp;

import java.text.Collator;
import java.util.*;

public class School {

    public static void main(String[] args) {
        Set<Student> studentsWithHeights = new TreeSet<>(new StudentComparator());
        studentsWithHeights.add(new Student("Aladár", 180));
        studentsWithHeights.add(new Student("Éva", 160));
        studentsWithHeights.add(new Student("Ábel", 190));
        studentsWithHeights.add(new Student("Etelka", 170));

        System.out.println(studentsWithHeights);

        Map<String, Integer> studentsWithNames = new TreeMap<>(Collator.getInstance(new Locale("hu", "HU")));
        studentsWithNames.put("Aladár", 180);
        studentsWithNames.put("Éva", 160);
        studentsWithNames.put("Ábel", 190);
        studentsWithNames.put("Etelka", 170);

        System.out.println(studentsWithNames);
    }
}