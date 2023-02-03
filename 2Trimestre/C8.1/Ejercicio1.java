import java.util.Scanner;
import misFunciones.Varias;
/**
* Realiza la multiplicación de dos números enteros
* @author Fco Javier Gallego Fernández
*/
public class Ejercicio1 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double a;
    double b;           //Se declaran variables
    

    System.out.print ("Introduce el primer número: ");
    a = s.nextInt();                                        //Se pide ambos números
    System.out.print ("Introduce el segundo número: ");
    b = s.nextInt();
    
    double multiplicar = Varias.multiplica(a, b);       //Se llama a la función multiplica y se guarda el resultado

    System.out.println ("El resultado de " +a+ " * " +b+ " es:" +multiplicar);  //Se muestra el resultado por pantalla

    s.close();
    }
}
