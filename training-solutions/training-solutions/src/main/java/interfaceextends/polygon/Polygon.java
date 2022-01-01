package interfaceextends.polygon;

public class Polygon implements Geometric {

    // --- attributes ---------------------------------------------------------

    private double lengthOfSide;
    private int numberOfVertices;

    // --- constructors -------------------------------------------------------

    public Polygon(double lengthOfSide, int numberOfVertices) {
        this.lengthOfSide = lengthOfSide;
        this.numberOfVertices = numberOfVertices;
    }

    // --- getters and setters ------------------------------------------------

    @Override
    public double getLengthOfSide() {  return lengthOfSide; }

    @Override
    public int getNumberOfVertices() { return numberOfVertices; }

    // --- public methods -----------------------------------------------------

    @Override
    public double getPerimeter() {
        return numberOfVertices * lengthOfSide;
    }

    @Override
    public int getNumberOfDiagonalsFromOneVertex() {
        return numberOfVertices - 1;
    }

    @Override
    public int getNumberOfAllDiagonals() {
        return getNumberOfDiagonalsFromOneVertex() * numberOfVertices / 2;
    }
}