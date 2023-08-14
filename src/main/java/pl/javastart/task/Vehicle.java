package pl.javastart.task;

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
        return (capacity / fuelConsumption) * 100;
    }

    public String printInfo() {
        return null;
    }
}
