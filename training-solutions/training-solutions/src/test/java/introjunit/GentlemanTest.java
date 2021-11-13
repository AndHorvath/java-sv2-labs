package introjunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {

    Gentleman gentleman = new Gentleman();

    // --- Első teszt implementálása ------------------------------------------

    @Test
    public void testSayHello() {
        String gentlemanSentence = gentleman.sayHello("John Doe");
        assertEquals("Hello, John Doe!"/* + "!"*/, gentlemanSentence);
        // The part commented out hase been used for testing JUnit.
    }

    // --- Hibás teszt --------------------------------------------------------

    /*
    Programhiba:
    org.opentest4j.AssertionFailedError:
    Expected :Hello, John Doe!
    Actual   :Hello, John Doe!!

    Teszthiba:
    org.opentest4j.AssertionFailedError:
    Expected :Hello, John Doe!!
    Actual   :Hello, John Doe!
    */

    // --- Tesztlefedettség mérése --------------------------------------------

    @Test
    public void testSayHelloForNull() {
        String gentlemanSentence = gentleman.sayHello(null);
        assertEquals("Hello, Anonymous!", gentlemanSentence);
    }
}