import java.util.Scanner;

/**
* En este bucle while muestra la cantidad de digitos introducidos
* @author Fco Javier Gallego Fernández
*/

public class NumeroDigitos {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print ("Introduzca un numero: ");
    long num = s.nextInt();
    
    long i = num;
    int digitos = 1;
    
    /*Iniciamos las variables, preguntando el número y mediante el while se cuenta el número de veces que se divide entre 10
    */
    while (i >= 10) {
      digitos = digitos + 1;
      i /= 10;
      
    }
   
   System.out.println (num + " tiene " + digitos + " digito/s.");
   
  }
}
