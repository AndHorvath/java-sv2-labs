package collectionsset;

import java.util.*;

public class QuestionGame {

    // --- attributes ---------------------------------------------------------

    private List<RightAnswer> rightAnswers;
    private Random random;
    private static final int NUMBER_OF_WINNERS = 5;

    // --- constructors -------------------------------------------------------

    public QuestionGame() {
        rightAnswers = new ArrayList<>();
        random = new Random();
    }

    // --- getters and setters ------------------------------------------------

    public List<RightAnswer> getRightAnswers() { return rightAnswers; }

    // --- public methods -----------------------------------------------------

    public void addRightAnswer(RightAnswer rightAnswer) {
        rightAnswers.add(rightAnswer);
    }

    public Set<String> drawWinners() {
        Set<String> winners = new HashSet<>();
        while (winners.size() < NUMBER_OF_WINNERS) {
            validateRightAnswers();
            winners.add(drawWinner());
        }
        return winners;
    }

    // --- private methods ----------------------------------------------------

    private void validateRightAnswers() {
        if (rightAnswers.size() == 0) {
            throw new IllegalArgumentException("Too few players with right answers.");
        }
    }

    private String drawWinner() {
        return rightAnswers.remove(random.nextInt(0, rightAnswers.size())).getPlayer();
    }
}