import java.util.Scanner;

/**
* Este programa genera notas aleatorias y luego muestra la cantidad de cada una
* @author Fco Javier Gallego Fernández
*/

public class NotasAleatorias {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Se inicializan las variables
    int nota;
    int suspensos = 0;
    int suficientes = 0;
    int bienes = 0;
    int notables = 0;
    int sobresalientes = 0;
    int i;
    
    //Mediante el bucle for se obtiene un número aleatorio y con el switch se hace la muestra del significado de cada número con su nota
    //Además de la suma a la variable
    for (i = 0; i < 20; i++) {
      nota = (int)(Math.random() * 5);
      
      switch(nota) {
        case 0:
          System.out.print ("suspenso ");
          suspensos++;
          break;
        case 1:
          System.out.print ("suficiente ");
          suficientes++;
          break;
        case 2:
          System.out.print ("bien ");
          bienes++;
          break;
        case 3:
          System.out.print ("notable ");
          notables++;
          break;
        case 4:
          System.out.print ("sobresaliente ");
          sobresalientes++;
          break;
        default:
      }
    }
    
    System.out.println("\n");
    //Se muestra por pantalla el total de cada nota
    System.out.println ("Número de suspensos: " +suspensos);
    System.out.println ("Número de suficientes: " +suficientes);
    System.out.println ("Número de bienes: " +bienes);
    System.out.println ("Número de notables: " +notables);
    System.out.println ("Número de sobresalientes: " +sobresalientes);
 }
}
