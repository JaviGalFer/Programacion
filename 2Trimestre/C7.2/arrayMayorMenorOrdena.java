import java.util.Scanner;

/**
* Genera 10 números aleatorios entre 0 y 200 ambos incluidos, almacenandolo en un array
* Se crean dos arrays, uno de números mayores de 100 junto a su variable y otro de 
* menores de 100 junto a su variable. Muestra el array original y luego muestra un array
* donde se muestra un número mayor de 100 y otro menor de 100 consecutivamente
* @author Fco Javier Gallego Fernández
*/

public class arrayMayorMenorOrdena {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int t = 10; //VARIABLE PARA ARRAY
    int[] numero = new int[t]; //Array predeterminada
    int[] mayor = new int[t];
    int[] menor = new int[t];
    int i;
    int mayores = 0;
    int menores = 0;
    
    for (i = 0; i < t; i++) {
      numero[i] = (int)(Math.random()*201);
      /** Con el siguiente if se separa en un array los pares
       * y en otro los impares
      */
      if (numero[i] <= 100) {
        menor[menores++] = numero[i];
      } else {
        mayor[mayores++] = numero[i];
      }
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
    
    /*Se hacen dos bucles for. Uno empezando desde 0
     * y otro desde 1, asi rellenamos pares e impares
     * utilizando las variables para completar cuando se acaben
     * menores o mayores
    */
    for (i = 0; i < t; i+=2) {
      if (mayores > 0){
        numero[i] = mayor[mayores-1];
        mayores--;
      } else {
        numero[i] = menor[menores-1];
        menores--;
      }
    }
    for (i = 1; i < t; i+=2) {
      if (menores > 0) {
        numero[i] = menor[menores-1];
        menores--;
      }else{
        numero[i] = mayor[mayores-1];
        mayores--;
      }
    }
    System.out.println();
    
    //Muestra el resultado del array
    System.out.println("Array resultado: ");
  
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
