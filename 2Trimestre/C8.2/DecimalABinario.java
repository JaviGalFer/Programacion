import java.util.Scanner;
import misFunciones.Varias;
/**
*
* @author Fco Javier Gallego Fernández
*/
public class DecimalABinario {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce un número decimal: ");
        int decimal = s.nextInt();

        String binario = Varias.decimalABinario(decimal);
        System.out.println ("El número decimal introducido en binario es: " + binario);
        
    s.close();
    }
}
