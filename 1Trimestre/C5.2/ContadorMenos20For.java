import java.util.Scanner;

/**
* En este bucle for muestra los numeros del 320 al 160 haciendo una cuenta de 20 en 20 hacia atrás
* @author Fco Javier Gallego Fernández
*/

public class ContadorMenos20For {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Iniciamos contador en 320, comparamos que sea igual o mayor a 160 y después le resta 20
    for (int i = 320; i >= 160; i-=20) {
      System.out.println(i);
    
   }
  }
}
