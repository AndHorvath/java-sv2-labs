package enumtype.position;

public enum Position {
    EXECUTIVE_OFFICER(1500, "Financial counseling"),
    OPERATING_OFFICER(1600, "Tax preparation"),
    FINANCIAL_OFFICER(1700, "Office space"),
    MARKETING_OFFICER(1600, "Cars and drivers"),
    TECHNOLOGY_OFFICER(1500, "Cars and drivers");

    // --- attributes ---------------------------------------------------------

    private final int salary;
    private final String benefit;

    // --- constructor --------------------------------------------------------

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    // --- getters ------------------------------------------------------------

    public int getSalary() { return salary; }

    public String getBenefit() { return benefit; }

    // --- public methods -----------------------------------------------------

    @Override
    public String toString() {
        return this.name() + " " + salary + " " + benefit;
    }
}