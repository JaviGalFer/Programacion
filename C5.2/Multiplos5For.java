import java.util.Scanner;

/**
* En este bucle for muestra por pantalla los múltiplos de 5 del 0 al 100
* @author Fco Javier Gallego Fernández
*/

public class Multiplos5For {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Inicializa variable i en 0, compara que sea igual o menor que 100 y le suma 5 a i
    for (int i = 0; i<=100; i += 5) {
      System.out.println(i);

   }
  }
}
