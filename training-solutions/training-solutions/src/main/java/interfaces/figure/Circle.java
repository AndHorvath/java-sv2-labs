package interfaces.figure;

public class Circle implements Area {

    // --- attributes ---------------------------------------------------------

    private double radius;

    // --- constructors -------------------------------------------------------

    public Circle(double radius) {
        this.radius = radius;
    }

    // --- getters and setters ------------------------------------------------

    public double getRadius() { return radius; }

    // --- public methods -----------------------------------------------------

    @Override
    public double getArea() {
        return Math.pow(radius, 2.0) * Math.PI;
    }
}