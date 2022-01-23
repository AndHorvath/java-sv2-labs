package nestedclasses.soccer;

import java.util.Objects;

public class TeamStatistics {

    // --- attributes ---------------------------------------------------------

    private String teamName;
    private int points;
    private DetailedStatistics detailedStatistics;

    // --- constructors -------------------------------------------------------

    public TeamStatistics(String teamName) {
        this.teamName = teamName;
        this.detailedStatistics = new DetailedStatistics();
    }

    // --- getters and setters ------------------------------------------------

    public String getTeamName() { return teamName; }
    public int getPoints() { return points; }
    public DetailedStatistics getDetailedStatistics() { return detailedStatistics; }

    // --- public methods -----------------------------------------------------

    public void played(int plusGoalsFor, int plusGoalsAgainst) {
        detailedStatistics.played += 1;
        detailedStatistics.goalsFor += plusGoalsFor;
        detailedStatistics.goalsAgainst += plusGoalsAgainst;
        if (plusGoalsFor > plusGoalsAgainst) {
            points += 3;
            detailedStatistics.won += 1;
        } else if (plusGoalsFor == plusGoalsAgainst) {
            points += 1;
            detailedStatistics.tied += 1;
        } else {
            detailedStatistics.lost += 1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamStatistics that = (TeamStatistics) o;
        return teamName.equals(that.teamName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamName);
    }

    // --- inner classes ------------------------------------------------------

    public static class DetailedStatistics {

        private int played;
        private int won;
        private int tied;
        private int lost;
        private int goalsFor;
        private int goalsAgainst;

        public int getPlayed() { return played; }
        public int getWon() { return won; }
        public int getTied() { return tied; }
        public int getLost() { return lost; }
        public int getGoalsFor() { return goalsFor; }
        public int getGoalsAgainst() { return goalsAgainst; }
    }
}