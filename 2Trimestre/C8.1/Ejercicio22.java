import java.util.Scanner;
/**
* 
* @author Fco Javier Gallego Fernández
*/
public class Ejercicio22 {
/** /////////////BIBLIOTECA DE FUNCIONES///////////////*/
  public static int funVoltea(int x) {
/** Voltea el número entero.
 * Dejando el último dígito el primero y sucesivamente con los siguientes
 * 
 * @return volteado al terminar la operación con el número ya volteado
 */
  int volteado = 0;
    //Mediante el siguiente while damos la vuelta al número y lo guardamos en la variable volteado
    while (x > 0) {
      volteado = (volteado * 10) + (x % 10);
      x /=10;
    }
    return volteado;
  }

  public static boolean esPrimo(int x) {
/** Comprueba si un númerro entero positivo es primo o no.
 * Teniendo en cuenta que un número es primo únicamente cuando es divisible
 * entre él mismo y la unidad.
 * 
 * @param x un número entero positivo
 * @return true si el número es primo
 * @return false si el número no es primo
 */
  int i;
  
  for (i = 2; i < x; i++){
    if ((x % i) == 0) {
      return false;
    }
  }
  return true;
}

  public static int sigPrimo(int x) {
/** Comprueba el siguiente primo a un número dado y lo muestra.
 * 
 * @return x con el siguiente número primo a un número dado
 */
    x++;
    while (!esPrimo(x)) {
      x++;
    }
    return x;
  }

  public static boolean esCapicua(int x) {
/** Comprueba si un número dado es capicua
 * Teniendo en cuenta que un número es caopicua
 * cuando se puede leer igual de izquierda a derecha que 
 * de derecha a izquierda
 * 
 *@return true si el número es capicua
 * @return false si el número no es capicua
 */
    int volteado = funVoltea(x);
    if (x == volteado) {
      return true;
    }else {
      return false;
    }
  }

  public static int potencia(int base, int exponente) {
/** Dada una base y un exponente calcula la potencia
 * 
 * @return resultado calculando base^exponente.
 */
    int resultado = 1;
    int i;
    
    for (i = 0; i < exponente; i++) {
      resultado *= base;
    }
    return resultado;
  }
  
  public static int numDigitos(int x) {
/** Cuenta la cantidad de digitos que tiene "x"
 * 
 * @return digitos con la cantidad de digitos que tiene
 */
    int digitos = 1;
    
    while (x >= 10) {
      x /= 10;
      digitos++;
    }
    
    return digitos;
  }
  
  public static int digitoN(int x, int n) {
/** Devuelve el dígito que esta en la posición "n" de un número entero
 * "x". Se empieza contando por el 0 y de izquierda a derecha.
 * 
 * return x devuelve el digito que se quería saber
 */
    x = funVoltea(x);
    int i;
    
    for (i = 0; i < n; i++) {
      x /= 10;
    }
    return x % 10;
  }
    
  public static int posDeDigito(int x, int d) {
/** Recibe un número "x" en busca de un digito "d"
 *  y luego devuelve la posición de ese digito "i".
 *  Devuelve -1 si el número "d" no es encontrado en "x".
 *  
 * @return i diciendo la posición del digito
 * @return -1 si no se encuentra ese digito
 */
    int i;
    
    for (i = 0; i < numDigitos(x); i++){
      if (digitoN(x, i) == d) {
        return i;
      }
    }
    return -1;
  }

/** /////////////PROGRAMA PRINCIPAL//////////////// */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Se pide introducir un número
    System.out.println ("Por favor, introduce un numero entero: ");
    int numIntro = s.nextInt();
    /////FUNCIÓN VOLTEA////////
    int b = funVoltea(numIntro);
    /**Se le da el valor a b con el resultado de la función,
    * que voltee la variable numIntro
    */
    System.out.println ("Si le damos la vuelta al numero " +numIntro);
    System.out.println ("obtenemos el numero " + b + ".");
    ////////////FUNCIÓN esPrimo/////////////
    if(esPrimo(numIntro)) {
      System.out.println("El número " +numIntro+ " es primo.");
    }else {
      System.out.println("El número " +numIntro+ " no es primo.");
    }
    ////////////FUNCIÓN esCapicua////////////
    if (esCapicua(numIntro)) {
      System.out.println("El número " +numIntro+ " es es capicua.");
    }else {
      System.out.println("El número " +numIntro+ " no es capicua.");
    }
    //////////FUNCIÓN sigPrimo//////////////////
    System.out.println ("El siguiente número primo a " +numIntro+ " es " + sigPrimo(numIntro) + ".");
    /////////FUNCIÓN numDigitos//////////////////
    System.out.println ("El número " +numIntro+ " tiene " + numDigitos(numIntro) + " digitos.");
    
    ////////FUNCIÓN digitoN/////////////////////
    int posicion;
    System.out.println();
    System.out.println ("Qué posición de digito quiere saber? ");
    posicion = s.nextInt();
    System.out.println ("El digito que esta en la posición " +posicion+ " es el " +digitoN(numIntro, posicion)+ ".");
    ///////FUNCIÓN posDeDigito/////////////////
    System.out.println();
    int numBusca;
    System.out.print ("Indica el número el cual quiere saber su posición: ");
    numBusca = s.nextInt();
    System.out.println ("Si el número a buscar no está se mostrara '-1'");
    System.out.println ("El número " +numBusca+ " está en la posición " + posDeDigito(numIntro, numBusca) + ".");
    //////FUNCIÓN potencia///////////
    int base;
    int exponente;
    int resultado;
    
    System.out.println();
    System.out.print ("Introduce una base: ");
    base = s.nextInt();
    System.out.print ("Introduce un exponente: ");
    exponente = s.nextInt();
    
    resultado = potencia(base, exponente);
    
    System.out.println (base + "^" + exponente + "=" + resultado );
    /////////////////////////////////////////////////
 }
}
