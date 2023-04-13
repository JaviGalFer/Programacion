import java.util.Scanner;

/**
* En este bucle for hace la suma y producto de los diez primeros números naturales
*
* @author Fco Javier Gallego Fernández
*/

public class SumaPrimeros {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Se inicializa la variable suma donde se va a almacenar la cantidad sumada
    int suma;
    suma = 0;
    
    int producto;
    producto = 1;
    
    //Mediante el bucle for hacemos que se haga la suma con los 10 primeros
    System.out.println ("La suma de los 10 primeros numeros naturales:");
    for (int cont = 1; cont <= 10; cont++) {
      //A la variable suma le sumamos el cont y luego mostramos por pantalla
      suma = suma + cont;
      System.out.println(suma);
      
    }
    //Mediante el siguiente bucle for hacemos que se haga el producto de los 10 primeros
    System.out.println ("El producto de los 10 primeros numeros naturales:");
    for (int cont = 1; cont <= 10; cont++) {
      producto = producto * cont;
      System.out.println(producto);
   }
  }
}
