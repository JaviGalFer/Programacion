import java.util.Scanner;

/**
* En este bucle Do-while muestra por pantalla los múltiplos de 5 del 0 al 100
* @author Fco Javier Gallego Fernández
*/

public class Multiplos5DoWhile {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Iniciamos variable
    int i = 0;
    //Hace la muestra y suma de la variable
    do {
      System.out.println(i);
      i += 5;
    //Al terminar lo que esta dentro del bloque del do hace la comparación de la variable y condición para que se siga ejecutando el bucle
   } while (i <= 100);
   
  }
}
