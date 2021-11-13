package introjunit;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GentlemanTest {

    // Given
    Gentleman gentleman = new Gentleman();

    // --- Első teszt implementálása ------------------------------------------

    @Test
    public void testSayHello() {
        // When
        String gentlemanSentence = gentleman.sayHello("John Doe");
        // Then
        assertThat(gentlemanSentence, equalTo("Hello, John Doe!"/* + "!"*/));
        // The part commented out hase been used for testing JUnit.
    }

    // --- Hibás teszt --------------------------------------------------------

    /*
    Programhiba:
    java.lang.AssertionError:
    Actual   :Hello, John Doe!!
    Expected :Hello, John Doe!

    Teszthiba:
    java.lang.AssertionError:
    Expected :Hello, John Doe!!
    Actual   :Hello, John Doe!
    */

    // --- Tesztlefedettség mérése --------------------------------------------

    @Test
    public void testSayHelloForNull() {
        // When
        String gentlemanSentenceNull = gentleman.sayHello(null);
        // Then
        assertThat(gentlemanSentenceNull, equalTo("Hello, Anonymous!"));
    }
}