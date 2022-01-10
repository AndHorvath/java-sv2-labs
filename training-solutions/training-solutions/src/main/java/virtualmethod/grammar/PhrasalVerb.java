package virtualmethod.grammar;

public class PhrasalVerb extends Verb implements Preposition {

    // --- attributes ---------------------------------------------------------

    protected String preposition;

    // --- constructors -------------------------------------------------------

    public PhrasalVerb(String word, String preposition) {
        super(word);
        this.preposition = preposition;
    }

    // --- getters and setters ------------------------------------------------

    @Override
    public String getPreposition() { return preposition; }

    // --- public methods -----------------------------------------------------

    @Override
    public String getWholeWord() {
        return preposition + word;
    }
}