package classstructureconstructors;

import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book;
        String author;
        String title;
        String regNumber;

        System.out.println("Book registration");

        System.out.println("Please, enter the author's name!");
        author = scanner.nextLine();

        System.out.println("Enter the book's title!");
        title = scanner.nextLine();

        System.out.println("Enter an appropriate registration number!");
        regNumber = scanner.nextLine();

        book = new Book(author, title);
        book.setRegNumber(regNumber);

        System.out.println("Now, the book's registration data are:");
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Registration number: " + book.getRegNumber());
    }
}
