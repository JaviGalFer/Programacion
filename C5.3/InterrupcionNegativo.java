import java.util.Scanner;

/**
* En este programa se utiliza el bucle do-while donde se introducen números enteros y positivos y se interrumpe 
* solo cuando se introduce un número negativo. Al terminar muestra la cantidad de números introducidos, la suma
* de los impares, la cantidad de números impares y el número máximo par introducido.
* @author Fco Javier Gallego Fernández
*/

public class InterrupcionNegativo {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println ("Por favor, introduzca numeros enteros.");
    System.out.println ("Puedes parar introduciendo un numero negativo.");
    
    //Se declaran variables
    int num;
    int cantidadNumeros = 0;
    int sumaImpares = 0;
    int cantidadImpares = 0;
    int maxPar = 0;
    //Se inicializa el do-while diciendole que mientras sea positivo se realice lo siguiente
    do {
      num = s.nextInt();
      //Se pide introducir el número y según seaa se suma a las diferentes variables
      if (num >= 0) {
        cantidadNumeros++;
        if ((num % 2) == 1) {
          sumaImpares += cantidadNumeros;
          cantidadImpares++;
        } else {
          if (num > maxPar)
          maxPar = num;
        }
      }
    } while (num >= 0);
    //Muestra los datos por pantalla
    System.out.println ("Ha introducido " + cantidadNumeros + " numeros positivos.");
    System.out.println ("La media de los impares es :" + (sumaImpares / cantidadImpares) + ".");
    System.out.println ("El numero maximo de los pares es " +maxPar + ".");
    
  }
}
