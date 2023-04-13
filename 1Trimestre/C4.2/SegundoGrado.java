import java.util.Scanner;

/**Recibe por pantalla valores y realiza una ecuación de tercer grado
 *@author Fco Javier Gallego Fernández
 */
 
 public class SegundoGrado {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
    
    double x1;
    double x2;
    
    System.out.println ("Por favor, introduzca los valores.");
    
    //Se introduce el valor de a, b y c
    System.out.print ("a = ");
    double a = s.nextDouble();
    
    System.out.print ("b = ");
    double b = s.nextDouble();
    
    System.out.print ("c = ");
    double c = s.nextDouble();
  
    //Se realiza la comparación para saber si todos los datos introducidos son 0 ( 0x^2 + 0x + 0 = 0 )
    
    if ((a == 0) && (b == 0) && (c == 0)) {
      System.out.println ("La ecuacion tiene infinitas soluciones.");
    }
    
    // Se realiza la comparación para saber si la C es distinto de 0 ( 0x^2 + 0x + c = 0 )
    
    if ((a == 0) && (b == 0) && (c != 0)){
      System.out.println ("La ecuacion no tiene solucion");
    }
    
    //Se realiza la comparacion para saber si a y b son distintos de 0 ( ax^2 + bx + 0 = 0 )
    
    if ((a != 0) && (b != 0) && (c == 0)) {
      System.out.println ("x1 = 0");
      System.out.println ("x2 = " + (-b / a));
    }
    
    //Se realiza la comparación para saber si b y c son distintos de 0 ( 0x^2 + bx + c )
    
    if ((a == 0) && (b != 0) && (c != 0)) {
      System.out.println ("x1 = x2 = " + (-c / b));
    }
    
    //Se realiza la comparación para saber si a, b y c son distintos de 0 ( ax^2 + bx + c = 0 )
    
    if ((a != 0) && (b != 0) && (c != 0)) {
      
      double discriminante = b*b - (4 * a * c);
      
      if (discriminante < 0) {
        System.out.println ("La ecuación no tiene soluciones reales");
      } else {
        System.out.println ("x1 = " + (-b + Math.sqrt(discriminante))/(2 * a));
        System.out.println ("x2 = " + (-b - Math.sqrt(discriminante))/(2 * a));
      }
    }
  }
}
