import java.util.Scanner;


/**Este programa te pregunta tu fecha de nacimiento para mostrarla posteriormente
 *@author Fco Javier Gallego Fernández
 */
 

public class OrdenarNumeros {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    
    int aux;
    
    System.out.println ("Este programa ordena tres numeros introducidos por teclado.");
    System.out.println ("Introduzca los numeros de uno en uno pulsando intro.");
    System.out.println ("Por favor, introduzca el primer numero: ");
    int a = s.nextInt();
    System.out.println ("Por favor, introduzca el segundo numero: ");
    int b = s.nextInt();
    System.out.println ("Por favor, introduzca el tercer numero: ");
    int c = s.nextInt();
    
    // Ordenamos los dos primeros numeros
    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }
    
    //ordenamos los dos últimos números
    if (b > c) {
      aux = b;
      b = c;
      c = aux;
    }
    
    //Se vuelven a ordenar los dos primeros
    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }
    
    System.out.println ("Los numeros introducidos ordenados de menor a mayor son " + a + ", " + b + " y " + c + ".");
    
    
    
  }
}
