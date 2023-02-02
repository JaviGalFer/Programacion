import java.util.Scanner;

/**
* Este programa genera una melodía
* @author Fco Javier Gallego Fernández
*/

public class GeneradorMelodia {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Se inicializa variables
    int notas = 4 * (int)(Math.random() * 7 + 1);
    String nota = "";
    String primNota = "";
    int i;
    //Se general la nota
    for (i = 1; i <= notas; i++) {
      switch((int)(Math.random() * 7)) {
        case 0:
          nota = "do";
          break;
        case 1:
          nota = "re";
          break;
        case 2:
          nota = "mi";
          break;
        case 3:
          nota = "fa";
          break;
        case 4:
          nota = "sol";
          break;
        case 5:
          nota = "la";
          break;
        case 6:
          nota = "si";
          break;
        default:
      }
      
      if (i == 1) {
        primNota = nota;
      }
      
      if (i == notas) {
        nota = primNota;
      }
      
      System.out.print( nota + " ");
      //Se comprueba si es la nota final
      if (i == notas) {
        System.out.print("||");
      }else if (i %4 == 0) {
        System.out.print("| ");
      }
    }
   
 }   
}
