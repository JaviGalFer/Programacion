import java.util.Scanner;

/**
* En este bucle while muestra por pantalla los múltiplos de 5 del 0 al 100
* @author Fco Javier Gallego Fernández
*/

public class Multiplos5While {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Iniciamos variable
    int i = 0;
    //Comparamos  que sea igual o menor que 100
    while (i <= 100) {
      //Se muestra por pantalla y le suma 5 a la variable
      System.out.println(i);
      i += 5;
   }
  }
}
