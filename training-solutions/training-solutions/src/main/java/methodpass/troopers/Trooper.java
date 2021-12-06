package methodpass.troopers;

public class Trooper {

    // --- attributes ---------------------------------------------------------

    private String name;
    private Position position;

    // --- constructors -------------------------------------------------------

    public Trooper(String name) {
        validateParameter(name);

        this.name = name;
        this.position = new Position(0, 0);
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }

    public Position getPosition() { return position; }

    // --- public methods -----------------------------------------------------

    public void changePosition(Position target) {
        validateParameter(target);
        position = target;
    }

    public double distanceFrom(Position target) {
        validateParameter(target);
        return position.distanceFrom(target);
    }

    public boolean isCloserThan(Trooper other, Position target) {
        validateParameters(other, target);
        return isLess(this.distanceFrom(target), other.distanceFrom(target));
    }

    // --- private methods ----------------------------------------------------

    private boolean isLess(double a, double b) {
        return a < b - Math.pow(10d, -5d);
    }

    private void validateParameter(String name) {
        if (name == null || name.trim().length() == 0) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
    }

    private void validateParameter(Position target) {
        if (target == null) {
            throw new IllegalArgumentException("Target cannot be null.");
        }
    }

    private void validateParameters(Trooper other, Position target) {
        if (other == null || target == null) {
            throw new IllegalArgumentException("Neither other nor target can be null.");
        }
    }
}