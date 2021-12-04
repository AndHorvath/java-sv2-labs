package algorithmstransformation.student;

public class Student {

    // --- attributes ---------------------------------------------------------

    private String name;
    private String address;

    // --- constructors -------------------------------------------------------

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public String getAddress() { return address; }
}