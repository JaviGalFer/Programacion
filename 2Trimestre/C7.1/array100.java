import java.util.Scanner;

/**
*Muestra una lista de 100 números, pide por pantalla seleccionar un número de esa lista
* Y luego pide un número a sustituir, mostrando después la misma lista con el número sustituido entre ""
* @author Fco Javier Gallego Fernández
*/

public class array100 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int t = 100; //VARIABLE PARA ARRAY
    int[] numero = new int[t];
    
    for (int i = 0; i < t; i++) {
      numero[i] = (int)(Math.random()*21);
      System.out.print (numero[i] +  "  ");
    }
    
    System.out.println();
    
    System.out.print ("Seleccione un número del a lista: ");
    int valor1 = s.nextInt();
    System.out.print ("Introduce el valor por el cual será sustituido: ");
    int valor2 = s.nextInt();
    
    System.out.println();
    
    for (int i = 0; i <= t; i++) {
      if (numero[i] == valor1) {
        numero[i] = valor2;
        System.out.print (" \"" + numero[i] + "\"  ");
      } else {
        System.out.print ( numero[i] + "  ");
      }
    }
 }
}
