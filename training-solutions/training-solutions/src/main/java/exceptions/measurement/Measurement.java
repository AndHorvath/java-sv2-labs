package exceptions.measurement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Measurement {

    // --- public methods -----------------------------------------------------

    public List<String> readFromFile(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException exception) {
            throw new IllegalStateException("Cannot read file.");
        }
    }

    public List<String> validate(List<String> measurementData) {
        List<String> errorList = new ArrayList<>();
        String[] dataRowArray;
        for (String dataRow : measurementData) {
            try {
                dataRowArray = dataRow.split(",");
                Integer.parseInt(dataRowArray[0]);
                Double.parseDouble(dataRowArray[1]);
                String lastName = dataRowArray[2].split(" ")[1];
                validateLength(errorList, dataRowArray, dataRow);
            } catch (NumberFormatException exception) {
                errorList.add(dataRow);
            } catch (ArrayIndexOutOfBoundsException exception) {
                errorList.add(dataRow);
            } catch (NullPointerException exception) {
                errorList.add(dataRow);
            }
        }
        return errorList;
    }

    // --- private methods ----------------------------------------------------

    private void validateLength(List<String> errorList, String[] dataRowArray, String dataRow) {
        if (dataRowArray.length != 3) {
            errorList.add(dataRow);
        }
    }
}