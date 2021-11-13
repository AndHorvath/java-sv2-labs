package junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {

    // --- Első teszt implementálása ------------------------------------------

    @Test
    void sayHelloTest() {
        // Given
        Gentleman gentleman = new Gentleman();
        // When
        String gentlemanSentence = gentleman.sayHello("John Doe");
        // Then
        assertEquals("Hello, John Doe!"/* + "!"*/, gentlemanSentence);
        // The part commented out has been used for testing JUnit.
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
    void sayHelloForNull() {
        // Given
        Gentleman gentleman = new Gentleman();
        // When
        String gentlemanSentenceNull = gentleman.sayHello(null);
        // Then
        assertEquals("Hello, Anonymous!", gentlemanSentenceNull);
    }
}