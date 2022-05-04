public class Building {
    // Variable Declarations
    private double buildingWidth;
    private double buildingLength;
    private int buildingPrice;
    public String buildingColor;
    // Constructors
    public Building () {}
    public Building (double buildingWidth, double buildingLength, int buildingPrice) {
        this.buildingWidth = buildingWidth;
        this.buildingLength = buildingLength;
        this.buildingPrice = buildingPrice;
    }
    // Methods
    // Accessors
    public double getBuildingWidth() {
        return buildingWidth;
    }
    public double getBuildingLength() {
        return buildingLength;
    }
    public int getBuildingPrice() {
        return buildingPrice;
    }
    public String getBuildingColor() {
        return buildingColor;
    }
    // Overrides
}
