import java.util.Scanner;

/**
* Programa de array bidimensional que muestra una tabla con sus filas y columnas
* Empezando en 1 en la fila 0 columna 0 y aumentando hacia abajo de uno en uno
* @author Fco Javier Gallego Fernández
*/

public class BidimensionSumatorio {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[][] num = new int[4][6];
    
    int aux = 1;
    int f;
    int c;
    int i;
    int j;
    
    for (c = 0; c < 4; c++) {
      for (f = 0; f < 6; f++) {
        num[c][f] = aux;
        aux++;
      }
    }
    
    for (i = 0; i < 4; i++) {
      for (j = 0; j < 6 ; j++) {
        System.out.printf ("%7d   ", num[i][j]);
      }
      System.out.println();
    }

 }
}
