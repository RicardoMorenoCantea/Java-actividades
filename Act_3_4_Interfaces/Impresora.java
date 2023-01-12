package Act_3_4_Interfaces;

public class Impresora implements Imprimible, Borrable {
    public String pagina;

    Impresora(){
        pagina = TEXTO_POR_DEFECTO;
    }
    @Override
    public void imprimir() {
        System.out.println(pagina);
    }
    public void borrar() {
        pagina = "";
    }
    public void establecerContenido(String contenido) {
        pagina = contenido;
    }
}
