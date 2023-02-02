import java.util.Scanner;

/**
* Practica de repaso de clase
* @author Fco Javier Gallego Fernández
*/

public class Repaso1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //int fila = 100 Para indicar el tamaño de las filas del array
    int fila; //Variable para el número de filas
    int maximo = Integer.MIN_VALUE; //Se declara la variable maximo con el número mínimo posible
    int i; //Variable para los bucles for
    
    //Preguntamos el tamaño de la variable fila
    System.out.println ("¿De cuánto quieres que sea la fila?");
    fila = s.nextInt();
    int numero[] = new int[fila];
    
    for (i = 0; i < fila ; i++) {
      numero[i] = (int)(Math.random()*101);
      //Se compara si el número generado es mayor que la variable y si lo es, se añade a la variable
      if (numero[i] > maximo) {
        maximo = numero[i];
      }
    }
    //Se muestra por pantalla y mediante la variable if se diferencia si es el número máximo
    for (i = 0; i < fila; i++){
      if (numero[i] == maximo){
        System.out.printf (" **%2d**",maximo);
      }else {
        System.out.printf ("%3d",numero[i]);
      }
    }
    //Hacer un array donde se añadiran solamente los números pares del anterior array y empezando desde el final.
    int numeroSegundo[] = new int[fila];
    int j = fila;
    
    for (i = 0; i < fila; i++) {
      if (numero[i] %2 == 0) {
        numeroSegundo[j-1] = numero[i];
        j--;
      }
    }
    //Se muestra el array de los pares
    System.out.println ("\nArray de pares");
    for (i = 0; i < fila; i++){
      System.out.printf ("%3d",numeroSegundo[i]);
    }
 }
}
