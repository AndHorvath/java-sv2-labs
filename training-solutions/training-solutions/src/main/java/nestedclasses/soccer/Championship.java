package nestedclasses.soccer;

import java.util.ArrayList;
import java.util.List;

public class Championship {

    // --- attributes ---------------------------------------------------------

    private List<TeamStatistics> leagueTable;

    // --- constructors -------------------------------------------------------

    public Championship() {
        leagueTable = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<TeamStatistics> getLeagueTable() { return leagueTable; }

    // --- public methods -----------------------------------------------------

    public void addGame(GameResult result) {
        TeamStatistics homeStatistics = getOrAddAndGetTeam(result.teamHome);
        TeamStatistics guestStatistics = getOrAddAndGetTeam(result.teamGuest);

        homeStatistics.played(result.goalHome, result.goalGuest);
        guestStatistics.played(result.goalGuest, result.goalHome);
    }

    // --- private methods ----------------------------------------------------

    private TeamStatistics getOrAddAndGetTeam(String teamName) {
        TeamStatistics teamStatistics = new TeamStatistics(teamName);
        for (TeamStatistics statistics : leagueTable) {
            if (statistics.equals(teamStatistics)) {
                return statistics;
            }
        }
        leagueTable.add(teamStatistics);
        return teamStatistics;
    }

    // --- inner classes ------------------------------------------------------

    public static class GameResult {

        private String teamHome;
        private String teamGuest;
        private int goalHome;
        private int goalGuest;

        public GameResult(String teamHome, String teamGuest, int goalHome, int goalGuest) {
            this.teamHome = teamHome;
            this.teamGuest = teamGuest;
            this.goalHome = goalHome;
            this.goalGuest = goalGuest;
        }
    }
}