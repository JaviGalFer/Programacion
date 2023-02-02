import java.util.Scanner;

/**
* Programa de array bidimensional que muestra una tabla con sus filas y columnas
* Muestra los números de la diagonal inferior izquierda a superior derecha
* Diciendo máximo, mínimo y la media
* @author Fco Javier Gallego Fernández
*/

public class BidimensionDiagonal2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int filas = 9;
    int columnas = 9;
    int[][] num = new int[filas][columnas]; //Array predeterminado
    int c;
    int f;
    int i;
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    int suma = 0;
    int diagonal;
    
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
    //Se genera el array
    for (f = 0; f < filas; f++){
      System.out.print("  " + f + " │");
      for (c = 0; c < columnas; c++) {
        num[f][c] = (int)(Math.random()*401) + 500;
        System.out.printf ("\033[37m%5d |", num[f][c]);
      }
      System.out.println();
    }
    //Parte final de la estructura
   System.out.print ("     ");
    for (c = 0; c < columnas; c++) {
      System.out.print("-------");
    }
    System.out.println(); 
    //Se muestra la diagonal
    System.out.print ("A continuación se muestra los números de manera diagonal desde la esquina");
    System.out.println("\ninferior izquierda a la esquina superior derecha: ");
    
    for (i = 0; i < columnas; i++){
      diagonal = num[8 - i][i];
      System.out.print(diagonal + " ");
      if (diagonal > maximo) {
        maximo = diagonal;
      }
      if (diagonal < minimo){
        minimo = diagonal;
      }
      suma += diagonal;
    }
    System.out.println();
    
    //Dice el máximo, mínimo y la media
    System.out.println ("El número máximo es el " +maximo);
    System.out.println ("El número mínimo es el " +minimo);
    System.out.println ("La media de los números es " + ((double)suma /10));
 }
}
