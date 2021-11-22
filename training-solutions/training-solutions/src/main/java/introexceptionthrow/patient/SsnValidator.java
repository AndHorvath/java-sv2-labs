package introexceptionthrow.patient;

public class SsnValidator {

    public boolean isValidSsn(String socialSecurityNumber) {
        char[] ssnArray = socialSecurityNumber.toCharArray();
        int factor;
        int ssnCheckSum = 0;

        try {
            Integer.parseInt(socialSecurityNumber);
        } catch (NumberFormatException exception) {
            return false;
        }
        for (int i = 0; i < ssnArray.length - 1; i++) {
            if (i % 2 == 0) {
                factor = 3;
            } else {
                factor = 7;
            }
            ssnCheckSum += factor * parseCharToInt(ssnArray[i]);
        }
        return ssnCheckSum % 10 == parseCharToInt(ssnArray[ssnArray.length - 1]);
    }

    private int parseCharToInt(char character) {
        return Integer.parseInt(Character.toString(character));
    }
}