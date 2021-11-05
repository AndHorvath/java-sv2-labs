package compositionlist;

import java.util.Scanner;

public class BooksMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int booksToList;
        Books books;

        books = new Books();
        System.out.println(books.getTitles());

        System.out.println("How many books do you want to put on the list?");
        booksToList = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < booksToList; i++) {
            System.out.println("Enter the " + (i + 1) + ". title!");
            books.addBook(scanner.nextLine());
        }
        System.out.println(books.getTitles());

        books.findBookAndSetAuthor("Interesting Story", "Jeffrey Doe");
        books.findBookAndSetAuthor("Beautiful Tales", "Jacob Doe");
        System.out.println(books.getTitles());
    }
}