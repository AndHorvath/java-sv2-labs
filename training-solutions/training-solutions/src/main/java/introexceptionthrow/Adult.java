package introexceptionthrow;

public class Adult {

    // --- attributes ---------------------------------------------------------

    private String name;
    private int age;

    // --- constructors -------------------------------------------------------

    public Adult(String name, int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Under 18.");
        }
        this.name = name;
        this.age = age;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public int getAge() { return age; }
}