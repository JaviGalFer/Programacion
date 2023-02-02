import java.util.Scanner;
/** 
 * @author Francisco Javier Gallego Fernández
 * 
 */
public class BibliotecaArray {
  
  //////FUNCIÓN GENERA ARRAY///////
  public static int[] generaArrayInt(int size, int minimo, int maximo) {
    /**
     * Crea un array y lo rellena con valores aleatorios determinado por la variable
     * minimo y maximo con un tamaño determinado por size.
     * 
     * @param size tamaño del array
     * @param minimo El número mínimo
     * @param maximo El número máximo
     * @return array Devuelve el array relleno con valores aleatorios con los valores definidos
     *               por las variables
     */
     
     //Genera el array
    int[] array = new int[size];
    int i;
    
    //Recorre el array rellenando con el tamaño, mínimo y máximo
    for (i = 0; i < size; i++) {
      array[i] = (int)(Math.random() * (maximo - minimo + 1) + minimo);
    }
    return array;
  }
  
  //////FUNCIÓN MUESTRA ARRAY//////
  public static void muestraArrayInt(int[] array) {
    /**
     * Muestra por pantalla todos los elementos de un array de números enteros
     * 
     * 
     * @param x array
     */
    int i;
    //Recorre todo el array pintando por pantalla
    for (i = 0; i < array.length; i++) {
      System.out.print (array[i] + " ");
    }
    System.out.println();
  }
  
    /////FUNCIÓN MINIMO ARRAY////////
  public static int minimoArrayInt(int[] array) {
    /**
     * Devuelve el número más pequeño del array que entra por la variable array
     * 
     * @param array El array introducido en la variable
     * @return minimo Devuelve el número más pequeño del array
     */
    int minimo = Integer.MAX_VALUE;   //Variable para encontrar el número mínimo
    int i;
    
    for (i = 0; i < array.length; i++) {   //Recorre el array en busca del número mínimo
      if (array[i] < minimo){              //Guardando el número mínimo en la variable
        minimo = array[i];
      }
    }
    return minimo;
  }
 
  /////////FUNCIÓN MÁXIMO ARRAY///////
  public static int maximoArrayInt(int[] array) {
    /**
     * Devuelve el número más grande del array que entra por la variable array
     * 
     * @param array El array introducido en la variable
     * @return maximo Devuelve el número más pequeño del array
     */
    int maximo = Integer.MIN_VALUE; //Variable para encontrar el número máximo
    int i;
    
    for (i = 0; i < array.length; i++) {  //Recorre el array en busca del número máximo
      if (array[i] > maximo){             //Guardando el número máximo en la variable
        maximo = array[i];
      }
    }
    return maximo;
  }
  
  ///////FUNCIÓN MEDIA ARRAY///////
  public static double mediaArrayInt(int[] array) {
    /**
     * Devuelve la media del array que entra por la variable array
     * 
     * @param array El array introducido en la variable
     * @return (double)suma / array.length -> Devuelve el número más pequeño del array
     */
    int suma = 0;
    int i;
    
    for (i = 0; i < array.length; i++) {    //Recorre la variable haciendo la suma de cada uno
      suma += array[i];                     //Guardandose en la variable suma
    }
    
    return (double)suma / array.length;     //Devuelve de manera double la variable suma
  }                                        //Dividiendolo entre la longitud del array
  
  ////////FUNCIÓN ESTÁ EN ARRAY////////
  public static boolean estaEnArrayInt(int[] array, int numero) {
    /**
     * Dice si un número está en el array
     * 
     * @param array El array introducido en la variable
     * @param numero Variable con el número que buscamos
     * @return true Si está el número en el array
     * @return false Si no está el número en el array
     */
    int i;
    
    for (i = 0; i < array.length; i++) {    //Recorre el array comprobando si está el número
      if (array[i] == numero) {             //Devuelve true si está en el array
        return true;      
      }
    }
    return false;                         //Devuelve falase si no está en el array  
  }
  
  ///////FUNCIÓN POSICIÓN ARRAY///////
  public static int posicionEnArrayInt(int[] array, int numero) {
    /**
     * Dice la posición del número en un array
     * 
     * @param array El array introducido en la variable
     * @param numero Variable con el número
     * @return i devuelve la posición 
     * @return -1 devuelve -1 si no está el número
     */
    int i;
    
    for (i = 0; i < array.length; i++) {    //Busca el número en el array
      if (array[i] == numero) {             //Devuelve i para decir la posición en la que esta
        return i;
      }
    }
    return -1;                              //Devuelve -1 si no está en el array
  }
  
  /////FUNCIÓN VOLTEAR ARRAY SIN MODIFICAR ARRAY////
  public static int[] volteaArrayInt(int[] array) {
    /**
     * Le da la vuelta al array que entra por la variable. Utilizado para generar
     * un array nuevo con el resultado
     * 
     * @param array El array introducido en la variable
     * @return auxiliar Devuelve el array volteado
     */
    int i;
    int [] auxiliar = new int[array.length];    //Genera array
    
    for (i = 0; i < array.length; i++) {        //Recorre el array que entra en la variable
      auxiliar[array.length -i -1] = array[i];  //Rellena el nuevo array dandole la vuelta
    }
    return auxiliar;                            //Devuelve el nuevo array
  }
  
  ////FUNCIÓN VOLTEAR ARRAY MODIFICANDO ORIGINAL/////////
  public static void volteaArrayOriginalInt(int[] array) {
    /**
     * Le da la vuelta al array que entra por la variable.
     * 
     * @param array El array introducido en la variable
     */
    int aux;
    int size = array.length;
    int i;
    
    for (i = 0; i < size / 2; i++) {            //Recorre el array modificando las posiciones
      aux = array[i];
      array[i] = array[size -i -1]; 
      array[size -i -1] = aux;
    }
  }
  
  ///////FUNCIÓN ROTAR DERECHA ARRAY///////
  public static void rotaDerechaArrayInt(int[] array, int nDerecha) {
    /**
     * Devuelve el array cambiando la posición a la derecha nDerecha veces
     * 
     * @param array El array introducido en la variable
     * @param nDerecha Número de veces que rotamos hacia la derecha el array
     */
    nDerecha = nDerecha % array.length;
    int[] auxiliar = new int[array.length];
    int i;
    
    for (i = 0; i < array.length; i++) {
      auxiliar[(i + nDerecha) % array.length] = array[i];
    }
    for (i = 0; i < array.length; i++) {
      array[i] = auxiliar[i];
    }
  }
  
  //////FUNCIÓN ROTAR IZQUIERDA ARRAY///////
  public static void rotaIzquierdaArrayInt(int[] array, int nIzquierda) {
    /**
     * Devuelve el array cambiando la posición a la izquierda nIzquierda veces
     * 
     * @param array El array introducido en la variable
     * @param nIzquierda Número de veces que rotamos hacia la derecha el array
     */
    nIzquierda = nIzquierda % array.length;
    int i;
    int[] auxiliar = new int[array.length];
    
    for (i = 0; i < array.length; i++) {
      auxiliar[i] = array[(i + nIzquierda) % array.length];
    }
    
    for (i = 0; i < array.length; i++) {
      array[i] = auxiliar[i];
    }
  }
  
    
  /////////////// FUNCION MAIN //////////////
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //VARIABLES PARA EL ARRAY//
    int t;
    int min;
    int max;
    //SE PREGUNTA POR PANTALLA TAMAÑOS Y CANTIDADES//
    System.out.print ("Introduce el tamaño del array: ");
    t = s.nextInt();
    System.out.print ("Introduce el valor mínimo de los números: ");
    min = s.nextInt();
    System.out.print ("Introduce el valor máximo de los números: ");
    max = s.nextInt();
    //////////////////////////////////////////////////
    
    //SE GENERA EL ARRAY CON LAS VARIABLES//
    int[] aux = generaArrayInt(t, min, max);
    
    //SE LLAMA A LAS FUNCIONES MUESTRA, MÍNIMO, MÁXIMO Y MEDIA//
    System.out.println();
    System.out.println ("\u001B[31m//////FUNCIÓN MOSTRAR ARRAY, MÍNIMO, MÁXIMO Y MEDIA///////\u001B[37m");
    /////////////////////////////////////////////
    muestraArrayInt(aux);
    System.out.println ("El mínimo del array es el " +minimoArrayInt(aux));
    System.out.println ("El máximo del array es el " +maximoArrayInt(aux));
    System.out.println ("La media de los números del array es " +mediaArrayInt(aux));
    
    //FUNCIÓN BUSCAR NÚMERO EN ARRAY//
    System.out.println();
    System.out.println ("\u001B[31m//////FUNCIÓN BUSCAR NÚMERO EN ARRAY///////\u001B[37m");
    /////////////////////////////////////////////
    int buscar;
    System.out.print ("Qué número busca?: ");
    buscar = s.nextInt();
    
    if (estaEnArrayInt(aux, buscar)) {
      System.out.println ("El número " +buscar+ " está en el array.");
    }else {
      System.out.println ("El número " +buscar+ " no está en el array.");
    }
    
    //FUNCIÓN POSICIÓN//
    System.out.println();
    System.out.println ("\u001B[31m//////FUNCIÓN INDICAR LA POSICIÓN///////\u001B[37m");
    /////////////////////////////////////////////
    int posicion;
    
    System.out.print ("Indica el número del cual quiere saber la posición: ");
    posicion = s.nextInt();
    
    if (posicionEnArrayInt(aux, posicion) < 0) {
      System.out.println ("El número no está en el array.");
    }else {
      System.out.println ("El número " +posicion+ " se encuentra en la posición " + posicionEnArrayInt(aux, posicion) + ".");
    }
    
    //FUNCIÓN VOLTEAR ARRAY SIN MODIFICAR ORIGINAL//
    System.out.println();
    System.out.println ("\u001B[31m//////FUNCIÓN VOLTEAR ARRAY ORIGINAL///////\u001B[37m");
    /////////////////////////////////////////////////////////////
    System.out.print ("Volteamos el array original: ");
    int[] volteado = volteaArrayInt(aux);
    muestraArrayInt(volteado);
    System.out.print ("Vemos que el array original sigue igual : ");
    muestraArrayInt(aux);
    
    //FUNCIÓN VOLTEAR ARRAY ORIGINAL//
    System.out.println();
    System.out.println ("\u001B[31m//////FUNCIÓN VOLTEAR ARRAY ORIGINAL///////\u001B[37m");
    /////////////////////////////////////////////
    System.out.print ("Volteamos el array original: ");
    volteaArrayOriginalInt(aux);
    System.out.print ("Si mostramos el original vemos que ha cambiado : ");
    muestraArrayInt(aux);
    System.out.println();
    
    //FUNCIÓN ROTAR DERECHA N POSICIONES//
    System.out.println();
    System.out.println ("\u001B[31m//////FUNCIÓN ROTAR DERECHA N POSICIONES///////\u001B[37m");
    int nDerecha;
    System.out.print ("Indica cuantas posiciones a la derecha desea mover el array: ");
    nDerecha = s.nextInt();
    rotaDerechaArrayInt(aux, nDerecha);
    System.out.print ("El array rotando " +nDerecha+ " posiciones a la derecha es el siguiente: ");
    muestraArrayInt(aux);
    
    
    //FUNCIÓN ROTAR IZQUIERDA N POSICIONES//
    System.out.println();
    System.out.println ("\u001B[31m//////FUNCIÓN ROTAR IZQUIERDA N POSICIONES///////\u001B[37m");
    int nIzquierda;
    System.out.print ("Indica cuantas posiciones a la izquierda desea mover el array: ");
    nIzquierda = s.nextInt();
    rotaIzquierdaArrayInt(aux, nIzquierda);
    System.out.print ("El array rotando " +nIzquierda+ " posiciones a la izquierda es el siguiente: ");
    muestraArrayInt(aux);
    
  s.close();
 }
}
