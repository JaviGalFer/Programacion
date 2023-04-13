import java.util.Scanner;


/**Este programa te pregunta un número entero y te muestra por pantalla si es capicua o no
 *@author Fco Javier Gallego Fernández
 */
 

public class Capicua {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    
    int n;
    boolean capicua = false;
    
    System.out.println ("Este programa le dice si el numero introducido es capicua o no.");
    System.out.print ("Por favor, introduzca un numero entero con 5 cifras como maximo: ");
    n = s.nextInt();
    
    // Se comprueba si es de una cifra
    if (n < 10) {
      capicua = true;
    }
    // Se comprueba si es de dos cifras
    if ((n >=10) && (n < 100)) {
      // Mediante esta comprobación miramos si el primer y último número son iguales
      if ((n / 10) == (n % 10)) {
        capicua = true;
      }
    }
    // Se comprueba si es de tres cifras
    if ((n >= 100) && (n < 1000)) {
      if ((n / 100) == ( n % 10)) {
        capicua = true;
      }
    }
    // Se comprueba si es de cuatro cifras
    if ((n >= 1000) && (n < 10000)) {
      //Se comprueba el primer número y último y luego los demás dígitos
      if (((n / 1000) == (n % 10)) && (((n / 100) % 10) == (( n / 10) % 10))) {
        capicua = true;
      }
    }
    
    if ( n >= 10000) {
      if (((n / 10000) == (n % 10) ) && ((((n / 1000) % 10)) == ((n / 10) % 10))) {
        capicua = true;
      }
    }
    
    if (capicua) {
      System.out.println ("El numero introducido es capicua.");
    } else {
      System.out.println ("El numero introducido no es capicua.");
    }
    
  }
}
