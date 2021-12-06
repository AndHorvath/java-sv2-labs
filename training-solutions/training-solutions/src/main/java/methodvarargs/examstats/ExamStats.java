package methodvarargs.examstats;

public class ExamStats {

    // --- attributes ---------------------------------------------------------

    private int maxPoints;

    // --- constructors -------------------------------------------------------

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    // --- getters and setters ------------------------------------------------

    public int getMaxPoints() { return maxPoints; }

    // --- public methods -----------------------------------------------------

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        validateParameter(results);

        int numberOfTopGrades = 0;
        for (int result : results) {
            if (result > getLimit(limitInPercent)) {
                numberOfTopGrades++;
            }
        }
        return numberOfTopGrades;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        validateParameter(results);

        for (int result : results) {
            if (result < getLimit(limitInPercent)) {
                return true;
            }
        }
        return false;
    }

    // --- private methods ----------------------------------------------------

    private int getLimit(int limitInPercent) {
        return (int) Math.round(maxPoints * limitInPercent / 100d);
    }

    private void validateParameter(int... results) {
        if (results.length == 0) {
            throw new IllegalArgumentException("No results given for statistics.");
        }
    }
}