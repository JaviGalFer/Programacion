import java.util.Scanner;

/**
* Este programa genera el resultado de 5 monedas al aire
* @author Fco Javier Gallego Fernández
*/

public class CincoMonedas {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Se inicializa variables
    String moneda = "";
    String cara = "";
    int i;
    //Se general la moneda
    for (i = 0; i < 5; i++) {
      switch((int)(Math.random() * 8)) {
        case 0:
          moneda = "1 céntimo";
          break;
        case 1:
          moneda = "2 céntimos";
          break;
        case 2:
          moneda = "5 céntimos";
          break;
        case 3:
          moneda = "10 céntimos";
          break;
        case 4:
          moneda = "20 céntimos";
          break;
        case 5:
          moneda = "50 céntimos";
          break;
        case 6:
          moneda = "1 Euro";
          break;
        case 7:
          moneda = "2 Euros";
        default:
      }
      //Se general la cara de la moneda anterior
      switch((int)(Math.random() * 2)) {
        case 0:
          cara = "cara";
          break;
        case 1:
          cara = "cruz";
          break;
        default:
      }
      //Se muestra por pantalla
      System.out.println (moneda + " - " + cara);
    }
    
 }
}
