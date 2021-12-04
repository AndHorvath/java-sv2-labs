package algorithmstransformation.family;

public class FamilyMember {

    // --- attributes ---------------------------------------------------------

    private String name;
    private int age;

    // --- constructors -------------------------------------------------------

    public FamilyMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public int getAge() { return age; }
}