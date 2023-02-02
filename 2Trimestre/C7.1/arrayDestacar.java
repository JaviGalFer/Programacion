import java.util.Scanner;

/**
* Genera un array con 100 números entre el 0 y el 500. A continuación
* los muestra por pantalla y pregunta si quieres destacar el máximo
* o el mínimo
* @author Fco Javier Gallego Fernández
*/

public class arrayDestacar {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
  
    int t = 100; //VARIABLE PARA ARRAY
    int[] numero = new int[t]; //Array predeterminada
    //Se declaran variables
    int maximo = Integer.MIN_VALUE; //Hace que la variable máximo sea el número más pequeño posible
    int minimo = Integer.MAX_VALUE; //Hace que la variable mínimo sea el número más grande posible
    int destacado;
    int opcion;
    int i;
    
    /**Se genera el array mientras se compara si es máximo o mínimo
    *  mientras se muestra por pantalla
    */
    for (i = 0; i < t; i++) {
      numero[i] = (int)(Math.random()*501);
      if (numero[i] < minimo) {
        minimo = numero[i];
      }for (i = 0; i < t; i++) {
      numero[i] = (int)(Math.random()*101);
      if (numero[i] > maximo) {
        maximo = numero[i];
      }
      System.out.print(numero[i] + " ");
    }
    //Se pregunta por pantalla si se quiere destacar el máximo o el mínimo
    System.out.print("\n¿Qué quiere destacar? (1 - mínimo o 2 - máximo): ");
    opcion = s.nextInt();
    //Se guarda en la variable opción la respuesta y se compara para la variable destacado
    if (opcion == 1) {
      destacado = minimo;
    } else {
      destacado = maximo;
    }
    
    System.out.println();
    //Se muestra por pantalla, destacando el número
    for (i = 0; i < t; i++) {
      if (numero[i] == destacado) {
        System.out.print("\033[32m**"+ destacado + "**\033[37m ");
      }else {
        System.out.print(numero[i] + " ");
      }
    }
 }
}
