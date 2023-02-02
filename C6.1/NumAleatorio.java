import java.util.Scanner;

/**
* Este programa muestra diez números aleatorios entre 0 y 1
* @author Fco Javier Gallego Fernández
*/

public class NumAleatorio {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println ("Diez numeros aleatorios: \n");
    
    for (int i = 1; i < 11; i++) {
      System.out.println (Math.random());
    }
    
    
 }
}
