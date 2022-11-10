package PlaneManager;

public class Plane {
    private final String model;
    private final String planeType;
    private final int year;
    private final int passengersCapacity;
    private final int weight;

    public Plane(String model, String planeType, int year, int passengersCapacity, int weight) {
        this.model = model;
        this.planeType = planeType;
        this.year = year;
        this.passengersCapacity = passengersCapacity;
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public String getPlaneType() {
        return planeType;
    }

    public int getYear() {
        return year;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Model: " + model + " Type: " + planeType + " Year: " + year + " Passengers: " + passengersCapacity + " Weight: " + weight;
    }
}
