package collectionsqueue;

public class Person {

    // --- attributes ---------------------------------------------------------

    private String name;
    private int age;

    // --- constructors -------------------------------------------------------

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public int getAge() { return age; }
}