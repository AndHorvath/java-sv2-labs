package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Electricity {

    // --- attributes ---------------------------------------------------------

    private final List<String> dateAndStreetsToday;

    // --- constructors -------------------------------------------------------

    public Electricity() {
        dateAndStreetsToday = new ArrayList<>();
        dateAndStreetsToday.add(LocalDate.now().toString());
    }

    // --- getters and setters ------------------------------------------------

    public List<String> getDateAndStreetsToday() { return dateAndStreetsToday; }

    // --- public methods -----------------------------------------------------

    public void addStreets(String[] streetArray) {
        dateAndStreetsToday.addAll(Arrays.asList(streetArray));
    }

    public void writeStreets(Path path) {
        try {
            Files.write(path, dateAndStreetsToday);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}