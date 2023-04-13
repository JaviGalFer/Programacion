import java.util.Scanner;

/**
* Este programa genera números pares entre el 0 y el 100 y se para cuando el número generado es 24.
* @author Fco Javier Gallego Fernández
*/

public class NumAleatorioFin24 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Se inicializan las variables
    int numero = 0;
    int sumaNum = 0;
    
    /*Mediante el siguiente while generamos números aleatorios hasta que la variable numero
    * valga 24. Con el "(Math.random() *51) * 2" nos aseguramos que sean aleatorios pares
    * ya que cualquier número multiplicado por 2 es par.
    */
    while (numero != 24){
      numero = (int)(Math.random() * 51) * 2;
      System.out.print(numero + " ");
      sumaNum++;
    }
    System.out.println();
    
    System.out.println("Se ha generado un total de " + sumaNum + " números.");
    
  
 }
}
