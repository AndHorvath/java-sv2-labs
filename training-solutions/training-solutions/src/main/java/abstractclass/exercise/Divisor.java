package abstractclass.exercise;

public class Divisor extends MathExercise {

    public int getSolution(int a, int b) {
        validateParameter(b);
        return a / b;
    }

    private void validateParameter(int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("No division by zero.");
        }
    }
}