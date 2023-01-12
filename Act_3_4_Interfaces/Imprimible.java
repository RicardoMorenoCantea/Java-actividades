package Act_3_4_Interfaces;

public interface Imprimible extends Borrable, Editable {
    String TEXTO_POR_DEFECTO = "Página de prueba";
    void imprimir();
}
