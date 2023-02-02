import java.util.Scanner;

/**
* 
* @author Fco Javier Gallego Fernández
*/

public class array03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] num = new int[10];
    
    num[0] = (int)Math.pow(2,0);
    num[1] = (int)Math.pow(2,1);
    num[2] = (int)Math.pow(2,2);
    num[3] = (int)Math.pow(2,3);
    num[4] = (int)Math.pow(2,4);
    num[5] = (int)Math.pow(2,5);
    num[6] = num[2] * 10;
    num[7] = num[2] / 10;
    num[8] = num[0] + num[1] + num[2];
    num[9] = num[8];
    
    System.out.println("El array num contiene los siguientes elementos:");
    
    for (int i = 0; i < 10; i++) {
      System.out.println(num[i]);
    }
    
    System.out.println ("El array num tiene 10 elementos. ¿Cual de ellos quiere ver?");
    System.out.print ("Introduzca un numero del 0 al 9: ");
    int indice = s.nextInt();
    System.out.print ("El elemento que se encuentra en la posicion " + indice);
    System.out.println (" es el " + num[indice]);
    
    System.out.println ("La suma de los elementos pares es: " + (num[2]+num[4]+num[6]+num[8]));
 }
}
