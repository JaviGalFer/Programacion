import java.util.Scanner;

/**
* Este programa muestra diez números aleatorios entre 0 y 10 con decimales
* @author Fco Javier Gallego Fernández
*/

public class NumAleatorio2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println ("20 numeros aleatorios entre 0 y 10 con decimales: \n");
    
    for (int i = 1; i <= 20; i++) {
      System.out.println (Math.random()*10 + "  ");
    }
    
    
 }
}
