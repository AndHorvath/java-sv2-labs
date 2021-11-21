package introexceptiontrycatchtrace;

public class Jackpot {

    public static void main(String[] args) {
        String playerA = "John Doe";
        String playerB = "Jack Doe";
        Winner winner = new Winner();

        winner.addPlayer(playerA);
        winner.addPlayer(playerB);
        winner.addPlayer(null);
        try {
            System.out.println(winner.getWinner());
        } catch (NullPointerException exception) {
            System.out.println("No winner in the drawn position.");
            System.out.println(exception.getMessage());
        }
    }
}