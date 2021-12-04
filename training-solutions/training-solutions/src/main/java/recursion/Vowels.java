package recursion;

public class Vowels {

    public int getNumberOfVowels(String word) {
        if (word.length() == 0) {
            return 0;
        } else {
            int contribution = isVowel(word.charAt(word.length() - 1)) ? 1 : 0;
            return contribution + getNumberOfVowels(word.substring(0, word.length() - 1));
        }
    }

    private boolean isVowel(char character) {
        return
                character == 'a' || character == 'e' ||
                character == 'i' || character == 'o' || character == 'u';
    }
}