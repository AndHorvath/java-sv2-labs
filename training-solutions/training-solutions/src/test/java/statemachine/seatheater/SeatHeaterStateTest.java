package statemachine.seatheater;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SeatHeaterStateTest {

    @Test
    void nextTest() {
        assertEquals(SeatHeaterState.HIGH, SeatHeaterState.OFF.next());
        assertEquals(SeatHeaterState.MIDDLE, SeatHeaterState.HIGH.next());
        assertEquals(SeatHeaterState.LOW, SeatHeaterState.MIDDLE.next());
        assertEquals(SeatHeaterState.OFF, SeatHeaterState.LOW.next());
    }
}