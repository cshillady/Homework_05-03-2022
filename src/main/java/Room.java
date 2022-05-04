public class Room extends House {
    // Variable Declarations
    private String roomName;
    private double roomWidth;
    private double roomLength;
    private double roomHeight;
    private int windowsCount;
    // Constructors
    public Room (String roomName, double roomWidth, double roomLength, double roomHeight, int windowsCount) {
        this.roomName = roomName;
        this.roomWidth = roomWidth;
        this.roomLength = roomLength;
        this.roomHeight = roomHeight;
        this.windowsCount = windowsCount;
    }
    // Methods
    // Accessors
    // Overrides
    @Override
    public String toString() {
        String roomDescription = roomName + "  " + roomWidth + "ft  " + roomLength + "ft  " + roomHeight + "ft  " + windowsCount;
        return roomDescription;
    }
}
