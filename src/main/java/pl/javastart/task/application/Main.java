package pl.javastart.task.application;

import pl.javastart.task.vehicles.Car;
import pl.javastart.task.vehicles.Truck;
import pl.javastart.task.vehicles.Vehicle;

public class Main {

    public static void main(String[] args) {
        Vehicle[] vehicle = new Vehicle[5];
        vehicle[0] = new Car("Volvo", 40, 10, false);

        vehicle[1] = new Car("Volvo", 40, 10, true);
        vehicle[2] = new Truck("Ford", 100, 30, false, 0);
        vehicle[3] = new Truck("Ford", 100, 30, true, 10);
        vehicle[4] = new Truck("Ford", 100, 30, false, 10);

        System.out.println(vehicle[0].getInfo());
        System.out.println();
        System.out.println(vehicle[1].getInfo());
        System.out.println();
        System.out.println(vehicle[2].getInfo());
        System.out.println();
        System.out.println(vehicle[3].getInfo());
        System.out.println();
        System.out.println(vehicle[4].getInfo());
    }
}
