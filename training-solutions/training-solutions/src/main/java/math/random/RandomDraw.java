package math.random;

import java.util.Random;

public class RandomDraw {
    public static void main(String[] args) {
        String[] potentialWinners = new String[] {
                "William Adamson", "James Wilson", "Evelyn Burton", "Scarlett Harris", "Jack Lewis",
                "Hazel Stevens", "Carter Chapman", "Julian Owen", "Lily Webb", "Robert Holmes" };
        int firstWinner;
        int secondWinner;
        Random random = new Random();

        firstWinner = 1 + random.nextInt(5);
        secondWinner = 6 + random.nextInt(5);

        System.out.println("First winner: " + potentialWinners[firstWinner - 1]);
        System.out.println("Second winner: " + potentialWinners[secondWinner - 1]);
    }
}