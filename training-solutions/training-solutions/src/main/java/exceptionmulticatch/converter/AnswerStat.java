package exceptionmulticatch.converter;

public class AnswerStat {

    // --- attributes ---------------------------------------------------------

    private BinaryStringConverter binaryStringConverter;

    // --- constructors -------------------------------------------------------

    public AnswerStat(BinaryStringConverter binaryStringConverter) {
        this.binaryStringConverter = binaryStringConverter;
    }

    // --- getters and setters ------------------------------------------------

    public BinaryStringConverter getBinaryStringConverter() { return binaryStringConverter; }

    // --- public methods -----------------------------------------------------

    public boolean[] convert(String binaryString) {
        try {
            return binaryStringConverter.binaryStringToBooleanArray(binaryString);
        } catch (NullPointerException | IllegalArgumentException exception) {
            throw new InvalidBinaryStringException("Invalid binary string.", exception);
        }
    }

    public int answerTruePercent(String answers) {
        boolean[] booleanArray = convert(answers);
        int numberOfTrueAnswers = 0;
        for (boolean booleanValue : booleanArray) {
            numberOfTrueAnswers += booleanValue ? 1 : 0;
        }
        return (int) Math.round((double) numberOfTrueAnswers / booleanArray.length * 100);
    }
}