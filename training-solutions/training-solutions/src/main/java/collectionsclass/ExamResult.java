package collectionsclass;

public class ExamResult {

    // --- attributes ---------------------------------------------------------

    private String name;
    private int result;

    // --- constructors -------------------------------------------------------

    public ExamResult(String name, int result) {
        this.name = name;
        this.result = result;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public int getResult() { return result; }
}