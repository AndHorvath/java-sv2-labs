package introexceptionmoreexceptions;

public class Person {

    // --- attributes ---------------------------------------------------------

    String name;
    int age;

    // --- constructors -------------------------------------------------------

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public int getAge() { return age; }

    // --- public methods -----------------------------------------------------

    @Override
    public String toString() {
        String separater = " ";
        return name + separater + age + separater + "years";
    }
}