import java.util.Scanner;


/**Este programa realiza una facturación para una empresa que vende banderas
 *@author Fco Javier Gallego Fernández
 */
 

public class BanderaSpain {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    
    //Declaramos variables
    int altura;
    int anchura;
    String escudo;
    double precioEscudo;
    int cm2;
    double precioCm2;
    double total;
    
    //Damos la bienvenida y pedimos las medidas de la bandera
    System.out.println ("Bienvenido a Banderas de Espa\u00f1a");
    System.out.println ("Configure su bandera: ");
    System.out.println ("________________________________");
    System.out.print ("Introduzca la altura de la bandera en cm: ");
    altura = s.nextInt();
    
    System.out.println ("________________________________");
    System.out.print ("Introduzca la anchura de la bandera en cm: ");
    anchura = s.nextInt();
    
    //Calculamos los cm2 de la bandera y su precio en base a los cm2
    cm2 = altura * anchura;
    precioCm2 = cm2 / 100;
    
    //Preguntamos si se quiere bordado
    System.out.println ("________________________________");
    System.out.print ("Quiere escudo bordado (s/n): ");
    //System.out.println ("");
    boolean conEscudo = ((s.next()).toLowerCase()).equals("s");
    
    //Declarando como boolean la variable para así comparar con el if y añadir precio de bordado o no
    if (conEscudo) {
      escudo = "Con escudo";
      precioEscudo = 2.5;
    } else {
      escudo = "Sin escudo";
      precioEscudo = 0;
    }
    
    //Calculamos el precio total
    total = (precioCm2 * precioEscudo) + 3.25;
    
    //Imprimimos por pantalla de manera desglosada y formateada la facturación
    System.out.println("-----------------------------");
    System.out.println("---------FACTURACION---------");
    System.out.printf ("Bandera de %5d cm2: %5.2f\n", cm2, precioCm2);
    System.out.printf ("%s         %5.2f \u20AC\n", escudo, precioEscudo);
    System.out.printf ("Gastos de envio     %5.2f \u20AC\n", 3.25);
    System.out.println ("________________________________");
    System.out.printf ("Total               %5.2f \u20AC\n", total);
    
  }
}
