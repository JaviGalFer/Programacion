import java.util.Scanner;
import misFunciones.Varias;
/**
* Pide por pantalla el DNI y te indica la letra del DNI
* @author Fco Javier Gallego Fernández
*/
public class Ejercicio18 {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int dni;            //Se declara variable

        System.out.print ("Introduce tu número de DNI y le mostraré la letra correspondiente: ");
        dni = s.nextInt();              //Se pide el DNI

        char letra = Varias.letraDNI(dni);                       //Se llama a la función
        System.out.println ("La letra de tu DNI es: " +letra);  //Se muestra la letra

    s.close();
    }
}
