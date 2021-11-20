package introexceptionfirstexception;

import java.util.List;

public class Message {

    public String decodeMessage(List<String> codedMessage) {
        StringBuilder sbMessage = new StringBuilder();

        for (String numberString : codedMessage) {
            sbMessage.append(Character.toChars(Integer.parseInt(numberString)));
        }
        return sbMessage.toString();
    }
}