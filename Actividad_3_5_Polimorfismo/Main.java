package Polimorfclase;

public class Main {
    public static void main(String[] args) {
        Instrumento ins;

        ins = new Guitarra();
        ins.tocar();

        ins = new Tambor();
        ins.tocar();
    }
}
