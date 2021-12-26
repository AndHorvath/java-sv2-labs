package abstractclass.gamecharacter;

public class Point {

    // --- attributes ---------------------------------------------------------

    private final long x;
    private final long y;

    // --- constructors -------------------------------------------------------

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    // --- getters and setters ------------------------------------------------

    public long getX() { return x; }
    public long getY() { return y; }

    // --- public functions ---------------------------------------------------

    public long getDistance(Point otherPoint) {
        return Math.round(Math.sqrt(Math.pow(x - otherPoint.x, 2.0) + Math.pow(y - otherPoint.y, 2.0)));
    }
}