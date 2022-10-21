public class Formato {
    public static void main(String[] args) {
        System.out.printf("%s \n","Hola");
        Formato.saludar("Nombre");
        Formato.presentar("Nombre",18);
        Formato.presentar2("Nombre",18);
        System.out.printf("%s\\%s\\%s \n","primero","segundo","tercero");
        System.out.printf("%d/%d=%.2f",3,2,1.5f);
        
    }
    public static void saludar(String name) {
        System.out.printf("Hola, %s \n", name);
    }
    public static void presentar(String nombre, int edad) {
        System.out.printf("Hola, me llamo %s, tengo %d años. \n", nombre, edad);
    }
    public static void presentar2(String nombre, int edad) {
        System.out.printf("Nombre: %s\nEdad: %d \n", nombre, edad);
    }
}

