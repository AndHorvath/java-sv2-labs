package interfaces.figure;

public class Triangle implements Area {

    // --- attributes ---------------------------------------------------------

    private double lengthOfSide;
    private double height;

    // --- constructors -------------------------------------------------------

    public Triangle(double lengthOfSide, double height) {
        this.lengthOfSide = lengthOfSide;
        this.height = height;
    }

    // --- getters and setters ------------------------------------------------

    public double getLengthOfSide() { return lengthOfSide; }
    public double getHeight() { return height; }

    // --- public methods -----------------------------------------------------

    @Override
    public double getArea() {
        return lengthOfSide * height / 2.0;
    }
}