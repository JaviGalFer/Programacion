import java.util.Scanner;

/**
* En este programa convierte sistema decimal al sistema palotes
* @author Fco Javier Gallego Fernández
*/

public class SistemaPalotes {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    long num;
    do {
    System.out.print ("Por favor, introduce un numero entero positivo: ");
    num = s.nextInt();
  } while (num < 1);
  System.out.print( num + " = ");
  
  //Se cuenta los números y los calcula al reves
  long aux = num;
  int numDig = 0;
  long numReves = 0;
  
  while (aux > 0) {
    numReves = ((numReves*10) + (aux % 10));
    aux /= 10;
    numDig++;
  }
  long cifra = 0;
  // Separa cifras y escribe los palitos
  for (int i = 0; i < numDig; i++) {
    cifra = numReves % 10;
    numReves /= 10;
    for (int j = 0; j < cifra; j++) {
      System.out.print ("|");
    }
    if (i < numDig-1){
      System.out.print ("-");
    }
  }
    
    
 }
}
