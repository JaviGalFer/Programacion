import java.util.Scanner;

/**
* En este bucle pide por pantalla la base y exponente y calcula la potencia
* @author Fco Javier Gallego Fernández
*/

public class Potencia {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int potencia = 1;
    
    System.out.println ("Introduce la base: ");
    int base = s.nextInt();
    
    System.out.print ("Introduce el exponente: ");
    int exponente = s.nextInt();
    
    if (exponente == 0) {
      potencia = 1;
    }
    
    if (exponente > 0) {
      for (int i = 0; i < exponente; i++) {
        potencia *= base;
      }
    }
    
    if (exponente < 0) {
      for (int i = 0; i < -exponente; i++) {
        potencia *= base;
      }
      
      potencia = 1/potencia;
    }
   
   System.out.println (base + "^" + exponente + "=" + potencia);
  }
}
