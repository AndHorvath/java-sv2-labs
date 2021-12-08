package staticattrmeth;

public class Dog {

    // --- attributes ---------------------------------------------------------

    private String name;
    private Species species;
    private int age;
    private long code;

    // --- constructors -------------------------------------------------------

    public Dog(String name, Species species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }

    public Species getSpecies() { return species; }

    public int getAge() { return age; }

    public long getCode() { return code; }
    public void setCode(long code) { this.code = code; }
}