/*
 * @author Fco Javier Gallego Fernández
 */
public class CuentaAhorro extends CuentaBancaria {
    private static final double SALDO_MINIMO = 1000;
    private static final double INTERES_BASICO = 0.01;
    private static final double INTERES_ADICIONAL = 0.02;
    
    public CuentaAhorro(String iban, double saldo) {
        super(iban, saldo);
    }

    @Override
    public double calcularIntereses() {
        double intereses;
        if (getSaldo() >= SALDO_MINIMO) {
            intereses = getSaldo() * INTERES_ADICIONAL;
        } else {
            intereses = getSaldo() * INTERES_BASICO / 2;
        }
        añadir(intereses);
        return intereses;
    }

    private void añadir(double cantidad) {
        super.añadir(cantidad);
    }
}
