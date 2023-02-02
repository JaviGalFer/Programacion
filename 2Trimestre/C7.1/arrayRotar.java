import java.util.Scanner;

/**
* Array que lee 15 números, muestra el array en el orden original
* y luego cambia la posición a la derecha, pasando el último
* a la primera posición
* @author Fco Javier Gallego Fernández
*/

public class arrayRotar {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] numero = new int[15];
    int i;
    
    System.out.println("Introduzca números enteros y pulsa INTRO");
    
    for (i = 0; i < 15; i++) {
      numero[i] = s.nextInt();
    }
    
    System.out.println();
    //Se muestra el array original
    System.out.println("Array original:");
    for (i = 0; i < 15; i++) {
      System.out.printf("|%3d ", i);
    }
    
    System.out.println("|");
    for (i = 0; i < 75; i++) {
      System.out.print("-");
    }
    
    System.out.println("-");
    for (i = 0; i < 15; i++){
      System.out.printf("|%3d ", numero[i]);
    }
    System.out.println("|");  
    
    //Se rota una posición a la derecha el array, utilizando un aux para ello
    int aux = numero[14];
    for (i = 14; i > 0; i--) {
      numero[i] = numero[i-1];
    }
    numero[0] = aux;
    
    //Se muestra el array rotando una posición a la derecha
    System.out.println("Array rotado a la derecha una posición:");
    for (i = 0; i < 15; i++) {
      System.out.printf("|%3d ", i);
    }
    System.out.println("|");
    for (i = 0; i < 75; i++) {
      System.out.print("-");
    }
    System.out.println("-");
    for (i = 0; i < 15; i++) {
      System.out.printf("|%3d ", numero[i]);
    }
    System.out.println("|");
    
 }
}
