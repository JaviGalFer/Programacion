import java.util.Scanner;

/**Recibe la altura y el radio de la base de un cono y muestra por pantalla el volumen del cono
 *@author Fco Javier Gallego Fernández
 */
 
 public class VolumenCono { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    final double PI = 3.141592654;
    System.out.println ("Volumen de un cono");
    System.out.println ("------------------");
    System.out.print ("Por favor, introduzca la altura (cm): ");
    double h = s.nextDouble();
    System.out.print ("Introduzca el radio de la base (cm): ");
    double r = s.nextDouble();
    double v = (1.0/3.0) * PI * r * r * h;
    System.out.println ("El volumen del cono es de " + v + " cm3");
    
    
  }
}
