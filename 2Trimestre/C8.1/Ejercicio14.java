import java.util.Scanner;
import misFunciones.Varias;
/**
* 
* @author Fco Javier Gallego Fernández
*/
public class Ejercicio14 {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in); 
        int altura;
        String relleno;

        System.out.print ("Indica la altura de la piramide: ");
        altura = s.nextInt();
        System.out.print ("Indica el relleno de la piramide: ");
        relleno = s.next();

        Varias.piramide(altura, relleno);

    s.close();
    }
}
