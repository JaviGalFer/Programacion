import java.util.Scanner;

/**
* En este programa se utiliza el bucle while donde se introduce un número entero y se muestra por pantalla
* el número al reves
* @author Fco Javier Gallego Fernández
*/

public class NumAlreves {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println ("Por favor, introduce un numero entero: ");
    int numIntro = s.nextInt();
    //Se pide número y declaran variables
    int numero = numIntro;
    int volteado = 0;
    //Mediante el siguiente while damos la vuelta al número y lo guardamos en la variable volteado
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /=10;
    }
    //Se muestra resultado
    System.out.println ("Si le damos la vuelta al numero " +numIntro);
    System.out.println ("obtenemos el numero " +volteado+ ".");
    
 }
}
