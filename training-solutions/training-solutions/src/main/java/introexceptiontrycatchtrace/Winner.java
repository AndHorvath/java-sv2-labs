package introexceptiontrycatchtrace;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Winner {

    // --- attributes ---------------------------------------------------------

    private List<String> players;
    private Random random;

    // --- constructors -------------------------------------------------------

    public Winner() {
        players = new ArrayList<>();
        random = new Random();
    }

    // --- getters and setters ------------------------------------------------

    public List<String> getPlayers() { return players; }
    public Random getRandom() { return random; }

    // --- public methods -----------------------------------------------------

    public void addPlayer(String player) {
        players.add(player);
    }

    public String getWinner() {
        int winnerIndex = random.nextInt(players.size());
        return players.get(winnerIndex).toUpperCase();
    }
}