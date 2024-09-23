public class Main {
    public static void main(String[] args) {
        Plant plant1 = new Plant("Daisy", "Gerber", "45", "0.2", "10°C - 40");
        Plant plant2 = new Plant("Rose", "Dutch rose", "80 - 120", "0.8 - 1.0", "16°C - 28");
        Plant plant3 = new Plant("Lily", "Calla ", "30 - 60", "0.1", "20°C - 38");

        plant1.displayInfo();
        plant2.displayInfo();
        plant3.displayInfo();

        plant1.displayInfo();
        plant1.waterPlant(0.1);
        plant1.displayInfo();
    }
}
