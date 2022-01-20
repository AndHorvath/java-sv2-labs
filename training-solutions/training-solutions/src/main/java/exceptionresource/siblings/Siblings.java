package exceptionresource.siblings;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Siblings {

    // --- attributes ---------------------------------------------------------

    public static final String SEPARATOR = " ";

    // --- public methods -----------------------------------------------------

    public List<String> getFullNames(String lastName, Path path) {
        List<String> fullNames = new ArrayList<>();
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNextLine()) {
                fullNames.add(lastName + SEPARATOR + scanner.nextLine());
            }
        } catch (IOException exception) {
            throw new IllegalStateException("Cannot read file.", exception);
        }
        return fullNames;
    }
}