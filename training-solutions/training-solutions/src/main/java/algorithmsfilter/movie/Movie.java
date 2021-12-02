package algorithmsfilter.movie;

public class Movie {

    // --- attributes ---------------------------------------------------------

    private String title;
    private Category category;
    private int rating;

    // --- constructors -------------------------------------------------------

    public Movie(String title, Category category, int rating) {
        this.title = title;
        this.category = category;
        this.rating = rating;
    }

    // --- getters and setters ------------------------------------------------

    public String getTitle() { return title; }
    public Category getCategory() { return category; }
    public int getRating() { return rating; }
}