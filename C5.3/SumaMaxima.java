import java.util.Scanner;

/**
* En este programa se utiliza el bucle do-while donde se introducen números hasta que la suma de estos
* superen la cantidad de 10000. Después muestra por pantalla la suma, la cantidad de números introducidos
* y la media.
* @author Fco Javier Gallego Fernández
*/

public class SumaMaxima {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println ("Por favor, introduce numeros.");
    System.out.println ("El programa finaliza cuando la suma de los numeros introducidos sea mayor que 10000.");
    //Se declaran variables
    int suma = 0;
    int cantidadNum = 0;
    int media = 0;
    //Mediante el do-while hacemos que se vayan leyendo números hasta que la suma de todos sea 10000
    do {
      int num = s.nextInt();
      suma += num;
      cantidadNum++;
      
    } while (suma < 10000);
    //Se muestran resultados
    System.out.println ("Se ha introducido una cantidad de " + cantidadNum + " numero/s.");
    System.out.println ("La suma total de los numeros introducidos es " + suma + ".");
    System.out.println ("La media es " + (suma / cantidadNum));
      
        
  }
}
