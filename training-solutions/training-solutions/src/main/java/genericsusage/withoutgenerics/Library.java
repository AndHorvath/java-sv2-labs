package genericsusage.withoutgenerics;

import genericsusage.Book;
import java.util.List;

public class Library {

    public Book getFirstBook(List books) {
        if (books == null) {
            throw new NullPointerException("Collection is null.");
        } else if (books.size() == 0) {
            throw new IllegalArgumentException("Collection is empty.");
        }
        try {
            return (Book) books.get(0);
        } catch (ClassCastException exception) {
            throw new IllegalStateException("First element is not a book.", exception);
        }
    }
}