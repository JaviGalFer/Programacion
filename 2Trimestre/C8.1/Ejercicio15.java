import java.util.Scanner;
import misFunciones.FunciArrays;
/**
* Crea un array de tamaño 100 con los 100 primeros números naturales
* Luego muestra la suma total del array y la media
* @author Fco Javier Gallego Fernández
*/
public class Ejercicio15 {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in); 
        
        System.out.println("Se va a crear un array de tamaño 100 con los primeros 100 números naturales");
        int[] myArray = FunciArrays.generaArrayInt(100, 0, 100);  //Se crea el array llamando a la función

        System.out.println ("La suma total del array es: " + FunciArrays.sumaArrayInt(myArray));            //Se muestra suma y media
        System.out.println ("La media de los números del array es: " +FunciArrays.mediaArrayInt(myArray));
    s.close();
    }
}
