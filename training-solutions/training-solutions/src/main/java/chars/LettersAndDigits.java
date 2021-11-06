package chars;

public class LettersAndDigits {

    public void printLetterOrDigit(String text) {
        for (Character character : text.toCharArray()) {
            printLetterOrDigitSingle(character);
        }
    }

    private void printLetterOrDigitSingle(Character character) {
        String characterType;

        if (Character.isAlphabetic(character)) {
            characterType = "betű";
        } else if (Character.isDigit(character)) {
            characterType = "számjegy";
        } else {
            characterType = "egyéb";
        }
        System.out.println(character + " : " + characterType);
    }
}