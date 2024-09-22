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

}
