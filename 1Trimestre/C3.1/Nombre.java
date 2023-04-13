/**Recibe un nombre y lo muestra por pantalla
 *@author Fco Javier Gallego Fernández
 */
 
 public class Nombre { 
  public static void main(String[] args) {
    String nombre;
    System.out.print ("Por favor, dime como te llamas: ");
    nombre = System.console().readLine();
    System.out.println ("Hola " + nombre + ", encantado de conocerte");
    
  }
}
