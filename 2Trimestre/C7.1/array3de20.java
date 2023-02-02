import java.util.Scanner;

/**
* Array de 20 con un número random y hace su cubo y cuadrado, mostrandolo en columnas
* @author Fco Javier Gallego Fernández
*/

public class array3de20 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] num = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    
    int i;
    
    for (i = 0; i < 20; i ++) {
      num[i] = (int)(Math.random()*101);
      cuadrado[i] = num[i] * num[i];
      cubo[i] = cuadrado[i] * num[i];
    }
    
    System.out.println("A continuacion se muestran tres columnas con numeros aleatorios entre 0 y 100");
    System.out.println("Su cuadrado y su cubo\n");
    
    
    System.out.println("  n  |   n2  │    n3\n-----|-------|----------");
    for (i = 0; i < 20; i++) {
      System.out.printf ("%4d | %5d | %8d\n", num[i], cuadrado[i], cubo[i]);
    }
 }
}
