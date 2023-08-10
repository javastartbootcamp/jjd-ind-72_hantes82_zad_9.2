package pl.javastart.task;

public class Truck extends Car {
    private double load;
    private final double climaFactor = 1.6;

    public Truck(String name, int capacity, double fuelConsumption, boolean clima, double load) {
        super(name, capacity, fuelConsumption, clima);
        this.load = load;
    }

    public double getLoad() {
        return load;
    }

    @Override
    public double range() {
        return super.range() + super.getFuelConsumption() / 100 * getLoad();
    }

    @Override
    public String printInfo() {
        return super.printInfo() + "\nLoad: " + getLoad();
    }
}
