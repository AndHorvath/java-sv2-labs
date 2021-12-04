package algorithmstransformation.student;

public class Person {

    // --- attributes ---------------------------------------------------------

    private String name;
    private String address;
    private int age;

    // --- constructors -------------------------------------------------------

    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public String getAddress() { return address; }
    public int getAge() { return age; }
}