package attributes.bill;

public class BillItem {

    // --- attributes ---------------------------------------------------------

    String product;
    int price;
    int quantity;
    double vatPercent;

    // --- constructors -------------------------------------------------------

    public BillItem(String product, int price, int quantity, double vatPercent) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.vatPercent = vatPercent;
    }

    // --- getters and setters ------------------------------------------------

    public String getProduct() { return product; }
    public int getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public double getVatPercent() { return vatPercent; }

    // --- public methods -----------------------------------------------------

    public double calculateTotalPrice() {
        return (double) price * (double) quantity * (1.0 + vatPercent / 100.0);
    }
}