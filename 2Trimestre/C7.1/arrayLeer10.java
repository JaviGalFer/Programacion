import java.util.Scanner;

/**
* Declara un array que se lee y luego muestra por pantalla en orden inverso
* @author Fco Javier Gallego Fernández
*/

public class arrayLeer10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] num = new int[10];
    
    
    System.out.println("Introduce 10 numeros enteros.");
    System.out.println ("Pulse la tecla INTRO después de cada numero.");
    
    for (int i = 0; i < 10; i++) {
      num[i] = s.nextInt();
    }
    
    System.out.println("\nLos numeros introducidos, al reves son los siguientes: ");
    for (int i = 9; i >= 0; i--) {
      System.out.println (num[i]);
    }
 }
}
