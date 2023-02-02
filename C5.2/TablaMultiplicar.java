import java.util.Scanner;

/**
* En este bucle for muestra la tabla de multiplicar del número introducido
* @author Fco Javier Gallego Fernández
*/

public class TablaMultiplicar {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print ("Introduzca un número y se mostrara la tabla de multiplicar de ese numero: ");
    int num = s.nextInt();
    
    /*Iniciamos la variable i, la iniciamos a 0 que sera el contador a multiplicar y ponemos que se repita hasta el número 10 
    *incrementando de 1 en 1.
    */
    for (int i = 0; i <= 10; i++) {
      System.out.printf ("%d * %2d = %3d\n", num, i, num * i);
    
   }
  }
}
