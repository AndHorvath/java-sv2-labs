package collectionsclass;

import java.util.*;

public class Lottery {

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) {
        validateParameters(lotteryType, ballCount);

        List<Integer> balls = createBalls(ballCount);
        return getWinningNumbers(balls, lotteryType);
    }

    // --- private methods ----------------------------------------------------

    private void validateParameters(int lotteryType, int ballCount) {
        if (lotteryType >= ballCount) {
            throw new IllegalArgumentException("Invalid initial data.");
        }
    }

    private List<Integer> createBalls(int ballCount) {
        List<Integer> balls = new ArrayList<>(ballCount);
        for (int i = 0; i < ballCount; i++) {
            balls.add(i + 1);
        }
        Collections.shuffle(balls);
        return balls;
    }

    private List<Integer> getWinningNumbers(List<Integer> balls, int lotteryType) {
        List<Integer> winningNumbers = balls.subList(0, lotteryType);
        Collections.sort(winningNumbers);
        return winningNumbers;
    }
}