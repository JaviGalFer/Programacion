import java.util.Scanner;


/**Este programa te pregunta tu fecha de nacimiento para mostrarla posteriormente
 *@author Fco Javier Gallego Fernández
 */
 

public class PruebaEjercicio3 {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    System.out.println ("Por favor, introduzca su anio de nacimiento, mes y dia, siguiendo este orden: ");
    
    //Se declaran las variables y se pregunta por pantalla
    int year = s.nextInt();
    String mes = System.console().readLine();
    int dia = s.nextInt();
    //Muestra por pantalla la fecha de nacimiento anteriomente introducida por pantalla
    System.out.println ("Mi fecha de nacimiento es: " +dia + " de " +mes + " de " +year);
    
    
    
  }
}
