import java.util.Scanner;


/**Pide introducir un caracter por pantalla y una opción y según la opción muestra una pirámide diferente con el caracter introducido.
 *@author Fco Javier Gallego Fernández
 */
 

public class Piramide {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    
    
    System.out.println ("Este programa dibuja una piramide con un caracter a elegir");
    System.out.print ("Por favor, introduzca el caracter de relleno: ");
    //Se pide un caracter de relleno para la pirámide almacenando el caracter en la variable
    String c = s.next();
    
    System.out.println ("Elija un tipo de piramide:");
    System.out.println ("----------------------------------");
    System.out.println ("1. Con el vertice arriba");
    System.out.println ("2. Con el vertice abajo");
    System.out.println ("3. Con el vertice a la izquierda");
    System.out.println ("4. Con el vertice a la derecha");
    System.out.println ("----------------------------------");
    System.out.println ("Elija la opcion introduciendo el numero: ");
    //Se pide un número del 1 al 4 para el switch, declarando la variable opcion
    int opcion = s.nextInt();
    
    //Se introduce el switch para el menu, comprobobando la variable opción y muestra la pirámide según la variable
    switch(opcion) {
      case 1:
        System.out.println ("  " + c);
        System.out.println (" " + c + c + c);
        System.out.println (c + c + c + c + c);
        break;
      
      case 2:
        System.out.println (c + c + c + c + c);
        System.out.println (" " + c + c + c);
        System.out.println ("  " + c);
        break;
      
      case 3:
        System.out.println ("    " + c);
        System.out.println ("  " + c + " " + c);
        System.out.println (c + " " + c + " " + c);
        System.out.println ("  " + c + " " + c);
        System.out.println ("    " + c);
        break;
      
      case 4:
        System.out.println (c);
        System.out.println (c + " " + c);
        System.out.println (c + " " + c + " " + c);
        System.out.println (c + " " + c);
        System.out.println (c);
        break;
      
      default:
        System.out.println ("Debe introducir un numero del 1 al 4.");
    }
      
    
  }
}
