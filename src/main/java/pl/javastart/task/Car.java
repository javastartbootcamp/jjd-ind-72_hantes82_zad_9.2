package pl.javastart.task;

public class Car extends Vehicle {
    private boolean clima;
    private final double climaFactor = 0.8;

    public Car(String name, int capacity, double fuelConsumption, boolean clima) {
        super(name, capacity, fuelConsumption);
        this.clima = clima;
    }

    public boolean isClimatronic() {
        return clima;
    }

    @Override
    public double range() {
        if (clima) {
            return super.range() + this.getFuelConsumption() / 100 * this.climaFactor;
        } else {
            return super.range();
        }
    }

    @Override
    public String printInfo() {
        return "Name: " + super.getName() + "\nCapacity:  " + super.getCapacity() + "\nClima is on:  " + clima
                + "\nFuel Consumption: " + super.getFuelConsumption() + "\nRange: " + this.range();
    }
}
