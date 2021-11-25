package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Books {

    // --- public methods -----------------------------------------------------

    public List<String> formatList(List<String> booksList) {
        List<String> booksListFormatted = new ArrayList<>();
        for (String bookRecord : booksList) {
            booksListFormatted.add(formatBookRecord(bookRecord));
        }
        return booksListFormatted;
    }

    public List<String> readList(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException exception) {
            throw new IllegalStateException("Cannot read file.", exception);
        }
    }

    public void writeList(Path path, List<String> list) {
        try {
            Files.write(path, list);
        } catch (IOException exception) {
            throw new IllegalStateException("Cannot write file.", exception);
        }
    }

    // --- private methods ----------------------------------------------------

    private String formatBookRecord(String record) {
        return record.split(";")[2] + ": " + record.split(";")[1];
    }
}