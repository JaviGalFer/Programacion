import java.util.Scanner;

/**
* En este programa se utiliza el bucle for para mostrar una U hecha con asteriscos donde
* por pantalla decimos la altura
* @author Fco Javier Gallego Fernández
*/

public class UAsteriscos {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Se pide la altura
    System.out.print ("Por favor, introduce la altura de la U: ");
    int altura = s.nextInt();
    //Hacemos los palos verticales mediante los siguientes for
    for (int i = 1; i < altura; i++) {
      System.out.print ("* ");
      for (int j = 2; j < altura; j++) {
        System.out.print ("  ");
      }
      System.out.println("*");
    }
    //Se hace la base mediante el siguiente bucle for
    System.out.print ("  ");
    for (int i = 2; i < altura; i++) {
      System.out.print ("* ");
    }
    
 }
}
