package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ToDo {

    // --- attributes ---------------------------------------------------------

    private final List<String> toDoList;

    // --- constructors -------------------------------------------------------

    public ToDo() {
        toDoList = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<String> getToDoList() { return toDoList; }

    // --- public methods -----------------------------------------------------

    public void addEntry(String entry) {
        toDoList.add(entry);
    }

    public void writeToDoListToFile() {
        String pathString = "src/main/resources/todos.txt";
        try {
            Files.write(Paths.get(pathString), toDoList);
        } catch (IOException exception) {
            reportException(exception);
        }
    }

    // --- private methods ----------------------------------------------------

    private void reportException(Exception exception) {
        System.out.println(exception.getMessage());
        exception.printStackTrace();
    }
}