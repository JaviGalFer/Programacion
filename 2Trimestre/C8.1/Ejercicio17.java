import java.util.Scanner;
import misFunciones.Varias;
/**
* Pide número por pantalla y dice si es primo o no hasta que se introduzca un 0
* @author Fco Javier Gallego Fernández
*/
public class Ejercicio17 {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int num;

        System.out.println("Introduce números enteros y le diré si es primo o no");
        System.out.println("Pulsa 0 para salir: ");

        do {                         //Mientras la variable num sea diferente a 0 se realiza el do-while
            num = s.nextInt();                               
            if (num != 0){              
                if (Varias.esPrimo(num)) {                                     //Se llama a la función esPrimo
                    System.out.println ("El número " + num + " es primo.");
                }else {
                    System.out.println ("El número " + num + " no es primo.");
                }
            }
        } while (num != 0); //Se comprueba que sea diferente a 0

    s.close();
    }
}
