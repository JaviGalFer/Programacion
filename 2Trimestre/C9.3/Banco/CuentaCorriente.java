/*
 * @author Fco Javier Gallego Fernández
 */
public class CuentaCorriente extends CuentaBancaria {
    private static final double INTERES_ADICIONAL = 0.01;

    public CuentaCorriente(String iban, double saldo) {
        super(iban, saldo);
    }

    @Override
    public double calcularIntereses() {
        double intereses = getSaldo() * interesAnualBasico;
        añadir(intereses);
        return intereses;
    }

    private void añadir(double cantidad) {
        super.añadir(cantidad);
        super.añadir(cantidad * INTERES_ADICIONAL);
    }
}
