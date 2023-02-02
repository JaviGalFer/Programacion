import java.util.Scanner;

/**
* Genera 20 números aleatorios entre el 0 y el 100 y separa los pares
* de los impares, dejando los pares en las primeras posiciones
* @author Fco Javier Gallego Fernández
*/

public class arrayParImparOrdena {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int t = 20; //VARIABLE PARA ARRAY
    int[] numero = new int[t]; //Array predeterminada
    int[] par = new int[20];
    int[] impar= new int[20];
    int i;
    int pares = 0;
    int impares = 0;
    
    for (i = 0; i < t; i++) {
      numero[i] = (int)(Math.random()*101);
      /** Con el siguiente if se separa en un array los pares
       * y en otro los impares
      */
      if (numero[i] % 2 == 0) {
        par[pares++] = numero[i];
      } else {
        impar[impares++] = numero[i];
      }
    }
    //Se muestra el array original
    System.out.println ("Array original:");
    for (i = 0; i < t; i++) {
      System.out.print (numero[i] + " ");
    }
    System.out.println();
    //Se mete los pares en la primera posición del array
    for (i = 0; i < pares; i++) {
      numero[i] = par[i];
    }
    //Mete los impares en los huecos que quedan
    for (i = pares; i < t; i++) {
      numero[i] = impar[i - pares];
    }
    //Muestra el resultado del array
    System.out.println("Array con los pares al principio: ");
    for (i = 0; i < t; i++) {
      System.out.print(numero[i] + " ");
    }
 }
}
