import _02_Das_Erste_Objekt.Car;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.brand = "Audi";
        c1.fuelConsumption  = 7;
        c1.serialNumber = "A1234";
        c1.fuelAmount = 55;
        c1.tankAmount = 60;

        Car c2 = new Car();
        c2.brand = "BMW";
        c2.fuelConsumption  = 8;
        c2.serialNumber = "B1234";
        c2.fuelAmount  = 12;
        c2.tankAmount = 80;

        System.out.println(c2.fuelAmount);
        c2.drive();
        System.out.println(c2.fuelAmount);
        c1.Break();
        c1.turboBoost();
        c2.turboBoost();
    }
}