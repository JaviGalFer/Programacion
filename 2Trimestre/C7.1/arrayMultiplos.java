import java.util.Scanner;

/**
* 
* @author Fco Javier Gallego Fernández
*/

public class arrayMultiplos {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int t = 20; //VARIABLE PARA ARRAY
    int[] numero = new int[t]; //Array predeterminada
    int i;
    int opcion;
    
    for (i = 0; i < t; i++) {
      numero[i] = (int)(Math.random()*401);
      System.out.print(numero[i] + " ");
    }
    
    System.out.print("\n\n¿Qué números quiere destacar?");
    System.out.print(" (1-Múltiplos de 5 o 2-Múltiplos de 7): ");
    opcion = s.nextInt();
    
    int multiplo = (opcion == 1) ? 5 : 7;
    
    for (int elemento : numero) {
      if (elemento % multiplo == 0) {
        System.out.print("["  + elemento + "] " );
      }else{
        System.out.print(elemento + " ");
      }
    }
    
 }
}
