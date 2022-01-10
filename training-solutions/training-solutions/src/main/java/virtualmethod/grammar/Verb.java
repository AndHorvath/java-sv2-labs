package virtualmethod.grammar;

public abstract class Verb {

    // --- attributes ---------------------------------------------------------

    protected String word;

    // --- constructors -------------------------------------------------------

    public Verb(String word) {
        this.word = word;
    }

    // --- getters and setters ------------------------------------------------

    public String getWord() { return word; }
}