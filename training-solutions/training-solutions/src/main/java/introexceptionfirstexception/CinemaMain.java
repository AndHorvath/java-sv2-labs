package introexceptionfirstexception;

import java.util.Scanner;

public class CinemaMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- User input path ------------------------------------------------

        System.out.println("Adja meg a vásárló nevét!");
        String customer = scanner.nextLine();
        System.out.println("Adja meg a film címét!");
        String movie = scanner.nextLine();
        System.out.println("Adja meg a jegyek számát!");
        String numberOfTickets = scanner.nextLine();
        System.out.println("Adja meg a sort a nézőtéren!");
        String rowNumber = scanner.nextLine();

        Cinema cinema = new Cinema(customer, movie, numberOfTickets, rowNumber);
        System.out.println(cinema.getOrderToPrint());

        // --- Happy path -----------------------------------------------------

        customer = "Minta Béla";
        movie = "Titanic";
        numberOfTickets = "3";
        rowNumber = "2";

        Cinema cinemaHappy = new Cinema(customer, movie, numberOfTickets, rowNumber);
        System.out.println(cinemaHappy.getOrderToPrint());

        // --- Exceptional path -----------------------------------------------

        customer = "Minta Béla";
        movie = "Titanic";
        numberOfTickets = "három";
        rowNumber = "kettő";

        Cinema cinemaException = new Cinema(customer, movie, numberOfTickets, rowNumber);
        System.out.println(cinemaException.getOrderToPrint());
    }
}