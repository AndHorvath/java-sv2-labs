package methodstructure.bmi;

public class BodyMass {

    // --- attributes ---------------------------------------------------------

    private double weight;
    private double height;

    // --- constructors -------------------------------------------------------

    public BodyMass(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    // --- getters and setters ------------------------------------------------

    public double getWeight() { return weight; }
    public double getHeight() { return height; }

    // --- public methods -----------------------------------------------------

    public double getBodyMassIndex() {
        return weight / Math.pow(height, 2d);
    }

    public BmiCategory getBody() {
        if (isLess(getBodyMassIndex(), 18.5d)) {
            return BmiCategory.UNDERWEIGHT;
        } else if (isGreater(getBodyMassIndex(), 25d)) {
            return BmiCategory.OVERWEIGHT;
        } else {
            return BmiCategory.NORMAL;
        }
    }

    public boolean isThinnerThan(BodyMass other) {
        return isLess(this.getBodyMassIndex(), other.getBodyMassIndex());
    }

    // --- private methods ----------------------------------------------------

    private boolean isLess(double a, double b) {
        return a < b - Math.pow(10d, -5d);
    }

    private boolean isGreater(double a, double b) {
        return a > b + Math.pow(10d, -5d);
    }
}