package defaultconstructor.date;

public class SimpleDateFormatter {

    // --- attributes ---------------------------------------------------------

    private CountryCode defaultCountryCode;

    // --- getters and setters ------------------------------------------------

    public CountryCode getDefaultCountryCode() { return defaultCountryCode; }

    // --- constructors -------------------------------------------------------

    public SimpleDateFormatter() {
        defaultCountryCode = CountryCode.HU;
    }

    // --- public methods -----------------------------------------------------

    public String formatDateString(SimpleDate simpleDate) {
        return formatDateStringByCountryCode(simpleDate, defaultCountryCode);
    }

    public String formatDateStringByCountryCode(SimpleDate simpleDate, CountryCode countryCode) {
        String formattedDate;
        String hyphen = "-";
        switch (countryCode) {
            case HU:
                formattedDate = simpleDate.getYear() + hyphen + simpleDate.getMonth() + hyphen + simpleDate.getDay();
                break;
            case EN:
                formattedDate = simpleDate.getDay() + hyphen + simpleDate.getMonth() + hyphen + simpleDate.getYear();
                break;
            case US:
                formattedDate = simpleDate.getMonth() + hyphen + simpleDate.getDay() + hyphen + simpleDate.getYear();
                break;
            default:
                throw new IllegalArgumentException("Incorrect country code.");
        }
        return formattedDate;
    }
}