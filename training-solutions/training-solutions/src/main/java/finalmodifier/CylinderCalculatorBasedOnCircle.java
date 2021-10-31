package finalmodifier;

public class CylinderCalculatorBasedOnCircle {

    // --- attributes ---------------------------------------------------------

    private final CircleCalculator circleCalculator;

    // --- constructors -------------------------------------------------------

    public CylinderCalculatorBasedOnCircle() {
        circleCalculator = new CircleCalculator();
    }

    // --- public methods -----------------------------------------------------

    public double calculateSurfaceArea(double r, double h) {
        return
                circleCalculator.calculateArea(r) * 2 +
                circleCalculator.calculatePerimeter(r) * h;
    }

    public double calculateVolume(double r, double h) {
        return circleCalculator.calculateArea(r) * h;
    }
}