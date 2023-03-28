/*
 * @author Fco Javier Gallego Fernández
 */
public abstract class CuentaBancaria {
    //Atributos
    private String iban;
    private double saldo;
    private static final double interesAnualBasico = 0.01;

    //Método constructor
    public CuentaBancaria(String iban, double saldo) {
        this.iban = iban;
        this.saldo = saldo;
    }
    
    //Getters
    public String getIban() {
        return iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getInteresAnualBasico(){
        return interesAnualBasico;
    }

    //Método añadir dinero a la cuenta
    public void añadir(double cantidad) {
        saldo += cantidad;
    }

    //Método ingresar dinero a la cuenta
    public void ingresar(double cantidad) {
        añadir(cantidad);
    }

    //Método retirar dinero de la cuenta
    public void retirar(double cantidad) {
        añadir(-cantidad);
    }

    //Método transferencia de dinero
    public void traspaso(CuentaBancaria cuentaDestino, double cantidad) {
        retirar(cantidad);
        cuentaDestino.ingresar(cantidad);
    }

    //Método calcularInteres
    public abstract void calcularIntereses();

    //Método mostrar datos de la cuenta
    public void mostrarDatos() {
        System.out.println("IBAN: " + iban);
        System.out.println("Saldo: " + saldo);
    }

    //Método toString
    public String toString(int identificativo){
        String  toString="\n///////////////////////";
                toString+="\n Cuenta número "+identificativo+": **** **** **** "+getIban().substring(getIban().length()-5);
                toString+="\n///////////////////////";

        return toString;
    }
}
