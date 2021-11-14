package controlselection.accents;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WithoutAccents {

    public char getCharacterWithoutAccent(char character) {
        char consideredCharacter = Character.toLowerCase(character);

        switch (consideredCharacter) {
            case 'á':
                return 'a';
            case 'é':
                return 'e';
            case 'í':
                return 'i';
            case 'ó':
                return 'o';
            case 'ő':
                return 'ö';
            case 'ú':
                return 'u';
            case 'ű':
                return 'ü';
        }
        return consideredCharacter;
    }
}