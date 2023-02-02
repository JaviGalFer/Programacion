import java.util.Scanner;

/**
* En este bucle for muestra el cuadrado y el cubo de los 5 primeros números a partir de un número introducido
* @author Fco Javier Gallego Fernández
*/

public class Cubo {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Se pide introducir el número
    System.out.print ("Introduzca un numero: ");
    int num = s.nextInt();
    
    /*Iniciamos la variable i diciendole que vale lo mismo que la variable num
    *Le decimos que haga el bucle hasta que la variable i sea igual a la variable num + 5 para que así lo haga 5 veces
    * mientras se le suma 1 cada vez a la variable i
    */
    
    System.out.println ("   n   |   n2   |   n3   |");
    System.out.println ("__________________________");
    for (int i = num; i < num + 5; i++) {
      System.out.printf ("%5d |%8d |%9d\n", i, i * i, i * i * i);
    
   }
  }
}
