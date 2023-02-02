import java.util.Scanner;

/**
* Este programa genera un número aleatorio entre -100 y 200. Luego muestra
* el máximo de los pares y el mínimo de los impares, además de la media de todos
* @author Fco Javier Gallego Fernández
*/

public class Menos100 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Se inicializa variables
    int num;
    int maxPar = Integer.MIN_VALUE;
    int minImpar = Integer.MAX_VALUE;
    int sum = 0;
    int i;
    //Se genera los 50 números aleatorios además de comprobar si son
    //Pares o impares y añadiendo si son el max o el min.
    for (i = 0; i < 50; i++) {
      num = (int)(Math.random() * 300 - 100);
      System.out.print (num + " ");
      
      if (num % 2 == 0) {
        if (num > maxPar) {
          maxPar = num;
        }
      } else if (num < minImpar) {
        minImpar = num;
      }
      sum += num;
    }
    System.out.println();
    //Se muestra por pantalla
    System.out.println ("El máximo de los pares es: " + maxPar);
    System.out.println ("El mínimo de los pares es: " + minImpar);
    System.out.println ("La media de los números generados es: " + sum/50);
    
 }
}
