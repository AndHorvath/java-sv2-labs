package methodpass;

public class Window {

    // --- attributes ---------------------------------------------------------

    private String roomName;
    private int width;
    private int height;

    // --- constructors -------------------------------------------------------

    public Window(String roomName, int width, int height) {
        this.roomName = roomName;
        this.width = width;
        this.height = height;
    }

    // --- getters and setters ------------------------------------------------

    public String getRoomName() { return roomName; }
    public void setRoomName(String roomName) { this.roomName = roomName; }

    public int getWidth() { return width; }
    public void setWidth(int width) { this.width = width; }

    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }
}