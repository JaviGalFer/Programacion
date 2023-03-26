/*
 * @author Fco Javier Gallego Fernández
 */
public abstract class CuentaBancaria {
    private String iban;
    private double saldo;
    private static double interesAnualBasico = 0.01;

    public CuentaBancaria(String iban, double saldo) {
        this.iban = iban;
        this.saldo = saldo;
    }

    public String getIban() {
        return iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresar(double cantidad) {
        añadir(cantidad);
    }

    public void retirar(double cantidad) {
        añadir(-cantidad);
    }

    public void traspaso(CuentaBancaria cuentaDestino, double cantidad) {
        retirar(cantidad);
        cuentaDestino.ingresar(cantidad);
    }

    private void añadir(double cantidad) {
        saldo += cantidad;
    }

    public abstract double calcularIntereses();

    public void mostrarDatos() {
        System.out.println("IBAN: " + iban);
        System.out.println("Saldo: " + saldo);
    }
}
