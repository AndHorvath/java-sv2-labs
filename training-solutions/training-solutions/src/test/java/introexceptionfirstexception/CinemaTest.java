package introexceptionfirstexception;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CinemaTest {

    String customer = "Minta Béla";
    String movie = "Titanic";
    String numberOfTickets = "3";
    String rowNumber = "2";
    Cinema cinema = new Cinema(customer,movie, numberOfTickets, rowNumber);

    @Test
    void constructTest() {
        assertEquals("Minta Béla", cinema.getCustomer());
        assertEquals("Titanic", cinema.getMovie());
        assertEquals("3", cinema.getNumberOfTickets());
        assertEquals("2", cinema.getRowNumber());
    }

    @Test
    void getOrderToPrint() {
        String expectedString =
                "A mozijegy.hu rendszerben vásárolt jegyek adatai a következők:\n" +
                "Vásárló neve: Minta Béla\n" +
                "Film címe: Titanic\n" +
                "Lefoglalt helyek: 2. sor 1. szék, 2. sor 2. szék, 2. sor 3. szék\n" +
                "Jó szórakozást!";
        assertEquals(expectedString, cinema.getOrderToPrint());
    }
}