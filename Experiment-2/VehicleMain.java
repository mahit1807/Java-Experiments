class Vehicle {
    private String brand;
    private String model;
    private String fuelType;
    private double engineCapacity;
    private double distanceTravelled;
    private double fuelUsed;

    public int year;

    public Vehicle() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.fuelType = "Petrol";
        this.engineCapacity = 0;
        this.distanceTravelled = 0;
        this.fuelUsed = 0;
        this.year = 0;
    }

    public Vehicle(String brand, String model, String fuelType,
                   double engineCapacity, double distanceTravelled,
                   double fuelUsed, int year) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
        this.distanceTravelled = distanceTravelled;
        this.fuelUsed = fuelUsed;
        this.year = year;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public String getFuelType() { return fuelType; }

    public double calculateMileage() {
        double mileage = 0;
        if (fuelUsed != 0) {
            mileage = distanceTravelled / fuelUsed;
        }

        if (fuelType.equalsIgnoreCase("Petrol")) {
            mileage = mileage + 3;
        } else if (fuelType.equalsIgnoreCase("Diesel")) {
            mileage = mileage - 2;
        }
        return mileage;
    }
}

public class Main {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("BMW", "M5", "Petrol", 4400, 400, 40, 2024);
        Vehicle v2 = new Vehicle("Mercedes", "C-Class", "Diesel", 2000, 500, 35, 2023);
        Vehicle v3 = new Vehicle("Audi", "A6", "Petrol", 3000, 450, 32, 2024);
        Vehicle v4 = new Vehicle("Porsche", "911", "Petrol", 3800, 350, 38, 2025);
        Vehicle v5 = new Vehicle("Lamborghini", "Huracan", "Petrol", 5200, 300, 45, 2025);

        System.out.println("\n---------------- Vehicle Comparison -----------------------");
        System.out.printf("%-15s %-12s %-10s %-8s %-10s\n",
                "Brand", "Model", "Fuel", "Year", "Mileage");
        System.out.println("------------------------------------------------------------");

        Vehicle[] vehicles = {v1, v2, v3, v4, v5};

        for (Vehicle v : vehicles) {
            System.out.printf("%-15s %-12s %-10s %-8d %-10.2f\n",
                    v.getBrand(),
                    v.getModel(),
                    v.getFuelType(),
                    v.year,
                    v.calculateMileage());
        }
    }
}
