import java.util.Scanner;


/**Pregunta por pantalla la hora y minuto y muestra cuantos segundos faltan hasta la media noche
 *@author Fco Javier Gallego Fernández
 */
 

public class SegundosFaltan {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    //Se declara las variables para saber los segundos que han transcurrido y los segundos que faltan hasta la media noche
    int segundosTranscurridos;
    int segundosHasta;
    
    System.out.println ("Este programa le dira cuantos segundos faltan para llegar a la media noche");
    
    System.out.println ("Introduzca la hora: ");
    int hora = s.nextInt();
    
    System.out.println ("Introduzca los minutos: ");
    int minuto = s.nextInt();
    
    //Se hace el calculo de los segundos multiplicando la hora y minuto para saber los segundos
    segundosTranscurridos = (hora * 3600) + (minuto * 60);
    /**Se hace el calculo de los segundos que hay en 24h y se les resta los segundos 
     * que han transcurrido que se calcularon con la variable segundosTranscurridos
     */
    segundosHasta = (24 * 3600) - segundosTranscurridos;
    
    System.out.println ("Desde las " + hora + ":" + minuto + " hasta la media noche faltan " + segundosHasta + " segundos.");
    
    
    
  }
}
