public class Plant {
    public String name;
    public String type;
    public String height;
    public String waterNeeds;
    public String temperatureTolerance;

    public Plant(String name, String type, String height, String waterNeeds, String age) {

        this.name = name;
        this.type = type;
        this.height = height;
        this.waterNeeds = waterNeeds;
        this.temperatureTolerance = age;
    }

    public void displayInfo() {
        System.out.println("Plant Name: " + name);
        System.out.println("Plant Type: " + type);
        System.out.println("Plant Height: " + height + " cm");
        System.out.println("Plant WaterNeeds: " + waterNeeds + " liters/day");
        System.out.println("Plant TemperatureTolerance: " + temperatureTolerance + "°C");
    }
    public void waterPlant(double waterAmount) {
        double waterNeedsInLiters;
        try {
            waterNeedsInLiters = Double.parseDouble(waterNeeds);
        } catch (NumberFormatException e) {
            System.out.println("Invalid format for water needs. Unable to water the plant.");
            return;
        }

        if (waterAmount >= waterNeedsInLiters) {
            System.out.println(name + " has been watered sufficiently!");
            waterNeedsInLiters = 0;
        } else {
            waterNeedsInLiters -= waterAmount;
            System.out.println(name + " still needs " + waterNeedsInLiters + " liters of water.");
        }
        waterNeeds = String.valueOf(waterNeedsInLiters);
    }
}
