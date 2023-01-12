package Act_3_4_Interfaces;

public class Consola implements Imprimible, Borrable {
    String pantalla;
    Consola() {
        pantalla = "texto de prueba";
    }
    @Override
    public void imprimir() {
        System.out.printf("$ %S%n", pantalla);
    }
    public void borrar() {
        String blank = "*";
        for (int i = 0; i <= pantalla.length(); i++) {
            blank += "*";
        }
        pantalla = blank;
    }
    public void establecerContenido(String contenido) {
        pantalla = "";
        pantalla += contenido;
    }
}
