import java.util.Scanner;


/**Pregunta por pantalla dos notas de la asignatura, hace la media y si es inferior a 5 pregunta si fue apto o no apto en la recuperación
 * dejando en 5 la nota media de la recuperación. Después muestra la nota media
 *@author Fco Javier Gallego Fernández
 */
 

public class AptoNota {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    //Se declaran las variables
    double nota1;
    double nota2;
    double media;
    String recuperacion;
    
    System.out.println ("Este programa le dice su nota media en la asignatura de programacion");
    System.out.print ("Por favor, introduzca la nota del primer examen: ");
    nota1 = s.nextDouble();
    
    System.out.print ("Por favor, introduzca la nota del segundo examen: ");
    nota2 = s.nextDouble();
    //Se hace la media de las dos notas
    media = (nota1 + nota2) / 2;
    //Mediante el if se comprueba si es inferior a 5 la media para asi declarar como apto o no apto
    if (media < 5) {
      System.out.print (" Cual ha sido el resultado del examen de recuperacion? (apto / no apto): ");
      recuperacion = s.next();
      recuperacion = recuperacion.toLowerCase();
      if (recuperacion.equals("apto")) {
        media = 5;
      }
    }
    //Se muestra la nota media
    System.out.println ("La nota media en programacion es: " + media);
    
  }
}
