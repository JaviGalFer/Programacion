import java.util.Scanner;
import misFunciones.Varias;
/**
* Dice si eres mayor de edad o no
* @author Fco Javier Gallego Fernández
*/
public class Ejercicio2 {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int edad;   //Se declara variable

        System.out.print ("Introduce tu edad: ");
        edad = s.nextInt();                         //Se pide por pantalla la edad

        if(Varias.esMayorEdad(edad)){       //Se llama a la función esMayorEdad que es boolean
            System.out.println("Eres mayor de edad");
        }else {
            System.out.println("No eres mayor de edad");
        }

    s.close();    
    }
}
