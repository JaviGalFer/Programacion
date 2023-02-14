import java.util.Scanner;
import misFunciones.Varias;
/**
*
* @author Fco Javier Gallego Fernández
*/
public class BinarioADecimal {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce un número binario: ");
        String binario = s.nextLine();

        int decimal = Varias.binarioADecimal(binario);
        System.out.println ("El número binario introducido en decimal es: " + decimal);
    s.close();
    }
}
