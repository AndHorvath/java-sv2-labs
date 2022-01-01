package interfaceextends.robots;

import java.util.ArrayList;
import java.util.List;

public class C3P0 implements MovableRobot {

    // --- attributes ---------------------------------------------------------

    private Point position;
    private int angle;
    private List<Point> path;

    // --- constructors -------------------------------------------------------

    public C3P0(Point position) {
        validateParameter(position);

        this.path = new ArrayList<>();
        commonMoveTo(position);
    }

    // --- getters and setters ------------------------------------------------

    public Point getPosition() { return position; }
    public int getAngle() { return angle; }

    @Override
    public List<Point> getPath() { return path; }

    // --- public methods -----------------------------------------------------

    @Override
    public void moveTo(Point position) {
        validateParameter(position);
        commonMoveTo(position);
    }

    @Override
    public void fastMoveTo(Point position) {
        validateParameter(position);
        commonMoveTo(position);
    }

    @Override
    public void rotate(int angle) {
        this.angle += angle;
    }

    // --- private methods ----------------------------------------------------

    private void commonMoveTo(Point position) {
        this.position = position;
        this.path.add(position);
    }

    private void validateParameter(Point position) {
        if (position.getZ() != 0) {
            throw new IllegalArgumentException("C3P0 only moves in the plane.");
        }
    }
}