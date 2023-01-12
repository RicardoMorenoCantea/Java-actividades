package Act_3_4_Interfaces;

public class TestImpresiones {
    public static void main(String[] args) {
        /*Impresora imp = new Impresora();
        Consola con = new Consola();*/

        Imprimible imp = new Impresora();
        Imprimible con = new Consola();

        imp.imprimir();
        con.imprimir();

        System.out.println("-------------------");

        imp.borrar();
        con.borrar();

        imp.imprimir();
        con.imprimir();

        System.out.println("-------------------");

        imp.establecerContenido("Esto es un test.");
        con.establecerContenido("Esto es un test.");

        imp.imprimir();
        con.imprimir();

    }
}
