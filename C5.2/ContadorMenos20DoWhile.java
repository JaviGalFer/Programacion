import java.util.Scanner;

/**
* En este bucle do-while muestra los numeros del 320 al 160 haciendo una cuenta de 20 en 20 hacia atrás
* @author Fco Javier Gallego Fernández
*/

public class ContadorMenos20DoWhile {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Iniciamos el contador en 320
    int i = 320;
    
    //Comparamos que sea igual o mayor a 160
    do {
      //Mostramos por pantalla la variable y después le restamos 20
      System.out.println(i);
      i -= 20;
      //Mediante el while comparamos que sea igual o mayor a 160 y que se cumpla la condición para seguir el bucle o no
   } while (i >= 160);
  }
}
