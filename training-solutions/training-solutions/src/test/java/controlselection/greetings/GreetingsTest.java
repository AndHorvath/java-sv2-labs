package controlselection.greetings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingsTest {

    @Test
    void greetAccordingDayTimeTest() {
        Greetings greetings = new Greetings();

        assertEquals("Jó éjszakát!", greetings.greetAccordingDayTime(0, 0));
        assertEquals("Jó reggelt!", greetings.greetAccordingDayTime(5, 1));
        assertEquals("Jó napot!", greetings.greetAccordingDayTime(18, 30));
        assertEquals("Jó estét!", greetings.greetAccordingDayTime(18, 31));
    }
}