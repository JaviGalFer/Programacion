import java.util.Scanner;

/**
* En este programa se utiliza el bucle do-while y el bucle for para hacer la suma
* de los siguientes 100 números positivos y enteros al número introducido
* @author Fco Javier Gallego Fernández
*/

public class Piramide {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print ("Introduce la altura de la piramide: ");
    int altura = s.nextInt();
    System.out.print ("\nIntroduce el relleno de la piramide: ");
    String relleno = s.next();
    
    int planta = 1;
    int cantidadRelleno = 1;
    int totalBlanco = altura - 1;
    
    while (planta <= altura) {
      for (int b=1; b<=totalBlanco; b++) {
        System.out.print(" ");
      }
      for (int r=1; r <= cantidadRelleno; r++) {
        System.out.print (relleno);
      }
      planta ++;
      cantidadRelleno += 2;
      totalBlanco--;
      System.out.println();
    }
    
        
  }
}
