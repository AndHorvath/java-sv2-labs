package genericsusage.withgenerics;

import genericsusage.Book;
import java.util.List;

public class Library {

    public Book getFirstBook(List<Book> books) {
        if (books == null) {
            throw new NullPointerException("Collection is null.");
        } else if (books.size() == 0) {
            throw new IllegalArgumentException("Collection is empty.");
        }
        return books.get(0);
    }
}