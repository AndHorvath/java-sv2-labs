package introconstructors;

import java.time.LocalDate;

public class CyclingTour {

    // --- attributes ---------------------------------------------------------

    private String description;
    private LocalDate startDate;
    int numberOfPeople;
    double kms;

    // --- constructors -------------------------------------------------------

    public CyclingTour(String description, LocalDate startDate) {
        this.description = description;
        this.startDate = startDate;
    }

    // --- getters and setters ------------------------------------------------

    public String getDescription() { return description; }
    public LocalDate getStartDate() { return startDate; }
    public int getNumberOfPeople() { return numberOfPeople; }
    public double getKms() { return kms; }

    // --- public methods -----------------------------------------------------

    public void registerPersons(int persons) {
        numberOfPeople += persons;
    }

    public void ride(double kms) {
        this.kms += kms;
    }
}