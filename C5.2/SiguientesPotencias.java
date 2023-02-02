import java.util.Scanner;

/**
* En este bucle pide por pantalla la base y exponente y saca todas las potencias con base 
* del numero introducido y exponente entre el uno y el número introducido
* @author Fco Javier Gallego Fernández
*/

public class SiguientesPotencias {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la base: ");
    int base = s.nextInt();
    
    System.out.print("Introduce el exponente maximo: ");
    int exponenteFinal = s.nextInt();

    int potencia = 1;
    int exponente = 1;
    int i = 1;
        
    while (i <= exponenteFinal) {
      
      i++;
      potencia = 1;
      exponente = i;
    }
      for (int j = 0; j < exponente; j++) {
        potencia *= base;
      }
   
    
    System.out.println (base + "^" + i + " = " + potencia);
  }
}
