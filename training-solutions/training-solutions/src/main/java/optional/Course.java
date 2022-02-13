package optional;

public class Course {

    // --- attributes ---------------------------------------------------------

    private String name;
    private int price;
    private Level level;

    // --- constructors -------------------------------------------------------

    public Course(String name, int price, Level level) {
        this.name = name;
        this.price = price;
        this.level = level;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public int getPrice() { return price; }
    public Level getLevel() { return level; }
}