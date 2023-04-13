/**Recibe un número en pesetas y lo convierte a euros
 *@author Fco Javier Gallego Fernández
 */

public class PesetasEuros { 
  public static void main(String[] args) {
    String linea;
    /* Recibe el número de pesetas */
    System.out.print("Por favor, introduce una cantidad de pesetas: ");
    linea = System.console().readLine();
    int pesetas;
    pesetas = Integer.parseInt(linea);
    /* Convierte las ptas en euros y los muestra */
    double euros;
    euros = (double)(pesetas)*0.006;
    System.out.printf("%d ptas. son %.2f euros. \n", pesetas,euros);
  }
}
