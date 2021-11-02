package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {

    public static void main(String[] args) {

        // --- exercise "Objektumok" ------------------------------------------

        new Book();

        System.out.println(new Book());

        Book emptyBook;
        //System.out.println(emptyBook);

        emptyBook = null;
        System.out.println(emptyBook);
        System.out.println(emptyBook == null);

        Book book = new Book();
        System.out.println(book);
        book = null;
        System.out.println(book);
        book = new Book();
        System.out.println(book);

        Book anotherBook = new Book();
        System.out.println(book == anotherBook);

        anotherBook = book;
        System.out.println(anotherBook);
        System.out.println(book == anotherBook);

        // --- exercise "Tömbök és listák" ------------------------------------

        Book[] bookArray = { new Book(), new Book(), new Book() };
        List<Book> bookList = Arrays.asList(new Book(), new Book(), new Book());
        List<Book> bookListDynamic = new ArrayList<>();
        int givenBound = 3;

        for (int i = 0; i < givenBound; i++) {
            bookListDynamic.add(new Book());
        }
        System.out.println(Arrays.toString(bookArray));
        System.out.println(bookList);
        System.out.println(bookListDynamic);
    }
}