import java.util.Scanner;

/**
* Programa de array bidimensional que muestra una tabla con sus filas y columnas
* de manera aleatoria
* Haciendo la suma de las filas y columnas, mostrando después el total
* @author Fco Javier Gallego Fernández
*/

public class BidimensionCalculo2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[][] numero = new int[4][5];
    int sumaTotal = 0;
    int fila;
    int columna;
    //Genera los datos por pantalla
    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++) {
        numero[fila][columna] = (int)(Math.random()*900) + 100;
        System.out.println ("Fila " + fila + ", Columna " + columna + ": " + numero[fila][columna]);
        
      }
    }
    
    System.out.println();
    
    //Muestra los datos y la sumas de cada fila
    int sumaFila;
    for (fila = 0; fila < 4; fila++) {
      sumaFila = 0;
      for (columna = 0; columna < 5; columna++) {
        System.out.printf ("%7d   ", numero[fila][columna]);
        sumaFila += numero[fila][columna]; 
      }
      //Escribe la suma total de esa fila
      System.out.printf ("|%7d\n", sumaFila);
      
    }
    
    // Hace la linea de separación
    for (columna = 0; columna < 5; columna++) {
      System.out.print ("----------");
    }
    System.out.println ("----------");
    //Se declaran variables de cada columna y el total de fila/columna
    int sumaColumna =0;
    
    
    //Se hace la suma y lo muestra por pantalla
    for (columna = 0; columna < 5; columna++) {
      sumaColumna = 0;
      for (fila = 0; fila < 4; fila++) {
        sumaColumna += numero[fila][columna];
      }
      
      sumaTotal += sumaColumna;
      System.out.printf ("%7d   ", sumaColumna);
    }
    System.out.printf ("|%7d    ", sumaTotal);
    
 }
}
