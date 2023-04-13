import java.util.Scanner;

/**
* Este programa muestra 50 números aleatorios entre 100 y 199 ambos incluidos
* Muestra el minimo, el máximo y la media de los 50.
* @author Fco Javier Gallego Fernández
*/

public class NumAleatorio199 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int maximo = 100;
    int minimo = 199;
    int suma = 0;
    int n;
    
    System.out.println("50 números aleatorios entre 100 y 199: ");
    for (int i = 0; i < 50; i++) {
      n = (int)(Math.random()*100) + 100;
      System.out.print(n + " ");
      suma += n;
    
    if (n < minimo){
      minimo = n;
    }
    
    if (n > maximo) {
      maximo = n;
    }
  }
    
    System.out.println("\nMinimo: " + minimo + "\nMaximo: " + maximo + "\nMedia: " + suma / 50);
 }
}
