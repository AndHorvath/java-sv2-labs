package controlselection.consonant;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ToConsonantTest {

    @Test
    void getClosestConsonantTest() {
        ToConsonant toConsonant = new ToConsonant();

        assertEquals('b', toConsonant.getClosestConsonant('A'));
        assertEquals('f', toConsonant.getClosestConsonant('e'));
        assertEquals('j', toConsonant.getClosestConsonant('I'));
        assertEquals('p', toConsonant.getClosestConsonant('o'));
        assertEquals('v', toConsonant.getClosestConsonant('U'));

        assertEquals('b', toConsonant.getClosestConsonant('B'));
        assertEquals('j', toConsonant.getClosestConsonant('j'));
        assertEquals('v', toConsonant.getClosestConsonant('V'));
    }
}