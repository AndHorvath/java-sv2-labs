package algorithmssum.sales;

public class Salesperson {

    // --- attributes ---------------------------------------------------------

    private String name;
    private int amount;

    // --- constructors -------------------------------------------------------

    public Salesperson(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public int getAmount() { return amount; }
}