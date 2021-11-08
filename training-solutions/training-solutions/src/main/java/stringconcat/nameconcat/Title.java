package stringconcat.nameconcat;

public enum Title {

    MR("Mr."), MRS("Mrs."), MS("Ms."), DR("Dr.");

    private final String prefix;

    Title(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix() { return prefix; }
}