import java.util.Scanner;
import misFunciones.Varias;
/**
* 
* @author Fco Javier Gallego Fernández
*/
public class Ejercicio2 {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int edad;

        System.out.print ("Introduce tu edad: ");
        edad = s.nextInt();

        if(Varias.esMayorEdad(edad)){
            System.out.println("Eres mayor de edad");
        }else {
            System.out.println("No eres mayor de edad");
        }

    s.close();    
    }
}
