package stringseparate;

import java.util.List;

public class Codes {

    public String getCodesStartWithLetter(List<String> codes) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean isFirst = true;

        for (String code : codes) {
            if (Character.isAlphabetic(code.charAt(0))) {
                if (isFirst) {
                    isFirst = false;
                } else {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(code);
            }
        }
        return stringBuilder.toString();
    }
}