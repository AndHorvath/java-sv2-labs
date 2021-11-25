package introexceptionwritefiletestjunit5;

import java.nio.file.Paths;
import java.util.List;

public class BookMain {

    public static void main(String[] args) {
        String pathStringBooks = "src/main/resources/books.txt";
        String pathStringBooksFormatted = "src/main/resources/booksformatted.txt";
        List<String> booksList;
        List<String> booksListFormatted;
        Books books = new Books();

        booksList = books.readList(Paths.get(pathStringBooks));
        booksListFormatted = books.formatList(booksList);
        books.writeList(Paths.get(pathStringBooksFormatted), booksListFormatted);
    }
}