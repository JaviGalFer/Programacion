import java.util.Scanner;

/**
* Este programa genera números pares entre el 0 y el 100 y se para cuando el número generado es 24.
* @author Fco Javier Gallego Fernández
*/

public class LineasAleatorias {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int numRelleno;
    int longitud;
    String relleno = "";
    int i;
    int l;
    
    for (i = 1; i <= 10; i++) {
      longitud = (int)(Math.random() * 40) +1;
      numRelleno = (int)(Math.random() * 6);
      
      switch(numRelleno) {
        case 0:
          relleno = "*";
          break;
        case 1:
          relleno = "-";
          break;
        case 2:
          relleno = "=";
          break;
        case 3:
          relleno = ".";
          break;
        case 4:
          relleno = "|";
          break;
        case 5:
          relleno = "@";
          break;
        default:
      }
        
      for (l = 1; l <= longitud; l++){
        System.out.print(relleno);
      }
      System.out.println();
    }
  
 }
}
