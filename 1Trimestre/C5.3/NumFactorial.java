import java.util.Scanner;

/**
* En este programa se muestra los numeros hasta el numero introducido
* junto a su factorial
* @author Fco Javier Gallego Fernández
*/

public class NumFactorial {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Se pide la altura
    System.out.print ("Por favor, introduce un numero entero positivo: ");
    int num = s.nextInt();
    
    for (int n = 1; n <= num; n++) {
      int factorial = n;
      
      for (int i = 1; i < n; i++){
        factorial *= i;
      }
      
      System.out.println (n + "! = " +factorial);
    }
    
 }
}
