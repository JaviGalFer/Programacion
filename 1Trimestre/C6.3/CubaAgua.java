import java.util.Scanner;

/**
* Este programa genera una cuba donde se pregunta por pantalla la capacidad total
* y se genera de manera aleatoria el relleno
* @author Fco Javier Gallego Fernández
*/

public class CubaAgua {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Se inicializa variables
    int capacidad;
    int cantidad;
    int i;
    //Se pregunta por pantalla la cantidad de agua
    System.out.print("Indica la capacidad total de la cuba en litros: ");
    capacidad = s.nextInt();
    //Se genera de manera aleatoria la cantidad de litros
    cantidad = (int)(Math.random() * (capacidad + 1));
    //Se genera la cuba
    for (i = 0; i < capacidad; i++) {
      if (i < (capacidad - cantidad)) {
        System.out.println("*    *");
      }else {
        System.out.println("*====*");
      }
    }
    System.out.println("******");
    
    System.out.println();
    //Se muestra la información
    System.out.println ("La cuba tiene una capacidad de " + capacidad + " litros y contiene " + cantidad + " litros de agua.");
   
 }
}
