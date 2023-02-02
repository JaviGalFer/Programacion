import java.util.Scanner;

/**
* 
* @author Fco Javier Gallego Fernández
*/

public class arrayCincueriza {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int t = 15; //VARIABLE PARA ARRAY
    int[] numero = new int[t]; //Array predeterminada
    int i;
    
    for (i = 0; i < t; i++) {
      numero[i] = (int)(Math.random()*501);
    }
    
    //Se muestra el array original
    System.out.println ("Array original:");
    
     System.out.print ("|--------|");
    for (i = 0; i < t; i++) {
      System.out.print("-----|");
    }
    System.out.println();
    
    System.out.print ("| Indice |");
    for (i = 0; i < t; i++){
      System.out.printf (" %3d |", i);
    }
    System.out.println();
    
    System.out.print ("|--------|");
    for (i = 0; i < t; i++) {
      System.out.print("-----|");
    }
    System.out.println();
    
    System.out.print ("| Valor  |");
    for (i = 0; i < t; i++) {
      System.out.printf (" %3d |", numero[i]);
    }
    System.out.println();
    
    System.out.print ("|--------|");
    for (i = 0; i < t; i++) {
      System.out.print("-----|");
    }
    System.out.println();
    
    /**Hacemos que los números sean múltiplos de 5 mediante el siguiente bucle for
    *  Con ayuda del bucle while, donde dice que mientras no sea múltiplo de 5, aumenta 
    * en 1 el número que este en esa posición
    */
    
    for (i = 0; i < t; i++) {
      while (numero[i] % 5 !=0){
        numero[i]++;
      }
    }
    
    //Se muestra el array con los múltiplos de 5
    System.out.println ("Array cincuerizado con los múltiplosde 5:");
    
     System.out.print ("|--------|");
    for (i = 0; i < t; i++) {
      System.out.print("-----|");
    }
    System.out.println();
    
    System.out.print ("| Indice |");
    for (i = 0; i < t; i++){
      System.out.printf (" %3d |", i);
    }
    System.out.println();
    
    System.out.print ("|--------|");
    for (i = 0; i < t; i++) {
      System.out.print("-----|");
    }
    System.out.println();
    
    System.out.print ("| Valor  |");
    for (i = 0; i < t; i++) {
      System.out.printf (" %3d |", numero[i]);
    }
    System.out.println();
    
    System.out.print ("|--------|");
    for (i = 0; i < t; i++) {
      System.out.print("-----|");
    }
    System.out.println();
    
 }
}
