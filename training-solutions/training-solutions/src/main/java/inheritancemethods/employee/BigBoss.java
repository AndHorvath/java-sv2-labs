package inheritancemethods.employee;

public class BigBoss extends Boss {

    // --- attributes ---------------------------------------------------------

    private double bonus;

    // --- constructors -------------------------------------------------------

    public BigBoss(String name, String address, double salary, int numberOfEmployees, double bonus) {
        super(name, address, salary, numberOfEmployees);
        this.bonus = bonus;
    }

    // --- getters and setters ------------------------------------------------

    public double getBonus() { return bonus; }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }
}