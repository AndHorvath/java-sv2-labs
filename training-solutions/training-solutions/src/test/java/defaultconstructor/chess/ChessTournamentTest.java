package defaultconstructor.chess;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChessTournamentTest {

    ChessTournament chessTournament;

    @BeforeEach
    void setUp() {
        chessTournament = new ChessTournament();
    }

    @Test
    void getTeamsTest() {
        assertEquals(3, chessTournament.getTeams().size());
    }

    @Test
    void addPlayersToTeamsTest() {
        List<Player> playersRegistrated = new ArrayList<>();
        playersRegistrated.add(new Player());
        playersRegistrated.add(new Player());
        playersRegistrated.add(new Player());
        playersRegistrated.add(new Player());
        playersRegistrated.add(new Player());

        chessTournament.addPlayersToTeams(playersRegistrated);
        assertNotNull(chessTournament.getTeams().get(0).getPlayerOne());
        assertNotNull(chessTournament.getTeams().get(0).getPlayerTwo());
        assertNotNull(chessTournament.getTeams().get(1).getPlayerOne());
        assertNotNull(chessTournament.getTeams().get(1).getPlayerTwo());
        assertNotNull(chessTournament.getTeams().get(2).getPlayerOne());
        assertNull(chessTournament.getTeams().get(2).getPlayerTwo());

        playersRegistrated.add(new Player());
        playersRegistrated.add(new Player());

        ChessTournament other = new ChessTournament();
        other.addPlayersToTeams(playersRegistrated);
        assertNotNull(other.getTeams().get(0).getPlayerOne());
        assertNotNull(other.getTeams().get(0).getPlayerTwo());
        assertNotNull(other.getTeams().get(1).getPlayerOne());
        assertNotNull(other.getTeams().get(1).getPlayerTwo());
        assertNotNull(other.getTeams().get(2).getPlayerOne());
        assertNotNull(other.getTeams().get(2).getPlayerTwo());
    }
}