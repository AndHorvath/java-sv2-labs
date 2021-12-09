package defaultconstructor.chess;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    Player player;

    @BeforeEach
    void setUp() {
        player = new  Player();
    }

    @Test
    void getNameTest() {
        assertNull(player.getName());
    }

    @Test
    void setNameTest() {
        player.setName("Jack Doe");
        assertEquals("Jack Doe", player.getName());
    }

    @Test
    void getEmailTest() {
        assertNull(player.getEmail());
    }

    @Test
    void setEmailTest() {
        player.setEmail("player@players.com");
        assertEquals("player@players.com", player.getEmail());
    }
}