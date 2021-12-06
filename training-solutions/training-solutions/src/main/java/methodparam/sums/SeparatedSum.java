package methodparam.sums;

import methodparam.marriage.Man;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class SeparatedSum {

        // --- public methods -----------------------------------------------------

    public SeparatedNumbers sum(String floatingNumbers) {
        double positiveSum = 0d;
        double negativeSum = 0d;
        double actualNumber;
        String[] numberArray = floatingNumbers.replace(',', '.').split(";");
        for (String numberString : numberArray) {
            actualNumber = getNumber(numberString);
            if (isPositive(actualNumber)) {
                positiveSum += actualNumber;
            } else {
                negativeSum += actualNumber;
            }
        }
        return new SeparatedNumbers(positiveSum, negativeSum);
    }

    public String getNumbersString(String pathString) {
        return readFile(Paths.get(pathString)).get(0);
    }

    // --- private methods ----------------------------------------------------

    private List<String> readFile(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException exception) {
            throw new IllegalStateException("Cannot read file.", exception);
        }
    }

    private double getNumber(String numberString) {
        try {
            return Double.parseDouble(numberString);
        } catch (NumberFormatException exception) {
            throw new IllegalStateException("Not a number.", exception);
        }
    }

    private boolean isPositive(double number) {
        return number > Math.pow(10d, -5d);
    }
}