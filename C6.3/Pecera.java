import java.util.Scanner;

/**
* Este programa genera una pecera pidiendo ancho y alto por pantalla
* Luego muestra el pez en una posición aleatoria
* @author Fco Javier Gallego Fernández
*/

public class Pecera {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Se inicializa variables
    int alto;
    int ancho;
    int posicion = 0;
    int posicionPez;
    int i;
    int j;
    
    //Se pregunta por pasntalla el ancho y altura de la pecera
    System.out.print ("Introduce la altura de la pecera (Cómo mínimo debe ser 4): ");
    alto = s.nextInt();
    System.out.print ("Introduce el ancho de la pecera (Cómo mínimo debe ser 4): ");
    ancho = s.nextInt();
    //Se crea la posición aleatoria del pez, restandole para que cuadre la posición con la anchura
    posicionPez = (int)(Math.random() * (alto - 2) * (ancho - 2));
    //Se pinta la estructura
    for (i = 0; i < ancho; i++){
      System.out.print ("*");
    }
    System.out.println();
    //Parte central de la pecera
    for (i = 2; i < alto; i++) {
      System.out.print ("*");
      for (j = 2; j < ancho; j++) {
        if (posicion == posicionPez) {
          //Si es la posición del pez, se pinta por pantalla
          System.out.print("&");
        }else {
          System.out.print(" ");
        }
        posicion++;
      }
      System.out.println("*");
    }
    //Se termina la pecera
    for (i = 0; i < ancho; i++){
      System.out.print ("*");
    }
 }
}
