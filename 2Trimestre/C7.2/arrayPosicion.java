import java.util.Scanner;

/** Genera un array de 12 números aleatorios entre el 0 y el 200, mostrando el array original
* Luego pregunta un número a insertar y una posición, insertandolo y desplazando a la derecha
* los números del array a partir de la posición elegida
* @author Fco Javier Gallego Fernández
*/

public class arrayPosicion {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int t = 12; //VARIABLE PARA ARRAY
    int[] numero = new int[t]; //Array predeterminada
    int i;
    
    for (i = 0; i < t; i++){
      numero[i] = (int)(Math.random()*201);
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
    
    //Pedimos el número que queremos insertar y la posición donde la queremos colocar
    
    System.out.print("\n Introduce un número a insertar: ");
    int inserta = s.nextInt();
    
    System.out.print("Introduce la posición (0 a 11): ");
    int posicion = s.nextInt();
  
    /** Mediante el siguiente bucle for desplazamos a la derecha los números
     * Empezamos desde la posición máxima (11) hasta que lleguemos a la posición
     * de la variable 'posicion' anteriormente introducida.
     * Hasta entonces la variable numero[i] valdrá lo que vale la posición anterior
     * es decir, numero[i - 1]
    */ 
    
    //Se desplaza un número hacia la derecha
    for (i = 11; i > posicion; i--) {
      numero[i] = numero[i - 1];
    }
    
    //Insertamos el número introducido en la posición elegida
    numero[posicion] = inserta;
    
    //Mostramos el array resultante
    System.out.println ("Array resultante:");
    
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
