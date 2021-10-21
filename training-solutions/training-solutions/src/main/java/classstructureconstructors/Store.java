package classstructureconstructors;

public class Store {

    // --- attributes ---------------------------------------------------------

    private String id;
    private String product;
    private int stock;

    // --- getters and setters ------------------------------------------------

    public String getId() { return this.id; }

    public String getProduct() { return this.product; }
    public void setProduct(String product) { this.product = product; }

    public int getStock() { return this.stock; }
    public void setStock(int stock) { this.stock = stock; }

    // --- constructors -------------------------------------------------------

    public Store(String id, String product) {
        this.id = id;
        this.product = product;
        stock = 0;
    }

    // --- public methods -----------------------------------------------------

    public void store(int newItems) {
        this.stock += newItems;
    }

    public void dispatch(int deliveredItems) {
        this.stock -= deliveredItems;
    }
}