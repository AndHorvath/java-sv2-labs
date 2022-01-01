package interfaceextends.robots;

public class Point {

    // --- attributes ---------------------------------------------------------

    private final long x;
    private final long y;
    private final long z;

    // --- constructors -------------------------------------------------------

    public Point(long x, long y, long z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // --- getters and setters ------------------------------------------------

    public long getX() { return x; }
    public long getY() { return y; }
    public long getZ() { return z; }
}