/**Recibe dos números y muestra por pantalla la suma, resta, multiplicación y división de ambos
 *@author Fco Javier Gallego Fernández
 */
 
 public class calculadora { 
  public static void main(String[] args) {
    double x;
    double y;
    String linea;
    
    System.out.print ("Por favor, introduzca el primer numero: ");
    linea = System.console().readLine();
    x = Double.parseDouble(linea);
    System.out.print ("Introduzca el segundo numero: ");
    linea = System.console().readLine();
    y = Double.parseDouble(linea);
    
    System.out.println ("x = " + x);
    System.out.println ("y = " + y);
    System.out.println ("x + y = " + (x+y));
    System.out.println ("x - y = " + (x-y));
    System.out.println ("y - u = " + (y-x));
    System.out.println ("x * y = " + (x*y));
    System.out.println ("x / y = " + (x/y));
    System.out.println ("y / x = " + (y/x));
    
    
  }
}
