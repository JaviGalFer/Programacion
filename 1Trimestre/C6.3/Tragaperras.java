import java.util.Scanner;

/**
* Este programa genera ludopatia
* @author Fco Javier Gallego Fernández
*/

public class Tragaperras {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Se inicializa variables
    int figuras;
    int figura1 = 0;
    int figura2 = 0;
    int figura3 = 0;
    int i;
    
    //Mediante este bucle for se genera la figura
    for (i = 0; i < 3; i++) {
      figuras = (int)(Math.random() * 5);
      
      switch(figuras) {
        case 0:
          System.out.print("corazón ");
          break;
        case 1:
          System.out.print("diamante ");
          break;
        case 2:
          System.out.print("herradura ");
          break;
        case 3:
          System.out.print("campana ");
          break;
        case 4:
          System.out.print("limón ");
          break;
        default:
      }
      //Se añade la figura a cada variable
      switch(i) {
        case 0:
          figura1 = figuras;
          break;
        case 1:
          figura2 = figuras;
        break;
        case 2:
          figura3 = figuras;
        break;
        default:
      }
    }
    System.out.println("\n");
    //Se muestra el resultado
    if ((figura1 != figura2) && (figura2 != figura3) && (figura1 != figura3)) {
      System.out.println("Vaya que raro, has perdido.");
    } else if ((figura1 == figura2) && (figura2 == figura3)) {
      System.out.println("Toma anda, has ganado 10 monedas.");
    } else {
      System.out.println("Vaia hombre, has recuperado tu moneda.");
    }
          
  }
}
