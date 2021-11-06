package chars;

import java.util.Arrays;

public class WhiteSpace {

    public String makeWhiteSpaceToStar(String text) {
        char[] charArray = text.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (Character.isWhitespace(charArray[i])) {
                charArray[i] = '*';
            }

        }
        return new String(charArray);
    }
}