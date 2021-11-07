package numbers;

public class MathOperations {

    private final double epsilon = 1e-4;

    public boolean isEqual(double firstDouble, double secondDouble) {
        return Math.abs(firstDouble - secondDouble) < epsilon;
    }
}