package sorting.webshop;

import java.time.LocalDateTime;

public class Product {

    // --- attributes ---------------------------------------------------------

    private String name;
    private int price;
    private LocalDateTime dateTime;

    // --- constructors -------------------------------------------------------

    public Product(String name, int price, LocalDateTime dateTime) {
        this.name = name;
        this.price = price;
        this.dateTime = dateTime;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public int getPrice() { return price; }
    public LocalDateTime getDateTime() { return dateTime; }
}