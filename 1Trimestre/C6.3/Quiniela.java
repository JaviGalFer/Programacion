import java.util.Scanner;

/**
* Este programa realiza tres apuestas de quiniela en tres columnas
* para 14 partidos y el pleno al 15
* @author Fco Javier Gallego Fernández
*/

public class Quiniela {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Se inicializan variables
    int resultadoPartido;
    int columnas = 3;
    int goles;
    //Estructura
    for (int fila = 1; fila <= 14; fila++){
      System.out.printf("%2d. |", fila);
      //Se generan las apuestas
      for (int apuesta = 1; apuesta <= columnas; apuesta++) {
        resultadoPartido = (int)(Math.random() * 3) + 1;
        switch(resultadoPartido) {
          case 1:
            System.out.print("1  |");
            break;
          case 2:
            System.out.print("  2|");
            break;
          case 3:
            System.out.print(" X |");
          default:
      }
    }
    System.out.println();
  }                        
  
  System.out.print("\nPleno al 15 - Local:   ");
  goles = (int)(Math.random() * 4);
  if (goles < 3) {
    System.out.print (goles);
  }else {
    System.out.print ("M");
  }
  
  System.out.print("    Visitante:  ");
  goles = (int)(Math.random() * 4);
  if (goles < 3){
    System.out.print (goles);
  }else {
    System.out.print ("M");
  }
  
 }
}
