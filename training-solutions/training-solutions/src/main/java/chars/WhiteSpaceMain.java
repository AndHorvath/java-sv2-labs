package chars;

public class WhiteSpaceMain {

    public static void main(String[] args) {
        WhiteSpace whiteSpace = new WhiteSpace();
        String testString = "Ej mi a kő tyúkanyó?";
        String stringWithStars;

        stringWithStars = whiteSpace.makeWhiteSpaceToStar(testString);
        System.out.println(stringWithStars);
    }
}