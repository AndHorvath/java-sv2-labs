package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Books {

    // --- attributes ---------------------------------------------------------

    private final List<String> titles;

    // --- constructors -------------------------------------------------------

    public Books() { titles = new ArrayList<>(); }

    // --- getters and setters ------------------------------------------------

    public List<String> getTitles() { return titles; }

    // --- public methods -----------------------------------------------------

    public void addBook(String title) {
        titles.add(title);
    }

    public void findBookAndSetAuthor(String title, String author) {
        int indexOfBook = titles.indexOf(title);

        if (indexOfBook < 0) {
            return;
        }
        titles.set(indexOfBook, author.concat(": ").concat(title));
    }
}