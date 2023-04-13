import java.util.Scanner;

/**Recibe Mb y muestra por pantalla su conversión a Kb
 *@author Fco Javier Gallego Fernández
 */
 
 public class KbtoMb { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print ("Por favor, introduzca el numero de Kb: ");
    double kb = s.nextDouble();
    System.out.println (kb + "Kb son " + (kb / 1024) + "Mb");
    
  }
}
