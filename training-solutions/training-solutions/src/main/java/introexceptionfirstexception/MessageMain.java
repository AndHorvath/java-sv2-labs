package introexceptionfirstexception;

import java.util.Arrays;
import java.util.List;

public class MessageMain {

    public static void main(String[] args) {

        Message message = new Message();

        // --- Happy path -----------------------------------------------------

        List<String> codedMessage =
                Arrays.asList(
                        "76", "101", "103", "121", "101", "110", "32", "115", "122",
                        "233", "112", "32", "110", "97", "112", "111", "100", "33"
                );

        System.out.println(message.decodeMessage(codedMessage));

        // --- Exceptional path -----------------------------------------------

        List<String> anotherCodedMessage =
                Arrays.asList(
                        "69", "122", "32", "101", "103", "121", "32", "104", "105", "98",
                        "225", "115", "32", "252", "122", "1O1", "110", "101", "116", "46"
                );

        System.out.println(message.decodeMessage(anotherCodedMessage));

        /*Exception in thread "main" java.lang.NumberFormatException: For input string: "1O1"
                at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
                at java.base/java.lang.Integer.parseInt(Integer.java:668)
                at java.base/java.lang.Integer.parseInt(Integer.java:786)
                at introexceptionfirstexception.Message.decodeMessage(Message.java:11)
                at introexceptionfirstexception.MessageMain.main(MessageMain.java:30)*/
    }
}