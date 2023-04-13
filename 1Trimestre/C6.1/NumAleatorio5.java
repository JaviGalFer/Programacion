import java.util.Scanner;

/**
* Este programa muestra diez números aleatorios entre 50 y 60 sin decimales
* @author Fco Javier Gallego Fernández
*/

public class NumAleatorio5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("20 números aleatorios entre 0 y 9 (sin decimales):");
    for (int i = 1; i <= 20; i++) {
      System.out.print((int)(Math.random()*11) +50 + " ");
    }
    
    System.out.println();
 }
}
