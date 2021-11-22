package introexceptionthrowjunit5;

public class Tank {

    // --- attributes ---------------------------------------------------------

    private int angle;

    // --- constructors -------------------------------------------------------

    public Tank() {
        angle = 0;
    }

    // --- getters and setters ------------------------------------------------

    public int getAngle() { return angle; }

    // --- public methods -----------------------------------------------------

    public void modifyAngle(int rotationAngle) {
        angle += rotationAngle;
        if (!isValidPosition()) {
            throw new IllegalArgumentException("Position must be between -80 and 80 degree.");
        }
    }

    // --- private methods ----------------------------------------------------

    private boolean isValidPosition() {
        return -80 <= angle && angle <= 80;
    }
}