/*
 * @author Fco Javier Gallego Fernández
 */
public class CuentaCorriente extends CuentaBancaria {
    //Atributos
    private static final double interesAdicional = 0.01;

    public CuentaCorriente(String iban, double saldo) {
        super(iban, saldo);
    }

    //Método calcularIntereses de la cuenta corriente
    public void calcularIntereses(){
        double intereses=getSaldo()*getInteresAnualBasico();
        añadir(intereses);    

        System.out.println("\nLos intereses son "+intereses+" euros.");
    }

    //Método heredado añadir cantidad a la cuenta
    @Override
    public void añadir(double cantidad) {
        super.añadir(cantidad);
        super.añadir(cantidad * interesAdicional);
    }
}
