import java.util.Scanner;

/**Recibe Mb y muestra por pantalla su conversión a Kb
 *@author Fco Javier Gallego Fernández
 */
 
 public class MbtoKb { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print ("Por favor, introduzca el numero de Mb: ");
    double mb = s.nextDouble();
    System.out.println (mb + "Mb son " + (mb * 1024) + "Kb");
    
  }
}
