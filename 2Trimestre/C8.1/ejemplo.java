import java.util.Scanner;
/** 
 * @author Francisco Javier Gallego Fernández
 * 26/01/2023
 * Turno: Tarde
 */
public class ejemplo {
  
  public static boolean esPrimo(int juan){
    
    for (int x = 2; x < juan; x++){
      if ((juan % x) == 0) {
        return false;
      }
    }
    return true;
  }
  
  public static
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num;
    
    System.out.println ("Por favor, introduce un numero entero: ");
    num = s.nextInt();
    
    boolean b;
    b = esPrimo(num);
    int v;
    int sp;
    
    if (b == true) {
      v = voltear(num);
      System.out.println(v);
    }else {
      sp = sgtePrimo(num);
      System.out.println(sp);
    }
 }
}
