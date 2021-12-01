package algorithmsmax.sales;

public class Salesperson {

    // --- attributes ---------------------------------------------------------

    private String name;
    private int amount;
    private int target;

    // --- constructors -------------------------------------------------------

    public Salesperson(String name, int amount, int target) {
        this.name = name;
        this.amount = amount;
        this.target = target;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public int getAmount() { return amount; }
    public int getTarget() { return target; }
}