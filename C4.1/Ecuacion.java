import java.util.Scanner;

/**Recibe dos números y realiza una ecuación de primer grado
 *@author Fco Javier Gallego Fernández
 */
 
 public class Ecuacion {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
  
  System.out.println ("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
  System.out.print ("Por favor, introduzca el valor de a: ");
  Double a = s.nextDouble();
  System.out.print ("Ahora introduzca el valor b: ");
  Double b = s.nextDouble(); 
	
	if (a == 0) {
    System.out.println ("Esa ecuación no tiene solucion real.");
	} else {
	  System.out.println ("x = " + (-b/a));
	}
  
  }
}
