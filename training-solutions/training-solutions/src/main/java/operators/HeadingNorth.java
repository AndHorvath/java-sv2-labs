package operators;

public class HeadingNorth {

    public int getNumberOfNewDirections(int stepOfIncrease) {
        int numberOfNewDirections;
        int degreeOfDeviation = 0;

        for (numberOfNewDirections = 1;
             numberOfNewDirections < Integer.MAX_VALUE;
             numberOfNewDirections++) {

            degreeOfDeviation += stepOfIncrease * numberOfNewDirections;

            if (degreeOfDeviation % 360 == 0) {
                return numberOfNewDirections;
            }
        }
        return Integer.MIN_VALUE;
    }
}