package Ex5;

public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(80, 25000, "Silver", 22);
        System.out.println("Sedan Sale Price: $" + sedan.getSalePrice());

        Ford ford1 = new Ford(70, 35000, "Black", 2021, 2000);
        Ford ford2 = new Ford(65, 30000, "White", 2019, 1500);
        System.out.println("Ford 1 Sale Price: $" + ford1.getSalePrice());
        System.out.println("Ford 2 Sale Price: $" + ford2.getSalePrice());

        Car car = new Car(60, 20000, "Red");
        System.out.println("Car Sale Price: $" + car.getSalePrice());
    }
}
