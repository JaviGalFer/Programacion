package misFunciones;

public class Varias {
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
    
    ///FUNCION MULTIPLICAR//////
    public static double multiplica(double a, double b) {
    /** Recibe dos números "a" y "b" y los multiplica 
     * Devolviendolo en la variable multiplicar
     * 
     * @param a ->Primer número de entrada
     * @param b ->Segundo número de entrada
     * @return multiplicar devuelve la variable con el resultado de multiplicar
     */
        double multiplicar;

        multiplicar = a * b;
        return multiplicar;
    }

    ///FUNCIÓN ESMAYOREDAD ////////
    /**
     * Recibe un número "x" y te dice si eres mayor de edad o no
     * 
     * @param x -> Número de entrada
     * @return true -> Si eres mayor de edad
     * @return false -> Si no eres mayor de edad
     */
    public static boolean esMayorEdad(int x) {
        if (x >=18){
            return true;
        }else {
            return false;
        }
    }
    ////FUNCIÓN NÚMERO MÍNIMO///////
    /**
     * Devuelve el número menor entre dos números de entrada
     * @param a Primer número
     * @param b Segundo número
     * @return a -> Devuelve el valor de a
     * @return b -> Devuelve el valor de b
     */
    public static int numMin(int a, int b){
        if (a < b){
            return a;
        }else {
            return b;
        }
    }
    
    ////FUNCIÓN dimeSigno//////////
    /**
     * Esta función dice si un número es positivo, negativo o 0 si es igual a 0´
     * @param x    -> Número de entrada
     * @return  0  -> El número es 0
     * @return -1  -> El número es negativo
     * @return  1  -> El número es positivo
     */
    public static int dimeSigno(int x){
      if (x == 0) {
        return 0;
      }
      if (x < 0) {
        return -1;
      }else {
        return 1;
      }
    }
    ////FUNCION TABLA DE MULTIPLICAR//////////
    /**
     * Realiza por pantalla la tabla de multiplicar en base a un número "x"
     * @param x número introducido para saber su tabla de multiplicar
     */
    public static void tablaMultiplicar(int x){
      int i;

      for (i = 0; i <= 10; i++){
        System.out.printf ("%2d * %2d = %3d\n", x, i, x * i);
      }
    }
    ///////FUNCIÓN PIRAMIDE//////
    /**
     * Dibuja una piramide por pantalla en base a la altura de entrada 
     * con un relleno en base a la entrada indicada
     * @param altura    ->Altura de la pirámide
     * @param relleno   ->Relleno de la pirámide
     */
    public static void piramide(int altura, String relleno){
      int planta = 1;
      int cantidadRelleno = 1;
      int totalBlanco = altura - 1;   //Se Declaran variables
      int b;
      int r;

      while (planta <= altura){                   //Se realiza el bucle while mientras la variable "planta" declarada a 1
        for (b = 1; b<=totalBlanco; b++){         //Sea inferior a la altura de entrada
          System.out.print (" ");             //Se pinta blancos por pantalla
        }
        for (r = 1; r <= cantidadRelleno; r++){ //Se pinta el relleno
          System.out.print (relleno);
        }
      planta++;
      cantidadRelleno += 2;     //Se ajustan variables para seguir pintando
      totalBlanco--;            //Y se imprime un salto de línea
      System.out.println();
      }
    }
    
    /////FUNCIÓN LETRADNI////////////
    /**
     * Esta función devuelve la letra del DNI en base a la variable "dni" con el número del DNI
     * @param dni            -> Parámetro de entrara con el número del dni
     * @return letras[letra] -> Devuelve la letra del DNI
     * 
     */
    public static char letraDNI (int dni){
      char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
                      'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};       //Se crea un array con las letras
      int letra = dni % 23;                                                       //Se divide "dni" entre las 23 letras
      return letras[letra];                                                       //Se añade a la variable y se devuelve el array
    }
}


