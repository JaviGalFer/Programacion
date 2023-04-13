import java.util.Scanner;

/**
* En este programa cuenta los digitos pares y los digitos impares de un número introducido
* @author Fco Javier Gallego Fernández
*/

public class CuentaParImpar {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Se pide un número
    System.out.print ("Por favor, introduce un numero entero positivo: ");
    long num = s.nextLong();
    //Se declaran variables
    long n = num;
    int cuentaPares = 0;
    int cuentaImpares = 0;
    //Mediante el while se cuenta los pares e impares
    while (n > 0){
      if ((n % 10) % 2 == 0){
        cuentaPares++;
      } else {
        cuentaImpares++;
      }
      
      n /= 10;
    }
    //Se muestra por pantalla
    System.out.print("El " + num + " contiene " +cuentaPares+ " digitos pares y " +cuentaImpares+ " digitos impares.");
    
    
 }
}
