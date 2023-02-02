import java.util.Scanner;

/**
* En este bucle do-while simula una caja fuerte y pide introducir una clave, teniendo 4 intentos para acertar.
* @author Fco Javier Gallego Fernández
*/

public class CajaFuerte {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Se inicializan las variables
    int intentos = 4;
    int num;
    boolean acierto = false;
    //Se inicializa un do-while
    do {
      //se pide introducir una clave
      System.out.print ("Introduce la clave de la caja fuerte: ");
      num = s.nextInt();
      /*Se hace una condición donde se le dice la clave, cambiando la variable boolean a true si es la clave introducida
       * o mostrando por pantalla clave incorrecta 
       * */
      if (num == 1234) {
        acierto = true;
      } else {
        System.out.println ("La clave introducida es incorrecta");
      }
      //Se le resta un intento
      intentos--;
      
      //Se compara que una de las dos condiciones sea correcta para salir
   } while ((intentos > 0) && (!acierto));
   //Dependiendo si la variable boolean esta como false o true muestra un mensaje
   if (acierto) {
     System.out.println ("La caja fuerte ha sido abierta.");
    } else {
      System.out.println ("No puedes volver a intentarlo, has agotado los 4 intentos.");
    }
   
  }
}
