import java.util.Scanner;

/**
* En este bucle for muestra los n siguientes números de la serie Fibonacci
* @author Fco Javier Gallego Fernández
*/

public class Fibonacci{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Se pide introducir el número
    System.out.println ("Este programa muestra los n primeros números de la serie Fibonacci.");
    System.out.print ("Introduzca el numero n: ");
    int n = s.nextInt();
    //Mediante el switch se calcula la cifra de n y la serie Fibonacci
    switch (n) {
      case 1:
        System.out.print ("0");
        break;
      case 2:
        System.out.print ("0 1");
        break;
      default:
        System.out.print ("0 1");
        int d1 = 0;
        int d2 = 1;
        int aux;
        while (n >2) {
          aux = d1;
          d1 = d2;
          d2 = aux + d2;
          System.out.print (" " + d2);
          n--;
        }
    }
    System.out.println();
  }
}
