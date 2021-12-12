package introinheritance.fruits;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppleTest {

    Apple apple;

    @BeforeEach
    void setUp() {
        apple = new Apple();
    }

    @Test
    void getPiecesTest() {
        assertEquals(0, apple.getPieces());
    }

    @Test
    void setPiecesTest() {
        apple.setPieces(2);
        assertEquals(2, apple.getPieces());
    }
}