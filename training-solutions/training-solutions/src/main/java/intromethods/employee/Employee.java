package intromethods.employee;

public class Employee {

    // --- attributes ---------------------------------------------------------

    private String name;
    private int hiringYear;
    private int salary;

    // --- constructors -------------------------------------------------------

    public Employee(String name, int hiringYear, int salary) {
        this.name = name;
        this.hiringYear = hiringYear;
        this.salary = salary;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getHiringYear() { return hiringYear; }

    public int getSalary() { return salary; }

    // --- public methods -----------------------------------------------------

    public void raiseSalary(int amountOfIncrease) {
        salary += amountOfIncrease;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hiringYear=" + hiringYear +
                ", salary=" + salary +
                '}';
    }
}