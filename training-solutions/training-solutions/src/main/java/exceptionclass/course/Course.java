package exceptionclass.course;

public class Course {

    // --- attributes ---------------------------------------------------------

    private String name;
    private SimpleTime begin;

    // --- constructors -------------------------------------------------------

    public Course(String name, SimpleTime begin) {
        this.name = name;
        this.begin = begin;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public SimpleTime getBegin() { return begin; }

    // --- public methods -----------------------------------------------------

    @Override
    public String toString() {
        return begin.toString() + " : " + name;
    }
}