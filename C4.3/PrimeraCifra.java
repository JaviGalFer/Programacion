import java.util.Scanner;


/**Este programa te pregunta un número entero y te muestra por pantalla la primera cifra del número introducido de un máximo de 5 cifras
 *@author Fco Javier Gallego Fernández
 */
 

public class PrimeraCifra {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    //Se declara la variable cifra donde se almacenara la primera cifra
    int cifra = 0;
    
    System.out.println ("Este programa muestra la primera cifra del numero entero introducido.");
    System.out.println ("Por favor, introduzca un numero entero de 5 cifras como maximo: ");
    int n = s.nextInt();
    
    //Se compara si es menor para comprobar la cantidad de cifras
    if ( n < 10) {
      cifra = n;
    }
    
    if (( n >= 10) && ( n < 100)) {
      cifra = n / 10;
    }
    
    if (( n >= 100) && ( n < 1000)) {
      cifra = n / 100;
    }
    //En base a la cantidad de cifra se divide entre más o menos 0's
    if (( n >= 1000) && ( n < 10000)) {
      cifra = n / 1000;
    }
    
    if ((n >= 10000)) {
      cifra = n / 10000;
    }
    
    //Se muestra por pantalla la variable que almacena la primera cifra
    System.out.println ("La primera cifra del numero introducido es el " + cifra + ".");
    
    
  }
}
