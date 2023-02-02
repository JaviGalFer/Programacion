import java.util.Scanner;

/**
* Programa de array bidimensional que muestra una tabla con sus filas y columnas
* que empieza en 1 en la fila 0 columna 0 y empieza a sumar de 1 en 1 cada casilla
* @author Fco Javier Gallego Fernández
*/

public class BidimensionSumatorio2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int filas = 6;
    int columnas = 4;
    
    int[][] num = new int[filas][columnas];
    
    int aux = 1;
    int f;
    int c;
    
    
    for (c = 0; c < columnas; c++) {
      for (f = 0; f < filas; f++) {
        num[f][c] = aux;
        aux++;
      }
    }
    
    for (f = 0; f < filas; f++) {
      for (c = 0; c < columnas ; c++) {
        System.out.printf ("%7d   ", num[f][c]);
      }
      System.out.println();
    }
 }
}
