import java.util.Scanner;

/**Recibe las horas trabajadas y calcula el salario semanal
 *@author Fco Javier Gallego Fernández
 */
 
 public class salario { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print ("Por favor, introduzca el numero de horas trabajadas durante la semana: ");
    int horasTrabajadas = s.nextInt();
    System.out.println ("Su salario semanal es de " + (horasTrabajadas * 12) + " euros.");
    
    
    
  }
}
