package interfaceextends.robots;

import java.util.ArrayList;
import java.util.List;

public class AstroBoy implements FlyableRobot {

    // --- attributes ---------------------------------------------------------

    public static final long ALTITUDE = 5;

    private Point position;
    private int angle;
    private List<Point> path;

    // --- constructors -------------------------------------------------------

    public AstroBoy(Point position) {
        validatePositions(position);
        path = new ArrayList<>();
        commonMoveTo(position);
    }

    // --- getters and setters ------------------------------------------------

    public Point getPosition() { return position; }
    public int getAngle() { return angle; }

    @Override
    public List<Point> getPath() { return path; }

    // --- public methods -----------------------------------------------------

    @Override
    public void liftTo(long altitude) {
        commonMoveTo(getLiftingTarget(altitude));
    }

    @Override
    public void moveTo(Point position) {
        validatePositions(position);
        walkTo(position);
    }

    @Override
    public void fastMoveTo(Point position) {
        validatePositions(position);
        flyTo(ALTITUDE, position);
    }

    @Override
    public void rotate(int angle) {
        this.angle += angle;
    }

    // --- private methods ----------------------------------------------------

    private void walkTo(Point position) {
        commonMoveTo(position);
    }

    private void flyTo(long altitude, Point position) {
        liftTo(altitude);
        flyTo(position);
        liftTo(0);
    }

    private void flyTo(Point position) {
        commonMoveTo(getFlyingTarget(position));
    }

    private void commonMoveTo(Point position) {
        this.position = position;
        path.add(position);
    }

    private Point getLiftingTarget(long altitude) {
        return new Point(position.getX(), position.getY(), altitude);
    }

    private Point getFlyingTarget(Point position) {
        return new Point(position.getX(), position.getY(), ALTITUDE);
    }

    private void validatePositions(Point position) {
        if (this.position != null && isNotInPlane(this.position) || isNotInPlane(position)) {
            throw new IllegalArgumentException("Movements have to start and end in the plane.");
        }
    }

    private boolean isNotInPlane(Point position) {
        return position.getZ() != 0;
    }
}