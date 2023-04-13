import java.util.Scanner;


/**Pregunta por pantalla el día de la semana, hora y minuto y te muestra por pantalla los minútos que faltan para el fin de semana
 * siendo de lunes a viernes.
 *@author Fco Javier Gallego Fernández
 */
 

public class MinutosFinde {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    
    int dia;
    int hora;
    int minutos;
    int totales;
    int actuales;
    
    
    System.out.println ("Este programa te dice cuantos minutos faltan para el fin de semana.");
    System.out.println ("Por favor, introduce un dia en numero de la semana de lunes a viernes");
    System.out.print ("Siendo 0 para el Lunes y 4 para el viernes: ");
    dia = s.nextInt();
    
    System.out.println ("Por favor, introduce ahora la hora y minuto actual");
    
    System.out.print ("Hora: ");
    hora = s.nextInt();
    
    System.out.print ("Minutos: ");
    minutos = s.nextInt();
    
    totales = (4 * 24 * 60) + (15 * 60);
    actuales = (dia * 24 * 60) + (hora * 60) + minutos;
    
    System.out.println ("Faltan " + (totales - actuales) + " minutos para llegar al fin de semana.");
    
  }
}
