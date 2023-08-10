package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Vehicle[] vehicle = new Vehicle[4];
        vehicle[0] = new Car("Volvo", 40, 10, false);

        vehicle[1] = new Car("Volvo", 40, 10, true);
        vehicle[2] = new Truck("Ford", 100, 30, false, 0);
        vehicle[3] = new Truck("Ford", 100, 30, true, 10);

        System.out.println(vehicle[0].printInfo());
        System.out.println();
        System.out.println(vehicle[1].printInfo());
        System.out.println();
        System.out.println(vehicle[2].printInfo());
        System.out.println();
        System.out.println(vehicle[3].printInfo());
    }
}
