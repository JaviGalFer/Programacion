import java.util.Scanner;
import misFunciones.Varias;
/**
* 
* @author Fco Javier Gallego Fernández
*/
public class Ejercicio1 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double a;
    double b;
    

    System.out.print ("Introduce el primer número: ");
    a = s.nextInt();
    System.out.print ("Introduce el segundo número: ");
    b = s.nextInt();
    
    double multiplicar = Varias.multiplica(a, b);

    System.out.println ("El resultado de " +a+ " * " +b+ " es:" +multiplicar);

    s.close();
    }
}
