package nestedclasses.soccer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TeamStatisticsTest {

    TeamStatistics teamStatistics;
    TeamStatistics other;

    @BeforeEach
    void setUp() {
        teamStatistics = new TeamStatistics("Team");
    }

    @Test
    void getTeamNameTest() {
        assertEquals("Team", teamStatistics.getTeamName());
    }

    @Test
    void getPointsTest() {
        assertEquals(0, teamStatistics.getPoints());
    }

    @Test
    void getDetailedStatisticsTest() {
        assertEquals(0, teamStatistics.getDetailedStatistics().getPlayed());
        assertEquals(0, teamStatistics.getDetailedStatistics().getWon());
        assertEquals(0, teamStatistics.getDetailedStatistics().getTied());
        assertEquals(0, teamStatistics.getDetailedStatistics().getLost());
        assertEquals(0, teamStatistics.getDetailedStatistics().getGoalsFor());
        assertEquals(0, teamStatistics.getDetailedStatistics().getGoalsAgainst());
    }

    @Test
    void testEqualsTest() {
        other = new TeamStatistics("Team");
        assertEquals(teamStatistics, other);

        other = new TeamStatistics("Other");
        assertNotEquals(teamStatistics, other);
    }

    @Test
    void testHashCodeTest() {
        other = new TeamStatistics("Team");
        assertEquals(teamStatistics.hashCode(), other.hashCode());
    }

    @Test
    void playedTest() {
        teamStatistics.played(2, 0);

        assertEquals(3, teamStatistics.getPoints());
        assertEquals(1, teamStatistics.getDetailedStatistics().getPlayed());
        assertEquals(1, teamStatistics.getDetailedStatistics().getWon());
        assertEquals(0, teamStatistics.getDetailedStatistics().getTied());
        assertEquals(0, teamStatistics.getDetailedStatistics().getLost());
        assertEquals(2, teamStatistics.getDetailedStatistics().getGoalsFor());
        assertEquals(0, teamStatistics.getDetailedStatistics().getGoalsAgainst());

        teamStatistics.played(1, 1);

        assertEquals(4, teamStatistics.getPoints());
        assertEquals(2, teamStatistics.getDetailedStatistics().getPlayed());
        assertEquals(1, teamStatistics.getDetailedStatistics().getWon());
        assertEquals(1, teamStatistics.getDetailedStatistics().getTied());
        assertEquals(0, teamStatistics.getDetailedStatistics().getLost());
        assertEquals(3, teamStatistics.getDetailedStatistics().getGoalsFor());
        assertEquals(1, teamStatistics.getDetailedStatistics().getGoalsAgainst());

        teamStatistics.played(1, 2);

        assertEquals(4, teamStatistics.getPoints());
        assertEquals(3, teamStatistics.getDetailedStatistics().getPlayed());
        assertEquals(1, teamStatistics.getDetailedStatistics().getWon());
        assertEquals(1, teamStatistics.getDetailedStatistics().getTied());
        assertEquals(1, teamStatistics.getDetailedStatistics().getLost());
        assertEquals(4, teamStatistics.getDetailedStatistics().getGoalsFor());
        assertEquals(3, teamStatistics.getDetailedStatistics().getGoalsAgainst());
    }
}