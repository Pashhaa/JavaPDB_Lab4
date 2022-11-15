package PlaneManager;

public class Plane {
    private final String model;
    private final String planeType;
    private final int yearOfManufacture;
    private final int passengersCapacity;
    private final int weight;

    public Plane(String model, String planeType, int yearOfManufacture, int passengersCapacity, int weight) {
        this.model = model;
        this.planeType = planeType;
        this.yearOfManufacture = yearOfManufacture;
        this.passengersCapacity = passengersCapacity;
        this.weight = weight;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Model: " + model + " Type: " + planeType + " Year: " + yearOfManufacture + " Passengers: " + passengersCapacity + " Weight: " + weight;
    }
}
