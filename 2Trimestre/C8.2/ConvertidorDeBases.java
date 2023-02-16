import java.util.Scanner;
import misFunciones.Varias;
/**
*
* @author Fco Javier Gallego Fernández
*/
public class ConvertidorDeBases {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        String numero;
        int baseOrigen;     //Se declaran variables
        int baseDestino;

        System.out.print ("Indique el número a convertir: ");
        numero = s.nextLine();
        System.out.print ("Indique la base de origen (2, 8, 10 o 16): ");   //Se pregunta por pantalla
        baseOrigen = s.nextInt();
        System.out.print ("Indique la base de destino (2, 8, 10 o 16): ");
        baseDestino = s.nextInt();

        String resultado = Varias.convertirBaseNumerica(numero, baseOrigen, baseDestino);  //Se llama a la función
        System.out.println("El número " +numero+ " en base " +baseOrigen+ " en base " +baseDestino+ " es: " +resultado ); //Se muestra resultado
    s.close();
    }
}
