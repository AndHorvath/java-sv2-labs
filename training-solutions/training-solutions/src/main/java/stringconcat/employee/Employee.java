package stringconcat.employee;

public class Employee {

    // --- attributes ---------------------------------------------------------

    private final String name;
    private String position;
    private int salary;

    // --- constructors -------------------------------------------------------

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public int getSalary() { return salary; }
    public void setSalary(int salary) { this.salary = salary; }

    // --- public methods -----------------------------------------------------

    @Override
    public String toString() {
        String separator = " - ";

        return name + separator + position + separator + salary + " GBP";
    }
}