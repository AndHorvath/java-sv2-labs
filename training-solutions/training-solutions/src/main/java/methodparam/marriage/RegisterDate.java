package methodparam.marriage;

import java.time.LocalDate;

public class RegisterDate {

    // --- attributes ---------------------------------------------------------

    private String description;
    private LocalDate date;

    // --- constructors -------------------------------------------------------

    public RegisterDate(String description, LocalDate date) {
        this.description = description;
        this.date = date;
    }

    // --- getters and setters ------------------------------------------------

    public String getDescription() { return description; }

    public LocalDate getDate() { return date; }
}