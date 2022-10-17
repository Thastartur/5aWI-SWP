import _02_Das_Erste_objekt.Car;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.brand = "Audi";
        c1.fuelConsumption  = 7;
        c1.serialNumber = "A1234";

        Car c2 = new Car();
        c2.brand = "BMW";
        c2.fuelConsumption  = 8;
        c2.serialNumber = "B1234";

        System.out.println(c1.serialNumber);
        System.out.println(c2.serialNumber);
    }
}