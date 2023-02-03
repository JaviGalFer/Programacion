import java.util.Scanner;
import misFunciones.Varias;
/**
* Pide dos números e indica qué número es menor
* @author Fco Javier Gallego Fernández
*/
public class Ejercicio3 {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int a;
        int b;      //Se declaran variables 

        System.out.print ("Introduce el primer número: ");
        a = s.nextInt();
                                                                    ///Se pregunta por pantalla ambos números
        System.out.print ("Introdsuce el segundo número: ");
        b = s.nextInt();

        int minimo = Varias.numMin(a, b);   //Se llama a la función numMin y se guarda el resultado 
        System.out.println(minimo);         //Se muestra cual es el número menor
    s.close(); 
    }
}
