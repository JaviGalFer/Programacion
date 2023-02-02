/**Muestra por pantalla la conversión de euros a pesetas
 *@author Fco Javier Gallego Fernández
 */
 

public class PruebaEjercicio1 {
  public static void main(String[] args) {
    //Se declara la variable con double ya que puede contener decimales, diciendole dicha cantidad
    double euros = 64.28;
    
    //Con esta variable indicamos que es entero y realizamos la operación de la conversión con al multiplicación
    int pesetas = (int) (euros * 166.386);
    
    System.out.printf("%.2f euros son %d pesetas.", euros, pesetas);
  }
}
