package exceptionmulticatch.converter;

public class BinaryStringConverter {

    // --- public methods -----------------------------------------------------

    public boolean[] binaryStringToBooleanArray(String binaryString) {
        validateParameter(binaryString);

        boolean[] booleanArray = new boolean[binaryString.length()];
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1' || binaryString.charAt(i) == '0') {
                booleanArray[i] = binaryString.charAt(i) == '1';
            } else {
                throw new IllegalArgumentException("Invalid binary string.");
            }
        }
        return booleanArray;
    }

    public String booleanArrayToBinaryString(boolean[] booleanArray) {
        validateParameter(booleanArray);

        StringBuilder binaryString = new StringBuilder();
        for (boolean booleanValue : booleanArray) {
            binaryString.append(booleanValue ? "1" : "0");
        }
        if (binaryString.length() == 0) {
            throw new IllegalArgumentException("Invalid boolean array.");
        }
        return binaryString.toString();
    }

    // --- private methods ----------------------------------------------------

    private void validateParameter(String binaryString) {
        if (binaryString == null) {
            throw new NullPointerException("Binary string cannot be null.");
        } else if (binaryString.length() == 0) {
            throw new IllegalArgumentException("Invalid binary string.");
        }
    }

    private void validateParameter(boolean[] booleanArray) {
        if (booleanArray == null) {
            throw new NullPointerException("Boolean array cannot be null.");
        }
    }
}