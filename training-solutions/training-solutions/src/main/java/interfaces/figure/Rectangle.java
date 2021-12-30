package interfaces.figure;

public class Rectangle implements Area {

    // --- attributes ---------------------------------------------------------

    private double sideA;
    private double sideB;

    // --- constructors -------------------------------------------------------

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    // --- getters and setters ------------------------------------------------

    public double getSideA() { return sideA; }
    public double getSideB() { return sideB; }

    // --- public methods -----------------------------------------------------

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}