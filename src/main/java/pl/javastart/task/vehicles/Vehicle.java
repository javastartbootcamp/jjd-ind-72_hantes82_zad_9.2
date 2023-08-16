package pl.javastart.task.vehicles;

public class Vehicle {
    protected  String name;
    protected int capacity;
    protected  double fuelConsumption;

    public Vehicle(String name, int capacity, double fuelConsumption) {
        this.name = name;
        this.capacity = capacity;
        this.fuelConsumption = fuelConsumption;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double calculateRange() {
        return (capacity / getFuelConsumption()) * 100;
    }

    public String getInfo() {
        return null;
    }
}
