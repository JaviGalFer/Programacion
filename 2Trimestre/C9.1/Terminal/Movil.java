/**
* Clase main para probar los diferentes métodos
* @author Fco Javier Gallego Fernández
*/
import java.text.DecimalFormat;

public class Movil extends Terminal {
    private String tarifa;
    private double costeLlamada;

    public Movil(String numero, String tarifa) {
        super(numero);
        this.tarifa = tarifa;
    }

    @Override
    public void llama(Terminal t, int segundos) {
        super.llama(t, segundos);
        double costeSegundos = (double) segundos / 60;
        switch (tarifa) {
            case "rata":
                costeLlamada += costeSegundos * 0.06;
                break;
            case "mono":
                costeLlamada += costeSegundos * 0.12;
                break;
            case "bisonte":
                costeLlamada += costeSegundos * 0.3;
                break;
            default:
                break;
        }
    }

    public double getCosteLlamada() {
        return costeLlamada;
    }

    @Override
    public String toString() {
        DecimalFormat formatoDecimal = new DecimalFormat("0.00");
        return "Nº " + this.getNumero() + " - " + this.getSegundosDeConversacion() + "s de conversación - tarificados " + formatoDecimal.format(this.costeLlamada) + " euros";
    }
}

