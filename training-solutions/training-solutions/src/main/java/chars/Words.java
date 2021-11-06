package chars;

public class Words {

    public String pushWord(String word) {
        String forwardPushedWord = "";

        for (Character character : word.toCharArray()) {
            forwardPushedWord += ((char) ((int) character + 1));
        }
        return forwardPushedWord;
    }
}