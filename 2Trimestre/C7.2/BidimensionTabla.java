import java.util.Scanner;

/**
* Programa de array bidimensional que muestra una tabla con sus filas y columnas
* @author Fco Javier Gallego Fernández
*/

public class BidimensionTabla {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[][] num = new int[3][6];
    
    num[0][0] = 0;
    num[0][1] = 30;
    num[0][5] = 5;
    num[1][0] = 75;
    num[1][4] = 0;
    num[2][2] = -2;
    num[2][3] = 9;
    num[2][5] = 11;
    
    int fila;
    int columna;
    
    System.out.print ("       ");
    for (columna = 0; columna < 6; columna++) {
      System.out.print("   columna " + columna);
    }
    for (fila = 0; fila < 3; fila++) {
      System.out.print ("\nFila " +fila);
      
      for (columna = 0; columna < 6; columna++) {
        System.out.printf ("%9d   ", num[fila][columna]);
      }
    }
    
 }
}
