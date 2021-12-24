package inheritancemethods.employee;

public class Boss extends Employee {

    // --- attributes ---------------------------------------------------------

    public static final double LEADERSHIP_FACTOR = 0.1d;

    private int numberOfEmployees;

    // --- constructors -------------------------------------------------------

    public Boss(String name, String address, double salary, int numberOfEmployees) {
        super(name, address, salary);
        this.numberOfEmployees = numberOfEmployees;
    }

    // --- getters and setters ------------------------------------------------

    public int getNumberOfEmployees() { return numberOfEmployees; }

    @Override
    public double getSalary() {
        raiseSalary(numberOfEmployees * (int) (LEADERSHIP_FACTOR * 100d));
        return super.getSalary();
    }
}