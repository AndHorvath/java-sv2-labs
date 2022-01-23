package collectionslist;

import java.time.LocalDate;

public class Food {

    // --- attributes ---------------------------------------------------------

    private String name;
    private LocalDate expiryDate;

    // --- constructors -------------------------------------------------------

    public Food(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public LocalDate getExpiryDate() { return expiryDate; }
}