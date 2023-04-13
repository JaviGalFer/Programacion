import java.util.Scanner;

/**
* Este programa genera el juego del Craps
* @author Fco Javier Gallego Fernández
*/

public class JuegoCraps {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Se inicializa variables
    int apuesta;
    boolean finJuego = false;
    int dado1;
    int dado2;
    int sum;
    //Se pregunta la apuesta
    System.out.print ("¿Cuánto quiere apostar? ");
    apuesta = s.nextInt();
    //Se generan los dados y la suma
    dado1 = (int)(Math.random() * 6 + 1);
    dado2 = (int)(Math.random() * 6 + 1);
    sum = dado1 + dado2;
    //Se muestra por pantalla
    System.out.println("Dado 1: " +dado1);
    System.out.println("Dado 2: " +dado2);
    System.out.println("Suma  : " +sum);
    //Dependiendo del resultado se muestra una respuesta
    switch (sum) {
      case 7:
      case 11:
        System.out.println("Vaya, has ganado " + apuesta + " €!");
        System.out.println("¡Ahora tienes " + apuesta * 2 + "€! Sigue apostando pa perderlo");
        break;
      case 2:
      case 3:
      case 12:
        System.out.println("Uy que pena eh, has perdido todo tu dinero");
        break;
      //Si no se da ninguno de los casos anteriores el juego sigue
      default:
        System.out.print("Sigue tirando, tienes que conseguir el ");
        System.out.println(sum + " para ganar.");
        System.out.println("Si obtienes un 7, perderás como siempre.");
        System.out.println("Pulsa INTRO para tirar dados y seguir perdiendo.");
        s.nextLine();
        //Se vuelve a generar el juego mientras el boolean "finJuego" sea false
        do {
          dado1 = (int) (Math.random() * 6 + 1);
          dado2 = (int) (Math.random() * 6 + 1);

          System.out.println("Dado 1: " + dado1);
          System.out.println("Dado 2: " + dado2);
          System.out.println("Suma: " + (dado1 + dado2));

          if ((dado1 + dado2) == sum) {
            System.out.println("Vaya, has ganado " + apuesta + " €");
            System.out.println("Ahora tienes " + apuesta * 2 + " €, vuelve a apostar para perderlos");
            finJuego = true;
          } else if ((dado1 + dado2) == 7) {
            System.out.println("Uy que pena eh, has perdido todo tu dinero");
            finJuego = true;
          } else {
            System.out.println("Sigue jugando");
            System.out.println("Pulse INTRO para tirar dados y seguir perdiendo.");
            s.nextLine();
          }
        } while (!finJuego);
      }
    
 }
}
