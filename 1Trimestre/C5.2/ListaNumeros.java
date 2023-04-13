import java.util.Scanner;

/**
* En este bucle for pide 10 números enteros por pantalla y hace la cuenta de los positivos y negativos
* mostrandolos al terminar por pantalla.
* @author Fco Javier Gallego Fernández
*/

public class ListaNumeros {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Se declaran variables
    int pos = 0;
    int neg = 0;
    
    System.out.println ("Introduzca una serie de 10 numeros: ");
    //Se hace la suma de los 10 números negativos o positivos que sean introducidos
    for (int i = 0; i < 10; i++) {
      if (s.nextInt() < 0 ) {
        neg++;
      } else {
        pos++;
      
    }
   }
   
   System.out.println ("Has introducido " + pos + " numeros positivos y " + neg + " numeros negativos.");
  }
}
