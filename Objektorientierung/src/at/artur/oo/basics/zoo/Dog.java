package at.artur.oo.basics.zoo;

public class Dog extends Animal {

    public Dog(int weight, int height) {
        super(weight, height);
    }

    public void bark() {
        System.out.println("Wuff");
    }
}
