import java.util.Scanner;
import misFunciones.Varias;
/**
* 
* @author Fco Javier Gallego Fernández
*/
public class Ejercicio11 {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);  
        int num;

        System.out.print ("Introduce un número y se mostrara la tabla de multiplicar: " );
        num = s.nextInt();

        Varias.tablaMultiplicar(num);
        
    s.close();
    }
}
