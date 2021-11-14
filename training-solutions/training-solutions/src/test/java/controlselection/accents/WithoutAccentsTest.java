package controlselection.accents;

import controlselection.consonant.ToConsonant;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WithoutAccentsTest {

    @Test
    void getCharacterWithoutAccentTest() {
        WithoutAccents withoutAccents = new WithoutAccents();

        assertEquals('a', withoutAccents.getCharacterWithoutAccent('Á'));
        assertEquals('e', withoutAccents.getCharacterWithoutAccent('é'));
        assertEquals('i', withoutAccents.getCharacterWithoutAccent('Í'));
        assertEquals('o', withoutAccents.getCharacterWithoutAccent('ó'));
        assertEquals('ö', withoutAccents.getCharacterWithoutAccent('ő'));
        assertEquals('u', withoutAccents.getCharacterWithoutAccent('Ú'));
        assertEquals('ü', withoutAccents.getCharacterWithoutAccent('Ű'));

        assertEquals('a', withoutAccents.getCharacterWithoutAccent('A'));
        assertEquals('i', withoutAccents.getCharacterWithoutAccent('i'));
        assertEquals('u', withoutAccents.getCharacterWithoutAccent('U'));

        assertEquals('b', withoutAccents.getCharacterWithoutAccent('B'));
        assertEquals('j', withoutAccents.getCharacterWithoutAccent('j'));
        assertEquals('v', withoutAccents.getCharacterWithoutAccent('V'));
    }
}