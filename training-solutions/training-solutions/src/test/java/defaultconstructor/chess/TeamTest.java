package defaultconstructor.chess;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TeamTest {

    Team team;
    Player player;

    @BeforeEach
    void setUp() {
        team = new Team();
        player = new Player();
    }

    @Test
    void getPlayerOneTest() {
        assertNull(team.getPlayerOne());
    }

    @Test
    void setPlayerOneTest() {
        team.setPlayerOne(player);
        assertEquals(player, team.getPlayerOne());
    }

    @Test
    void getPlayerTwoTest() {
        assertNull(team.getPlayerTwo());
    }

    @Test
    void setPlayerTwoTest() {
        team.setPlayerTwo(player);
        assertEquals(player, team.getPlayerTwo());
    }
}