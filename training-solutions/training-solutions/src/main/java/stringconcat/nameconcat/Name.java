package stringconcat.nameconcat;

public class Name {

    // --- attributes ---------------------------------------------------------

    private final String familyName;
    private final String middleName;
    private final String givenName;
    private Title title;

    // --- constructors -------------------------------------------------------


    public Name(String familyName, String middleName, String givenName) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
    }

    public Name(String familyName, String middleName, String givenName, Title title) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    // --- public methods -----------------------------------------------------

    public String concatNameWesternStyle() {
        String separator = " ";
        String emptyString = "";
        String nameWesternStyle = emptyString;

        nameWesternStyle += title != null ? title.getPrefix() : emptyString;
        nameWesternStyle += title != null ? separator : emptyString;
        nameWesternStyle += givenName;
        nameWesternStyle += separator;
        nameWesternStyle += !middleName.equals(emptyString) ? middleName : emptyString;
        nameWesternStyle += !middleName.equals(emptyString) ? separator : emptyString;
        nameWesternStyle += familyName;

        return nameWesternStyle;
    }

    public String concatNameHungarianStyle() {
        String separator = " ";
        String emptyString = "";
        String nameHungarianStyle = emptyString;

        nameHungarianStyle =
                title != null ?
                nameHungarianStyle.concat(title.getPrefix()) : nameHungarianStyle.concat(emptyString);
        nameHungarianStyle =
                title != null ?
                nameHungarianStyle.concat(separator) : nameHungarianStyle.concat(emptyString);
        nameHungarianStyle =
                nameHungarianStyle.concat(familyName);
        nameHungarianStyle =
                nameHungarianStyle.concat(separator);
        nameHungarianStyle =
                !middleName.equals(emptyString) ?
                nameHungarianStyle.concat(middleName) : nameHungarianStyle.concat(emptyString);
        nameHungarianStyle =
                !middleName.equals(emptyString) ?
                nameHungarianStyle.concat(separator) : nameHungarianStyle.concat(emptyString);
        nameHungarianStyle =
                nameHungarianStyle.concat(givenName);

        return nameHungarianStyle;
    }
}