package Actividad_3_5_Polimorfismo;

public class Bird extends Animal implements Flyable {
    @Override
    public void speak() {
        System.out.println("Pío, pío");
    }
    public void fly() {
        System.out.println("*Sale volando*");
    }
}
