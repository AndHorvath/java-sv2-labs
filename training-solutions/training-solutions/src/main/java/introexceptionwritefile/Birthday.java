package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Birthday {

    // --- attributes ---------------------------------------------------------

    private final List<String> namesAndBirthdays;

    // --- constructors -------------------------------------------------------

    public Birthday() {
        namesAndBirthdays = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<String> getNamesAndBirthdays() { return namesAndBirthdays; }

    // --- public methods -----------------------------------------------------

    public void addEntry(String name, String birthday) {
        namesAndBirthdays.add(createEntry(name, birthday));
    }

    public void writeBirthdaysToFile() {
        String pathString = "src/main/resources/birthdays.txt";
        try {
            Files.write(Paths.get(pathString), namesAndBirthdays);
        } catch (IOException exception) {
            reportException(exception);
        }
    }

    // --- private methods ----------------------------------------------------

    private String createEntry(String name, String birthday) {
        return name + ": " + birthday;
    }

    private void reportException(Exception exception) {
        System.out.println(exception.getMessage());
        exception.printStackTrace();
    }
}