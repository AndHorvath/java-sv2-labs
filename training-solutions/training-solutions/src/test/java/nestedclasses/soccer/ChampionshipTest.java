package nestedclasses.soccer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChampionshipTest {

    Championship championship;

    @BeforeEach
    void setUp() {
        championship = new Championship();
    }

    @Test
    void getLeagueTableTest() {
        assertEquals(0, championship.getLeagueTable().size());
    }

    @Test
    void addGameTest() {
        championship.addGame(new Championship.GameResult("TeamA", "TeamB", 2, 1));
        championship.addGame(new Championship.GameResult("TeamB", "TeamC", 3, 2));
        championship.addGame(new Championship.GameResult("TeamC", "TeamA", 1, 1));

        assertEquals(3, championship.getLeagueTable().size());

        assertEquals("TeamA", championship.getLeagueTable().get(0).getTeamName());

        assertEquals(4, championship.getLeagueTable().get(0).getPoints());
        assertEquals(2, championship.getLeagueTable().get(0).getDetailedStatistics().getPlayed());
        assertEquals(1, championship.getLeagueTable().get(0).getDetailedStatistics().getWon());
        assertEquals(1, championship.getLeagueTable().get(0).getDetailedStatistics().getTied());
        assertEquals(0, championship.getLeagueTable().get(0).getDetailedStatistics().getLost());
        assertEquals(3, championship.getLeagueTable().get(0).getDetailedStatistics().getGoalsFor());
        assertEquals(2, championship.getLeagueTable().get(0).getDetailedStatistics().getGoalsAgainst());

        assertEquals("TeamB", championship.getLeagueTable().get(1).getTeamName());

        assertEquals(3, championship.getLeagueTable().get(1).getPoints());
        assertEquals(2, championship.getLeagueTable().get(1).getDetailedStatistics().getPlayed());
        assertEquals(1, championship.getLeagueTable().get(1).getDetailedStatistics().getWon());
        assertEquals(0, championship.getLeagueTable().get(1).getDetailedStatistics().getTied());
        assertEquals(1, championship.getLeagueTable().get(1).getDetailedStatistics().getLost());
        assertEquals(4, championship.getLeagueTable().get(1).getDetailedStatistics().getGoalsFor());
        assertEquals(4, championship.getLeagueTable().get(1).getDetailedStatistics().getGoalsAgainst());

        assertEquals("TeamC", championship.getLeagueTable().get(2).getTeamName());

        assertEquals(1, championship.getLeagueTable().get(2).getPoints());
        assertEquals(2, championship.getLeagueTable().get(2).getDetailedStatistics().getPlayed());
        assertEquals(0, championship.getLeagueTable().get(2).getDetailedStatistics().getWon());
        assertEquals(1, championship.getLeagueTable().get(2).getDetailedStatistics().getTied());
        assertEquals(1, championship.getLeagueTable().get(2).getDetailedStatistics().getLost());
        assertEquals(3, championship.getLeagueTable().get(2).getDetailedStatistics().getGoalsFor());
        assertEquals(4, championship.getLeagueTable().get(2).getDetailedStatistics().getGoalsAgainst());
    }
}