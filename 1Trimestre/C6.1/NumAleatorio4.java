import java.util.Scanner;

/**
* Este programa muestra diez números aleatorios entre 1 y 10 sin decimales
* @author Fco Javier Gallego Fernández
*/

public class NumAleatorio4 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("20 numeros aleatorios entre 1 y 10 (sin decimales):");
    for (int i = 1; i <= 20; i++) {
      System.out.print((int)(Math.random()*10 + 1) + " ");
    }
    
    System.out.println();
 }
}
