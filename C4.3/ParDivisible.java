import java.util.Scanner;


/**Pregunta por pantalla un numero entero y te dice si es entero y si es divisible entre 5
 *@author Fco Javier Gallego Fernández
 */
 

public class ParDivisible {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    //Se pregunta el número entero
    System.out.println ("Por favor, introduce un numero entero: ");
    int n = s.nextInt();
    //Se hace el calculo con el modulo 2 y se comprueba si es par al dar 0 o impar
    if ((n % 2) == 0) {
      System.out.print ("El numero introducido es par");
    } else {
      System.out.print ("El numero introducido es impar");
    }
    //Se hace el calculo con el modulo 5 y se comprueba si es divisible al dar 0 o no divisible
    if ((n % 5) == 0) {
      System.out.println (" y es divisible entre 5.");
    } else {
      System.out.println (" y no es divisible entre 5.");
    }
    
  }
}
