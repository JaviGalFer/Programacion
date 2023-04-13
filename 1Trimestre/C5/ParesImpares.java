import java.util.Scanner;

/**
* En este bucle for hace la suma de los números pares e impares comprendidos entre 100 y 200
*
* @author Fco Javier Gallego Fernández
*/

public class ParesImpares {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Se inicializa la variable suma donde se va a almacenar la cantidad sumada
    int sumaPar;
    sumaPar = 0;
    
    int sumaImpar;
    sumaImpar = 0;
    
    
    //Mediante el sigiuente bucle for hacemos la suma de los números pares
    System.out.println ("La suma de los pares comprendidos entre 100 y 200:");
    for (int cont = 100; cont <= 200; cont++) {
      if (cont %2 == 0) {
      sumaPar = sumaPar + cont;
      System.out.println(sumaPar);
      }
    }
    //Mediante el siguiente bucle for hacemos la suma de los números impares 
    System.out.println ("La suma de los impares comprendidos entre 100 y 200:");
    for (int cont = 100; cont <= 200; cont++) {
      if (cont %2 != 0) {
      sumaImpar = sumaImpar + cont;
      System.out.println (sumaImpar);
    }
   }
  }
}
