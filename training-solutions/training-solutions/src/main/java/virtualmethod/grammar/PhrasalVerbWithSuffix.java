package virtualmethod.grammar;

public class PhrasalVerbWithSuffix extends PhrasalVerb implements Suffix {

    // --- attributes ---------------------------------------------------------

    private String suffix;

    // --- constructors -------------------------------------------------------

    public PhrasalVerbWithSuffix(String word, String preposition, String suffix) {
        super(word, preposition);
        this.suffix = suffix;
    }

    // --- getters and setters ------------------------------------------------

    @Override
    public String getSuffix() { return suffix; }

    // --- public methods -----------------------------------------------------

    @Override
    public String getWholeWord() {
        return super.getWholeWord() + suffix;
    }
}