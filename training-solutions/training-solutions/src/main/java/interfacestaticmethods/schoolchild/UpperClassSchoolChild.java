package interfacestaticmethods.schoolchild;

public class UpperClassSchoolChild implements PrimarySchoolChild {

    // --- attributes ---------------------------------------------------------

    private String name;
    private int age;

    // --- constructors -------------------------------------------------------

    public UpperClassSchoolChild(int age) {
        this.age = age;
    }

    public UpperClassSchoolChild(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public int getAge() { return age; }
}