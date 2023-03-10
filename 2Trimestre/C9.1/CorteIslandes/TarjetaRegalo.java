import java.text.DecimalFormat;
/**
* Clase TarjetaRegalo con los diferentes métodos y atributos de instancia
* @author Fco Javier Gallego Fernández
*/
public class TarjetaRegalo {
    private int numero;
    private double saldo;       //Atributos de instancia

    public TarjetaRegalo(double saldoInicial) {
        this.saldo = saldoInicial;                  //Constructor
        this.numero = 0;

        for (int i = 0; i < 5; i++){
            this.numero += (int)(Math.random() * 10);
        }
    }

    public void gasta(double cantidad) {                       //Método de saldo
        if (saldo < cantidad) {
            System.out.println("No tiene suficiente saldo para gastar " + cantidad + " Euros");
        } else {
            saldo -= cantidad;
        }
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo otraTarjeta) {            //Método de fusión
        double nuevoSaldo = this.getSaldo() + otraTarjeta.getSaldo();
        this.setSaldo(0);
        otraTarjeta.setSaldo(0);
        return new TarjetaRegalo(nuevoSaldo);
    }

    public void setSaldo(double saldo){     
        this.saldo = saldo;
    }                                       //Getter y setter

    public double getSaldo(){
        return saldo;
    }

    @Override
    public String toString() {                                                      //toString para las llamadas a la instancia
        DecimalFormat dosDecimales = new DecimalFormat("0.00");             //En los prints
        return "Tarjeta nº " + numero + " - Saldo " + dosDecimales.format(saldo) + " Euros";
    }
}
