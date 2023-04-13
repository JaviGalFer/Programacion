import java.util.Scanner;

/**
* Este programa muestra 20 números aleatorios entre 0 y 10 ambos incluidos
* @author Fco Javier Gallego Fernández
*/

public class NumAleatorio10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("20 números aleatorios entre 0 y 10 (ambos incluidos):");
    for (int i = 0; i < 20; i++) {
      System.out.print((int)(Math.random()*11) + " ");
    }
    
    System.out.println();
 }
}
