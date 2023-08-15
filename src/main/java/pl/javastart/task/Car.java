package pl.javastart.task;

public class Car extends Vehicle {
    protected boolean aceOn;
    private static final double AIR_CONDITIONING_FACTOR = 0.8;

    public Car(String name, int capacity, double fuelConsumption, boolean aceOn) {
        super(name, capacity, fuelConsumption);
        this.aceOn  = aceOn;
    }

    @Override
    public double getFuelConsumption() {
        if (aceOn) {
            return fuelConsumption + AIR_CONDITIONING_FACTOR;
        } else {
            return fuelConsumption;
        }
    }

    @Override
    public String printInfo() {
        return "Name: " + name + "\nCapacity:  " + capacity + "\nAirconditioning is on:  " + aceOn
                + "\nBasic fuel Consumption: " + fuelConsumption + "\nRange: " + calculateRange();
    }
}
