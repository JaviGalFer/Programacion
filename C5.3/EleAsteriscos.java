import java.util.Scanner;

/**
* En este programa se utiliza el bucle for para mostrar una L hecha con asteriscos donde
* por pantalla decimos la altura
* @author Fco Javier Gallego Fernández
*/

public class EleAsteriscos {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Se pide la altura
    System.out.print ("Por favor, introduce la altura de la L: ");
    int altura = s.nextInt();
    
    //Mediante el siguiente for se "pinta" los asteriscos haciendo la altura
    for (int i = 1; i < altura; i++) {
      System.out.println("*");
    }
    
    //La base de la L será la mitad de la altura + 1
    for (int i = 0; i < altura / 2 + 1; i++) {
      System.out.print ("* ");
    }
    
    
 }
}
