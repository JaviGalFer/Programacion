import java.util.Scanner;

/**Muestra por pantalla una serie de preguntas y te pide introducir una respuesta. Al final te dice la puntuación obtenida
 *@author Fco Javier Gallego Fernández
 */
 
 public class Cuestionario {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
    
    int puntos = 0;
    String respuesta;
    
    System.out.println ("Cuestionario variado");
    //Primera pregunta
    System.out.println ("1. Cual es el tipo de variable para un numero entero?");
    System.out.println ("a) Double\nb) int\nc) String");
    System.out.print ("=> ");
    respuesta = s.nextLine();
    //Comprobación si es correcta y suma de puntos en caso de ser correcto
    if (respuesta.equals("b")) {
      puntos++;
      System.out.println ("Correcto\n");
    } else {
      System.out.println ("Incorrecto\n");
    }
    
    System.out.println ("2. Que util se utiliza para introducir datos?");
    System.out.println ("a) Void\nb) String\nc) Scanner");
    System.out.print ("=> ");
    respuesta = s.nextLine();
    if (respuesta.equals("c")) { 
      puntos++;
      System.out.println ("Correcto\n");
    } else {
      System.out.println ("Incorrecto\n");
    }
    
    System.out.println ("3. Como formatear 2 decimales?");
    System.out.println ("a) %.2\nb) %2\nc) %F");
    System.out.print ("=> ");
    respuesta = s.nextLine();
    if (respuesta.equals("a")) {
      puntos++;
      System.out.println ("Correcto\n");
    } else {
      System.out.println ("Incorrecto\n");
    }
    //Muestra por pantalla la variable puntos para decir la cantidad de puntos obtenidos.
    System.out.println("\nHa obtenido " + puntos + " puntos.");
  }
}
