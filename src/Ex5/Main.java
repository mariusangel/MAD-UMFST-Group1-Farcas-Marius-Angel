package Ex5;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(60, 20000, "Red");
        System.out.println("Car Sale Price: $" + car.getSalePrice());

        Truck truck = new Truck(50, 30000, "Blue", 2500);
        System.out.println("Truck Sale Price: $" + truck.getSalePrice());

        Ford ford = new Ford(70, 35000, "Black", 2023, 2000);
        System.out.println("Ford Sale Price: $" + ford.getSalePrice());
    }
}
