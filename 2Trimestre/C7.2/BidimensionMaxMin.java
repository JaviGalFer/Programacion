import java.util.Scanner;

/**
* Programa de array bidimensional que muestra una tabla con sus filas y columnas
* Diciendo cual es el número máximo y mínimo
* @author Fco Javier Gallego Fernández
*/

public class BidimensionMaxMin {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int filas = 6;
    int columnas = 10;
    
    int maximo = Integer.MIN_VALUE;
    int filaMax = 0;
    int columnaMax = 0;
    
    int minimo = Integer.MAX_VALUE;
    int filaMin = 0;
    int columnaMin = 0;
    
    int[][] num = new int[filas][columnas];
    int f;
    int c;
    
    //Parte de la estructura
    System.out.print ("\n      ");
    for (c = 0; c < columnas; c++){
      System.out.print("    " + c+ "  ");
    }
    System.out.println();
    
    System.out.print ("     ");
    for (c = 0; c < columnas; c++) {
      System.out.print("-------");
    }
    
    System.out.println();
    
    // Se genera el array y mediante los if se seleciona el número máximo y minimo en la variable
    for (f = 0; f < filas; f++){
      for (c = 0; c < columnas; c++) {
        num[f][c] = (int)(Math.random()*1001);
        
        if (num[f][c] < minimo) {
          minimo =  num[f][c];
          filaMin = f;
          columnaMin = c;
        }
        
        if (num[f][c] > maximo) {
          maximo = num[f][c];
          filaMax = f;
          columnaMax = c;
        }
      }
    }
     //Se muestra el array   
    for (f = 0; f < filas; f++) {
      System.out.print("  " + f + " │");
      for (c = 0; c < columnas ; c++) {
        if (num[f][c] == maximo) {
          System.out.printf ("\033[31m%5d\033[37m |", num[f][c]);
        }
        if (num[f][c] == minimo) {
          System.out.printf ("\033[36m%5d\033[37m |", num[f][c]);
        } 
        if (num[f][c] != (minimo) && num[f][c] != (maximo)) {
          System.out.printf ("\033[37m%5d |", num[f][c]);
        }
      }
      System.out.println();
    }
      
    System.out.print ("     ");
    for (c = 0; c < columnas; c++) {
      System.out.print("-------");
    }
    System.out.println();
    
    //Dice la posición/columna y el número máximo y mínimo
    System.out.println("El número máximo es " + maximo + " y está en la fila " + filaMax + ", columna " + columnaMax);
    System.out.println("El número mínimo es " + minimo + " y está en la fila " + filaMin + ", columna " + columnaMin);
    
 }
}
