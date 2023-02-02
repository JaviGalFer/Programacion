import java.util.Scanner;

/**
* Este programa hace la simulación de tres tiradas de dados
* @author Fco Javier Gallego Fernández
*/

public class Dados {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int tirada;
    int suma = 0;
    
    System.out.print ("Tirada de tres dados: ");
    
    for (int i = 0; i < 3; i++) {
      tirada = (int)(Math.random() * 6) + 1;
      System.out.print (tirada + " ");
      suma += tirada;
    }
    
    System.out.println("\nSuma: " + suma);
 }
}
