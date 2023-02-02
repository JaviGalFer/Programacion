import java.util.Scanner;

/**
* Este programa genera el resultado de dos dados y no para hasta que el resultado de ambos
* sea igual
* @author Fco Javier Gallego Fernández
*/

public class Dados {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Se inicializa variables
    int dado1;
    int dado2;
    int tirada = 1;
    //Mediante el do-while hacemos que se generen los dados de manera aleatoria
    //Hasta que las variables no valgan igual.
    do {
      dado1 = (int)(Math.random() * 6 + 1);
      dado2 = (int)(Math.random() * 6 + 1);
      System.out.println("----Tirada " +tirada+ "-------");
      System.out.println("Dado1: " + dado1 + "\nDado2: " + dado2);
      tirada++;
    }while (dado1 != dado2);
 }
}
