public class House extends Building {
    // Variable Declarations
    // Constructors
    public House () {}
    public House (double buildingWidth, double buildingLength, int buildingPrice, String buildingColor) {
        this.buildingWidth = buildingWidth;
        this.buildingLength = buildingLength;
        this.buildingPrice = buildingPrice;
        this.buildingColor = buildingColor;

        var room1 = new Room("Kitchen", 15, 15, 8, 2);
        var room2 = new Room("Living Room", 15, 15, 8, 4);
        var room3 = new Room("Bathroom", 5, 5, 8, 1);
        var room4 = new Room("Master Bedroom", 15, 10, 8, 3);
        var room5 = new Room("Bedroom", 10, 10, 8, 2);

        System.out.println(room1);
        System.out.println(room2);
        System.out.println(room3);
        System.out.println(room4);
        System.out.println(room5);
    }
    // Methods
    // Accessors
    // Overrides
    @Override
    public String toString() {
        String roomDescription = buildingWidth + "ft  " + buildingLength + "ft  $" + buildingPrice + "  " + buildingColor;
        return roomDescription;
    }
}
