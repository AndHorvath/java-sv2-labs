package methodchain;

public class Grasshopper {

    // --- attributes ---------------------------------------------------------

    private int position;

    // --- constructors -------------------------------------------------------

    public Grasshopper(int position) {
        this.position = position;
    }

    // --- getters and setters ------------------------------------------------

    public int getPosition() { return position; }

    // --- public methods -----------------------------------------------------

    public Grasshopper hopOnce(Direction direction) {
        position += direction == Direction.POSITIVE ? 1 : -1;
        return this;
    }

    public void moveFromZeroToThreeWithFiveHops() {
        this
                .hopOnce(Direction.POSITIVE)
                .hopOnce(Direction.POSITIVE)
                .hopOnce(Direction.POSITIVE)
                .hopOnce(Direction.POSITIVE)
                .hopOnce(Direction.NEGATIVE);
    }
}