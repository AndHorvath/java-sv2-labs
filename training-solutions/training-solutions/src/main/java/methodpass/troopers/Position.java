package methodpass.troopers;

public class Position {

    // --- attributes ---------------------------------------------------------

    private final double posX;
    private final double posY;

    // --- constructors -------------------------------------------------------

    public Position(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    // --- getters and setters ------------------------------------------------

    public double getPosX() { return posX; }
    public double getPosY() { return posY; }

    // --- public methods -----------------------------------------------------

    public double distanceFrom(Position position) {
        validateParameter(position);
        return
            Math.sqrt(
                Math.pow(distanceFromOnAxis(position, "x"), 2) +
                Math.pow(distanceFromOnAxis(position, "y"), 2));
    }

    // --- private methods ----------------------------------------------------

    private double distanceFromOnAxis(Position position, String axis) {
        if ("x".equals(axis)) {
            return posX - position.getPosX();
        } else if ("y".equals(axis)) {
            return posY - position.getPosY();
        } else {
            throw new IllegalArgumentException("The value of parameter axis must be x or y.");
        }
    }

    private void validateParameter(Position position) {
        if (position == null) {
            throw new IllegalArgumentException("Position cannot be null.");
        }
    }
}