import java.util.Scanner;


/**Pregunta por pantalla el día de la semana, hora y minuto y te muestra por pantalla los minútos que faltan para el fin de semana
 * siendo de lunes a viernes.
 *@author Fco Javier Gallego Fernández
 */
 

public class BanderaEspaña {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    
    int altura;
    int anchura;
    boolean conEscudo;
    String escudo;
    int precioEscudo;
    int cm2;
    int precioCm2;
    int total;
    
    System.out.println ("Bienvenido a Banderas de España");
    System.out.println ("Configure su bandera: ");
    System.out.println ("________________________________");
    System.out.print ("Introduzca la altura de la bandera en cm");
    altura = s.nextInt();
    
    System.out.println ("________________________________");
    System.out.print ("Introduzca la anchura de la bandera en cm");
    anchura = s.nextInt();
    
    System.out.println ("________________________________");
    system.out.print ("Quiere escudo bordado (s/n): ");
    conEscudo = s.nextLine();
    conEscudo = toLoweCase();
    conEscudo = equals("s");
    
  }
}
