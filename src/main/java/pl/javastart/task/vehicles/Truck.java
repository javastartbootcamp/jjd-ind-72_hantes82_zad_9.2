package pl.javastart.task.vehicles;

import pl.javastart.task.vehicles.Car;

public class Truck extends Car {
    private double load;
    private static final double AIR_CONDITIONING_FACTOR = 1.6;
    private static final double LOAD_FACTOR = 0.5;

    public Truck(String name, int capacity, double fuelConsumption, boolean clima, double load) {
        super(name, capacity, fuelConsumption, clima);
        this.load = load;
    }

    public double getLoad() {
        return load;
    }

    @Override
    public double getFuelConsumption() {
        double acFuelConsumption = aceOn ? AIR_CONDITIONING_FACTOR : 0;
        double adjustedCargoConsumption = load * LOAD_FACTOR / 100; // 0.5L - 100kg
        return fuelConsumption + acFuelConsumption + adjustedCargoConsumption;

    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nLoad: " + getLoad();
    }
}
