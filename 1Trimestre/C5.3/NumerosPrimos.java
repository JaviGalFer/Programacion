import java.util.Scanner;

/**
* En este bucle for muestra por pantalla si el número introducido es primo o no
* @author Fco Javier Gallego Fernández
*/

public class NumerosPrimos {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Se pide introducir el número
    
    System.out.print ("Introduce un numero y le dire si es primo o no: ");
    int num = s.nextInt();
    //se crea un boolean dandola como true
    boolean primo = true;
    //En el bucle for se comprueba que el resto no de 0
    for (int i = 2; i < num; i++) {
      if ((num % i) == 0) {
        primo = false;
      }
    }
    
    if (primo) {
      System.out.println ("El numero introducido es primo.");
    } else {
      System.out.println ("El numero introducido no es primo.");
    }
        
  }
}
