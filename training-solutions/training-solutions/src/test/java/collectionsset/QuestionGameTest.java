package collectionsset;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class QuestionGameTest {

    QuestionGame questionGame;
    Set<String> winners;
    Throwable exception;

    @BeforeEach
    void setUp() {
        questionGame = new QuestionGame();
    }

    @Test
    void getRightAnswersTest() {
        assertEquals(new ArrayList<>(), questionGame.getRightAnswers());
    }

    @Test
    void addRightAnswerTest() {
        questionGame.addRightAnswer(new RightAnswer("Player A"));
        assertEquals(1, questionGame.getRightAnswers().size());
        assertEquals("Player A", questionGame.getRightAnswers().get(0).getPlayer());
    }

    @Test
    void drawWinnersTest() {
        fillRightAnswers();
        winners = questionGame.drawWinners();
        assertEquals(5, winners.size());
    }

    @Test
    void drawWinnersTestInvalid() {
        fillRightAnswersInvalid();
        exception = assertThrows(IllegalArgumentException.class, () -> questionGame.drawWinners());
        assertEquals("Too few players with right answers.", exception.getMessage());
    }

    // --- private methods ----------------------------------------------------

    private void fillRightAnswers() {
        for (int i = 0; i < 10; i++) {
            questionGame.addRightAnswer(new RightAnswer("Player A"));
            questionGame.addRightAnswer(new RightAnswer("Player B"));
            questionGame.addRightAnswer(new RightAnswer("Player C"));
            questionGame.addRightAnswer(new RightAnswer("Player D"));
            questionGame.addRightAnswer(new RightAnswer("Player E"));
            questionGame.addRightAnswer(new RightAnswer("Player F"));
            questionGame.addRightAnswer(new RightAnswer("Player G"));
            questionGame.addRightAnswer(new RightAnswer("Player H"));
            questionGame.addRightAnswer(new RightAnswer("Player I"));
            questionGame.addRightAnswer(new RightAnswer("Player J"));
        }
    }

    private void fillRightAnswersInvalid() {
        for (int i = 0; i < 10; i++) {
            questionGame.addRightAnswer(new RightAnswer("Player A"));
            questionGame.addRightAnswer(new RightAnswer("Player B"));
            questionGame.addRightAnswer(new RightAnswer("Player C"));
            questionGame.addRightAnswer(new RightAnswer("Player D"));
        }
    }
}