package pl.javastart.task;

public class Car extends Vehicle {
    protected boolean airconditioning;
    private static final double AIRCONDITIONINGFACTOR = 0.8;

    public Car(String name, int capacity, double fuelConsumption, boolean airconditioning) {
        super(name, capacity, fuelConsumption);
        this.airconditioning = airconditioning;
    }

    @Override
    public double calculateRange() {
        if (airconditioning) {
            return (capacity / (fuelConsumption + AIRCONDITIONINGFACTOR)) * 100;
        }
        return super.calculateRange();
    }

    @Override
    public String printInfo() {
        return "Name: " + name + "\nCapacity:  " + capacity + "\nAirconditioning is on:  " + airconditioning
                + "\nFuel Consumption: " + fuelConsumption + "\nRange: " + calculateRange();
    }
}
