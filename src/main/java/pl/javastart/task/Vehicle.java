package pl.javastart.task;

public class Vehicle {
    private String name;
    private int capacity;
    private double fuelConsumption;

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

    public double range() {
        return this.fuelConsumption * capacity / 100;
    }

    public String printInfo() {
        return null;
    }
}
