import java.util.Scanner;


/**Pregunta por pantalla tu nombre y edad para mostrarlo después por pantalla
 *@author Fco Javier Gallego Fernández
 */
 

public class PruebaEjercicio4 {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    System.out.println ("Por favor, introduzca su nombre y su edad, siguiendo este orden: ");
    
    //Pregunta por pantalla el nombre y posteriomente la edad
    String nombre = System.console().readLine();
    int year = s.nextInt();
    
    //Muestra por pantalla las variables anteiormente introducidas por pantalla
    System.out.println ("Mi nombre es: " +nombre + " y tengo " +year + " anios.");
    
    
    
  }
}
