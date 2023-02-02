import java.util.Scanner;

/**
* En este programa se utiliza el bucle do-while y el bucle for para hacer la suma
* de los siguientes 100 números positivos y enteros al número introducido
* @author Fco Javier Gallego Fernández
*/

public class SumaCien {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Se declaran variables
    
    int num = 0;
    int suma = 0;
    //Mediante el do-while se asegura que el número sea positivo
    do {
      System.out.print ("Introduce un numero entero y positivo y hare la suma de los 100 siguientes: ");
      num = s.nextInt();
    if (num < 0) {
      System.out.println ("Debe introducir un numero entero y positivo.");
    }
    
    }while (num < 0 );
  
    //Con el bucle for hacemos la suma de los 100 números siguientes al número introducido
    for (int i = 0; i < 100; i++) {
      suma += num;
      num++;
    }
    //Se muestra por pantalla la suma
    System.out.println ("La suma total de los 100 numeros siguientes es: "+suma);
    
    
        
  }
}
