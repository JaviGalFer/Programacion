import java.util.Scanner;


/**Este programa calcula el precio de un desayuno, preguntando por pantalla qué ha tomado de bebida y comida
 *@author Fco Javier Gallego Fernández
 */
 

public class Desayuno {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    
    //Declaramos variables
    String pitufo;
    pitufo = "";
    String desayuno;
    desayuno = "";
    double precioComida;
    precioComida = 0;
    double precioBebida;
    precioBebida = 0;
    String bebida;
    double total;
    String comida;
    
    //Preguntamos qué ha comido
    System.out.print ("Que ha tomado de comer? (palmera, donut o pitufo): ");
    comida = s.nextLine();
    
    if (comida.equalsIgnoreCase("pitufo")) {
      System.out.print ("Con que ha toma el pitufo (aceito o tortilla): ");
      pitufo = s.nextLine();
      //En caso de pitufo preguntamos de qué es y añadimos el precio
      if (pitufo.equalsIgnoreCase("aceite")) {
        desayuno = "Pitufo con aceite: 1,20\u20AC";
        precioComida = 1.20;
      } else if (pitufo.equalsIgnoreCase("tortilla")) {
        desayuno = "Pitufo con tortilla: 1.60\u20AC";
        precioComida = 1.60;
      }
      //Hacemos lo mismo para el caso de la palmera y el donut
    } else if (comida.equalsIgnoreCase("palmera")) {
      desayuno = "Palmera: 1.40\u20AC";
      precioComida = 1.40;
    } else if (comida.equalsIgnoreCase("donut")) {
      desayuno = "Donut: 1.00\u20AC";
      precioComida = 1.00;
    }
    
    //Preguntamos qué ha bebido y añadimos al precio
    System.out.print ("Que ha pedido para beber? (zumo o cafe): ");
    bebida = s.nextLine();
    if (bebida.equalsIgnoreCase("zumo")) {
      desayuno += "\nZumo: 1.50\u20AC";
      precioBebida = 1.50;
    } else if (bebida.equalsIgnoreCase("cafe")) {
      desayuno += "\nCafe: 1.20\u20AC";
      precioBebida = 1.20;
    }
    
    total = precioComida + precioBebida;
    //Mostramos por pantalla el desayuno que ha pedido y el total del desayuno
    System.out.print (desayuno);
    System.out.printf ("\nTotal desayuno: %.2f\u20AC\n", total);
    
  }
}
