package references.dogs;

public class Dog {

    // --- attributes ---------------------------------------------------------

    private String name;
    private String colour;
    private int age;

    // --- constructors -------------------------------------------------------

    public Dog(String name, String colour, int age) {
        this.name = name;
        this.colour = colour;
        this.age = age;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getColour() { return colour; }
    public void setColour(String colour) { this.colour = colour; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    // --- public methods -----------------------------------------------------

    @Override
    public String toString() {
        return "The dog's name is: " + name + ", its age is: " + age + " years and its colour is: " + colour + ".";
    }
}