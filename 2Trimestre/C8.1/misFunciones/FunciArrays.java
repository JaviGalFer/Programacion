package misFunciones;

public class FunciArrays {
    /** 
 * @author Francisco Javier Gallego Fernández
 * 
 */  
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
    
    ///////FUNCIÓN SUMA ARRAY///////
  public static double sumaArrayInt(int[] array) {
    /**
     * Devuelve la media del array que entra por la variable array
     * 
     * @param array El array introducido en la variable
     * @return (double)suma -> Devuelve la suma total del array
     */
    int suma = 0;
    int i;
    
    for (i = 0; i < array.length; i++) {    //Recorre la variable haciendo la suma de cada uno
      suma += array[i];                     //Guardandose en la variable suma
    }
    
    return (double)suma;     //Devuelve de manera double la variable suma
  } 

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
}

