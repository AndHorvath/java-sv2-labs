package collectionsset;

import java.util.*;

public class PhysicalEducation {

    public Set<Integer> getOrderInLessons(List<Student> students) {
        Set<Integer> orderInLessons = new TreeSet<>();
        for (Student student : students) {
            orderInLessons.add(student.getHeight());
        }
        return orderInLessons;
    }

    public static void main(String[] args) {
        PhysicalEducation physicalEducation = new PhysicalEducation();
        List<Student> students = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            students.add(new Student("Student " + (i + 1), random.nextInt(160, 181)));
        }
        Set<Integer> orderInLessons = physicalEducation.getOrderInLessons(students);
        System.out.println(orderInLessons);
        System.out.println(orderInLessons.size());
    }
}