import java.util.Scanner;

/**
* En este bucle for hace la suma de los números pares e impares comprendidos entre 100 y 200
*
* @author Fco Javier Gallego Fernández
*/

public class Potencias {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Se pregunta por pantalla los valores de a y b
    System.out.print ("Introduce el valor de a: ");
    int a = s.nextInt();
    
    System.out.print ("Introduce el valor de b: ");
    int b = s.nextInt(); 
    
    //Se inicia una variable donde se almacena el valor
    int acum = 1;
    
    //Hasta que el contador llegue a b (número que elevado) "a" será multiplicado por "acum" que es inicializado a 1.
    for (int cont = 1; cont <= b; cont++) {
      acum = acum * a;
      
  /* EJEMPLO
   * 
   * a = 2
   * b = 3 (Número que eleva, es decir, número de veces que se múltiplica)
   * 
   * El for haría
   * 
   * 1 * 2
   * 
   * 2 * 2
   * 
   * 4 * 2
   * */
    }
    //Una vez acaba el bucle se muestra por pantalla la variable "acum" donde se ha guardado el resultado
    System.out.println ("El resultado de " + a + " elevado a " + b + " es: " + acum );
  }
}
