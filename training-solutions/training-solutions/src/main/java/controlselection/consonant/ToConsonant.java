package controlselection.consonant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToConsonant {

    public char getClosestConsonant(char character) {
        char consideredCharacter = Character.toLowerCase(character);
        List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        if (vowels.contains(consideredCharacter)) {
            consideredCharacter++;
        }
        return consideredCharacter;
    }
}