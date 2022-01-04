package interfacestaticmethods.schoolchild;

public class LowerClassSchoolChild implements PrimarySchoolChild {

    // --- attributes ---------------------------------------------------------

    private String name;
    private int age;

    // --- constructors -------------------------------------------------------

    public LowerClassSchoolChild(int age) {
        this.age = age;
    }

    public LowerClassSchoolChild(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public int getAge() { return age; }
}