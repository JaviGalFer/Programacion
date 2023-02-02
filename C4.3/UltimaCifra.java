import java.util.Scanner;


/**Este programa te pregunta un número entero y te muestra por pantalla la última cifra del número introducido
 *@author Fco Javier Gallego Fernández
 */
 

public class UltimaCifra {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    
    System.out.println ("Este programa muestra la ultima cifra del numero entero introducido.");
    System.out.println ("Por favor, introduzca un numero entero: ");
    
    int n = s.nextInt();
    //Mediante el modulo 10 nos muestra la última cifra
    System.out.println ("la ultima cifra del numero introducido es el " + (n % 10));
    
    
    
  }
}
