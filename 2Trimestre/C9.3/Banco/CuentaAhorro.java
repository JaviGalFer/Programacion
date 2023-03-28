/*
 * @author Fco Javier Gallego Fernández
 */
public class CuentaAhorro extends CuentaBancaria {
    //Atributoss
    private static final double saldoMinimo = 1000;
    private static final double interesBasico = 0.01;
    private static final double interesAdicional = 0.02;
    
    public CuentaAhorro(String iban, double saldo) {
        super(iban, saldo);
    }

    //Método heredado calcularIntereses de la cuenta de ahorros
    @Override
    public void calcularIntereses() {
        double intereses;
        if (getSaldo() >= saldoMinimo) {
            intereses = getSaldo() * interesAdicional;
        } else {
            intereses = getSaldo() * interesBasico / 2;
        }
        añadir(intereses);
        System.out.println("\nLos intereses son "+intereses+" euros.");
    }

    //Método añadir cantidad cantidad a la cuenta
    public void añadir(double cantidad) {
        super.añadir(cantidad);
    }
}
