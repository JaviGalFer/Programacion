import java.util.Scanner;

/**
* Este programa muestra 50 números aleatorios entre 100 y 199 ambos incluidos
* Muestra el minimo, el máximo y la media de los 50.
* @author Fco Javier Gallego Fernández
*/

public class AdivinaNumAleatorio {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int oportunidades = 5;
    int numeroIntroducido;
    boolean acertado = false;
    int numeroAdivinar = (int)(Math.random() * 101);
    
    System.out.println ("Estoy pensando un numero del 0 al 100, intenta adivinarlo.");
    System.out.println ("Tienes 5 oportunidades");
    
    do {
      System.out.print("Introduce un numero: ");
      numeroIntroducido = s.nextInt();
      oportunidades--;
      
      if ( (numeroIntroducido > numeroAdivinar) && (oportunidades > 0) ){
        System.out.println ("El numero que estoy pensando es menor que " + numeroIntroducido);
        System.out.println ("Te quedan " + oportunidades + " oportunidades.");
      }
      
      if ( (numeroIntroducido < numeroAdivinar) && (oportunidades >0) ){
        System.out.println ("El numero que estoy pensando es mayor que " + numeroIntroducido);
        System.out.println ("Te quedan " + oportunidades + " oportunidades.");
      }
      
      if (numeroIntroducido == numeroAdivinar) {
        acertado = true;
        System.out.println("Enhorabuena! Has aceretado!");
      }
    } while (!acertado && (oportunidades > 0));
    
    if (!acertado) {
      System.out.println ("Lo siento, no has acertado.");
      System.out.println ("El numero que estaba pensando era el " + numeroAdivinar);
    }
 }
}
