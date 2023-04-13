import java.util.Scanner;

/**
* Este programa hace la simulación de una baraja española
* en cual muestra un palo y el numero de carta
* @author Fco Javier Gallego Fernández
*/

public class BarajaSpain {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    String palo = "";
    String carta = "";
    
    int numeroPalo = (int)(Math.random()*4);
    
    switch(numeroPalo) {
      case 0:
        palo = "oros";
        break;
      case 1:
        palo = "copas";
        break;
      case 2: 
        palo = "bastos";
        break;
      case 3:
        palo = "espadas";
      default:
    }
    
    int numeroCarta = (int)(Math.random()*11) + 1;
    
    switch(numeroCarta) {
      case 1:
        carta = "As";
        break;
      case 8:
        carta = "Sota";
        break;
      case 9:
        carta = "Caballo";
        break;
      case 10:
        carta = "Rey";
        break;
      default:
        carta = String.valueOf(numeroCarta);
      }
      
      System.out.println(carta + " de " + palo);
 }
}
