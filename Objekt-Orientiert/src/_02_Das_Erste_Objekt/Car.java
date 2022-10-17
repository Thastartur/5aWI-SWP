package _02_Das_Erste_Objekt;

public class Car {
    // Instanz, Gedächnisvariablen
    public int fuelConsumption;
    public int fuelAmount;
    public int tankAmount;
    public String brand;
    public String serialNumber;
    private String color;

    // Methode
    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsumption ;
        System.out.println("I am driving.");
    }

    public void Break(){
        System.out.println("Ich break.");
    }

    public void turboBoost(){
        if(this.fuelAmount > this.tankAmount/10){
            System.out.println("SuperBoostMode on.");
        }
        else{
            System.out.println("Not enough fuel to enable SuperBoostMode.");
        }
    }
}
