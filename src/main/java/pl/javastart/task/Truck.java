package pl.javastart.task;

public class Truck extends Car {
    private double load;
    private static final double AIRCONDITIONINGFACTOR = 1.6;
    private static final double LOADFACTOR = 0.5;

    public Truck(String name, int capacity, double fuelConsumption, boolean clima, double load) {
        super(name, capacity, fuelConsumption, clima);
        this.load = load;
    }

    public double getLoad() {
        return load;
    }

    @Override
    public double calculateRange() {
        double adjustedFuelConsumption = airconditioning ? fuelConsumption + 1.6 : fuelConsumption;
        double adjustedCargoConsumption = load * 0.5 / 100; // 0.5L - 100kg
        return (capacity / (adjustedFuelConsumption + adjustedCargoConsumption)) * 100;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + "\nLoad: " + getLoad();
    }
}
