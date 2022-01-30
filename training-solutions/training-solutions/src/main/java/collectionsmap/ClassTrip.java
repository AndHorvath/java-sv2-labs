package collectionsmap;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassTrip {

    // --- attributes ---------------------------------------------------------

    private Map<String, Integer> inpayments;

    // --- constructors -------------------------------------------------------

    public ClassTrip() {
        this.inpayments = new HashMap<>();
    }

    // --- getters and setters ------------------------------------------------

    public Map<String, Integer> getInpayments() {
        return inpayments;
    }
    // --- public methods -----------------------------------------------------

    public void loadInpayments(Path path) {
        List<String> inpaymentLines = readDataFromFile(path);
        for (String line : inpaymentLines) {
            String[] inpaymentArray = line.split(": ");
            inpayments.put(inpaymentArray[0], Integer.parseInt(inpaymentArray[1]));
        }
    }

    // --- private methods ----------------------------------------------------

    private List<String> readDataFromFile(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException exception) {
            throw new IllegalStateException("Cannot read file.", exception);
        }
    }
}