import java.util.Scanner;

/**
* Pide la temperatura media de cada més y hace un diagrama de barras
* @author Fco Javier Gallego Fernández
*/

public class arrayTemp {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int t = 12; //VARIABLE PARA ARRAY
    int[] numero = new int[t]; //Array predeterminada
    String[] mes =  { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
      "Octubre", "Noviembre", "Diciembre"};
    int i;
    int u;
    
    System.out.println ("Introduce la temperatura media de cada mes");
    for (i = 0; i < t; i++) {
      System.out.print ("Introduce la temperatura media de " + mes[i] + ": ");
      numero[i] = s.nextInt();
    }
    
    System.out.println();
    
    for (i = 0; i < t; i++) {
      System.out.printf ("%12s |", mes[i]);
      for (u = 0; u < numero[i]; u++) {
        System.out.print ("-");
      }
      System.out.println ("> " + numero[i]);
      
    }
    
 }
}
