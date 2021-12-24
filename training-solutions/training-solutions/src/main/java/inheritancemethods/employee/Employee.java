package inheritancemethods.employee;

public class Employee extends Person {

    // --- attributes ---------------------------------------------------------

    private double salary;

    // --- constructors -------------------------------------------------------

    public Employee(String name, String address, double salary) {
        super(name, address);
        this.salary = salary;
    }

    // --- getters and setters ------------------------------------------------

    public double getSalary() { return salary; }

    // --- public methods -----------------------------------------------------

    public void raiseSalary(int percent) {
        salary *= (1d + percent / 100d);
    }
}