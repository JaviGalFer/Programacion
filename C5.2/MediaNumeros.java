import java.util.Scanner;

/**
* En este bucle while muestra la media de los números positivos introducidos
* @author Fco Javier Gallego Fernández
*/

public class MediaNumeros {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Se declaran las variables antes
    double cantidad = 0;
    double num = 0;
    double suma = 0;
    
    System.out.println ("El programa calcula la media de los numeros positivos que introduzcas");
    System.out.println ("Para finalizar introduzca un numero negativo.");
    System.out.println ("Por favor, introduzca los numeros: ");
    //Mediante un while declaramos que mientras el número sea positivo se realice el bloque
    while (num >= 0) {
      /*Se pide introducir un número, se le suma a la variable cantidad para llevar la cantidad de números introducidos
       * luego a la variable suma se le suma la cantidad introducida en la variable num*/
      num = s.nextDouble();
      cantidad++;
      suma += num;
    }
    /*Se muestra por pantalla y se realiza la media. En el primer parentesis se le resta el num ya que es introducido para salir y no cuenta
    * y en el siguiente parentesis se le resta 1 a cantidad ya que el último tampoco cuenta 
    */
    System.out.print ("La media de los numeros positivos introducidos es " + ((suma - num) / (cantidad - 1)));
   
  }
}
