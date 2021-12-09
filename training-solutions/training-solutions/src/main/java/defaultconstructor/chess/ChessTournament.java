package defaultconstructor.chess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChessTournament {

    // --- attributes ---------------------------------------------------------

    private List<Team> teams;

    // --- constructor --------------------------------------------------------

    public ChessTournament() {
        teams = new ArrayList<>(Arrays.asList(new Team(), new Team(), new Team()));
    }

    // --- getters and setters ------------------------------------------------

    public List<Team> getTeams() { return teams; }

    // --- public methods -----------------------------------------------------

    public void addPlayersToTeams(List<Player> playersRegistrated) {
        int playerToAddIndex = 0;
        while (playerToAddIndex < playersRegistrated.size()) {
            for (Team team : teams) {
                if (team.getPlayerOne() == null) {
                    team.setPlayerOne(playersRegistrated.get(playerToAddIndex));
                    break;
                } else if (team.getPlayerTwo() == null) {
                    team.setPlayerTwo(playersRegistrated.get(playerToAddIndex));
                    break;
                }
            }
            playerToAddIndex++;
        }
    }
}