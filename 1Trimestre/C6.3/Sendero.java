import java.util.Scanner;

/**
* Este programa genera un sendero
* @author Fco Javier Gallego Fernández
*/

public class Sendero {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Se inicializa variables
    int longitud;
    int espacios = 6;
    int i;
    int j;
    //Se introduce la longitud por pantalla
    System.out.print ("Introduce la longitud del sendero: ");
    longitud = s.nextInt();
    
    //Se pinta el sendero
    for (i = 0; i < longitud; i++) {
      //Se pinta los espacios predefinidos
      for (j = 0; j < espacios; j++){
        System.out.print(" ");
      }
      //Se pinta el borde izquierdo
      System.out.print("|");
      //Se declaran variables dentro del bucle para el obstaculo aleatorio
      char obstaculo = '*';
      int posObstaculo = -1;
      //Se hace de manera aleatoria si hay y qué tipo de obstaculo
      if ( (int)(Math.random() * 2) == 0) {
        posObstaculo = (int)(Math.random() * 4);
        if ( (int)(Math.random() * 2) == 0) {
          obstaculo = 'O';
        }
      }
      //Si hay se pinta y si no se pinta un espacio
      for (j = 0; j < 4; j++){
        if (j == posObstaculo) {
          System.out.print (obstaculo);
        }else {
          System.out.print (" ");
        }
      }
      //Se pinta el borde derecho
      System.out.println("|");
      //De manera aleatoria se decide el rumbo del sendero
      espacios += (int)(Math.random() * 3) - 1;
      
    }
    
 }
}
