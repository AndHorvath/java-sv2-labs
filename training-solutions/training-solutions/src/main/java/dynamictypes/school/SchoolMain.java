package dynamictypes.school;

public class SchoolMain {

    public static void main(String[] args) {
        School school = new School("School", 12);
        School primarySchool = new PrimarySchool("Primary School", 8);
        School secondarySchool = new SecondarySchool("Secondary School", 4);

        System.out.println(school);
        System.out.println(primarySchool);
        System.out.println(secondarySchool);
    }
}