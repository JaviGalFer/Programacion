/**
* Clase main para probar los diferentes métodos
* @author Fco Javier Gallego Fernández
*/
public class Terminal {
    private String numero;
    private int segundosDeConversacion;

    public Terminal(String numero) {
        this.numero = numero;
        this.segundosDeConversacion = 0;
    }

    public String getNumero(){
        return numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public int getSegundosDeConversacion() {
        return segundosDeConversacion;
    }

    public void setSegundosDeConversacion(int segundosDeConversacion) {
        this.segundosDeConversacion = segundosDeConversacion;
    }

    public void llama(Terminal t, int segundos) {
        segundosDeConversacion += segundos;
        t.segundosDeConversacion += segundos;
    }

    public String toString() {
        return "Nº " + numero + " - " + segundosDeConversacion + "s de conversación";
    }
}
