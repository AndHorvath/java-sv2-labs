package chars;

public class WordsMain {

    public static void main(String[] args) {
        Words words = new Words();
        String testWord = "alma";
        String forwardPushedWord;

        forwardPushedWord = words.pushWord(testWord);
        System.out.println(forwardPushedWord);
    }
}