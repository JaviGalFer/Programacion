import java.util.Scanner;

/**
* Practica de repaso de clase
* @author Fco Javier Gallego Fernández
*/
public class Repaso2 {	
	public static void main (String[] args) {
    Scanner s = new Scanner(System.in);	
    
    int fila;
    int columna;
    int f;
    int c;
    
    //Preguntamos el tamaño de la variable fila
    System.out.print ("¿De cuánto quieres que sea la fila? ");
    fila = s.nextInt();
    
    //Preguntamos el tamaño de la variable columna
    System.out.print ("¿De cuánto quieres que sea la columna? ");
    columna = s.nextInt();
    
    //Creamos el array
    int numero[][] = new int[fila][columna];
    
    /* Se genera un array con entre el 100 y 200
    for (c = 0; c < columna; c++) {
      System.out.print("|");
      for (f = 0; f < fila; f++) {
        numero[f][c] = (int)(Math.random()*101) + 100;
        System.out.printf (" %3d |",numero[f][c]);
      }
      System.out.println();
    }
   */
   //Se genera array con números pares
   int numPar = 0;
   for (f = 0; f < fila; f++){
     System.out.print("|");
     for (c = 0; c < columna; c++){
       numero[f][c] = numPar;
       System.out.printf (" %3d |", numero[f][c]);
       numPar += 2;
     }
     System.out.println();
   }
   //Array con múltiplos de 3 en posiciones pares
   int multiplo3[] = new int[fila];
   int m = 0;
   System.out.println("Array con múltiplos de 3");
   
     for (f = 0; f < fila; f++) {
       for (c = 0; c < columna; c++){
         if(numero[f][c] %3 == 0 && m < fila){
           multiplo3[m] = numero[f][c];
           m +=2;
         }
       }
     }
   
   
   for (m = 0; m < fila; m++){
     System.out.printf ("%3d ",multiplo3[m]);
   }
 }
}

