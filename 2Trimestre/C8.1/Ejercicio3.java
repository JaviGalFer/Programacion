import java.util.Scanner;
import misFunciones.Varias;
/**
* 
* @author Fco Javier Gallego Fernández
*/
public class Ejercicio3 {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int a;
        int b;

        System.out.print ("Introduce el primer número: ");
        a = s.nextInt();

        System.out.print ("Introdsuce el segundo número: ");
        b = s.nextInt();

        int minimo = misFunciones.Varias.numMin(a, b);
        System.out.println(minimo);


    s.close(); 
    }
}
