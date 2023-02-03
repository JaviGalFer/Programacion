import java.util.Scanner;
import misFunciones.Varias;
/**
* Pregunta por pantalla un número y dice si es negativo, positivo o si es 0
* @author Fco Javier Gallego Fernández
*/
public class Ejercicio4 {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);  
        int num;        //Se declara variables

        System.out.print ("Introduce un número y dire si es negativo, positivo o 0: ");
        num = s.nextInt();      //Pregunta por pantalla el número

        int r = Varias.dimeSigno(num);      //Se llama a la variable dimeSigno guardando el resultado en la variable

        if (r == 0) {
            System.out.println (r);
        }
        if (r < 0){                                            //Según el resultado de la función se muestra un resultado
            System.out.println ("El número es negativo");
        }
        if (r > 0) {
            System.out.println ("El número es positivo");
        }
    s.close();
    }
}
