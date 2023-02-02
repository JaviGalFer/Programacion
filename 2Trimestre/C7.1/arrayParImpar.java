import java.util.Scanner;

/**
* Programa que pide 8 números enteros y luego los muestra diciendo si
* es par o impar
* @author Fco Javier Gallego Fernández
*/

public class arrayParImpar {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int t = 8; //VARIABLE PARA ARRAY
    int[] numero = new int[t]; //Array predeterminada
    int i;
    
    System.out.print ("Introduce 8 números enteros: ");
    for (i = 0; i < t; i++) {
      numero[i] = s.nextInt();
    }
    System.out.println ("-------------------------------");
    for (i = 0; i < t; i++) {
      System.out.print (numero[i]);
      if (numero[i] %2 == 0){
        System.out.print(" par.");
      } else {
        System.out.print(" impar.");
      }
      System.out.println();
    }
 }
}
