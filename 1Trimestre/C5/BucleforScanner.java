import java.util.Scanner;

/**
* En este bucle for le introducimos un numero y muestra los números hasta ese número
*
* @author Fco Javier Gallego Fernández
*/

public class BucleforScanner {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print ("Introduzca un numero para el contador: ");
    int n = s.nextInt();
    
    
    for (int cont = 0; cont <= n; cont++) {
      System.out.println(cont);

   }
  }
}
