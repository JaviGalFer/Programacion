import java.util.Scanner;

/**
* Este programa genera el serpenteo de una serpiente introduciento por pantalla la longitud de ella
* @author Fco Javier Gallego Fernández
*/

public class Serpiente {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Se inicializa variables
    int longitud;
    int i;
    int j;
    int aux = 13;
    //Se pregunta la longitud
    System.out.print("Introduce la longitud de la serpiente: ");
    longitud = s.nextInt();
    
    System.out.println();
    //Se dibuja la cabeza
    System.out.println ("            @");
    //Se pinta el cuerpo de manera aleatoria desde la posición en la que esta entre -1 y 1.
    for (i = 0; i < longitud; i++){
      aux += (int)(Math.random() * 3 - 1);
      for (j = 1; j < aux; j++){
        System.out.print(" ");
      }
      System.out.println("*");
    }
 }
}
