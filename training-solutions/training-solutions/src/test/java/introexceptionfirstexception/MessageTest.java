package introexceptionfirstexception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stringbuilder.airport.Airport;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MessageTest {

    Message message;

    @BeforeEach
    void setUp() {
        message = new Message();
    }

    @Test
    void decodeMessageTest() {
        List<String> codedMessage =
                Arrays.asList(
                        "76", "101", "103", "121", "101", "110", "32", "115", "122",
                        "233", "112", "32", "110", "97", "112", "111", "100", "33"
                );
        String expectedMessage = "Legyen szép napod!";

        assertEquals(expectedMessage, message.decodeMessage(codedMessage));
    }
}