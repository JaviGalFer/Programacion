import java.util.Scanner;


/**Este programa realiza el juego de piedra, papel o tijera y muestra por pantalla el ganador
 *@author Fco Javier Gallego Fernández
 */
 

public class PiedraPapelTijeras {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    //Se declaran variables
    String jugada1;
    String jugada2;
    int ganador;
    ganador = 2;
    //Se da la bienvenida al juego y se pregunta la jugada de ambos jugadores
    System.out.println ("Bienvenido al juego Piedra, papel, tijera");
    System.out.println ("______________________________________________________");
    System.out.print ("Turno del jugador 1 (Introduce piedra, papel o tijera): ");
    jugada1 = s.nextLine();
    jugada1 = jugada1.toLowerCase();
    
    System.out.print ("Turno del jugador 2 (Introduce piedra, papel o tijera); ");
    jugada2 = s.nextLine();
    jugada2 = jugada2.toLowerCase();
    
    //Mediante el if comprobamos si hay empate
    if (jugada1.equals(jugada2)) {
      System.out.println ("Empate");
    } else {
      /* En caso de no haber empate mediante el switch hacemos las jugadas donde el jugador 1 puede ganar
       * declarando la variable ganador en 1. En caso de que no se de ese caso, ganaría el jugador 2
       * y la variable ganador esta previamente establecida en 2 
       * */
      switch(jugada1) {
        case "piedra":
          if (jugada2.equals("tijera")) {
            ganador = 1;
          }
          break;
        case "papel":
          if (jugada2.equals("piedra")) {
            ganador = 1;
          }
          break;
        case "tijera":
          if (jugada2.equals("papel")) {
            ganador = 1;
          }
          break;
        default:
          System.out.println ("Valor introducido no valido");
      }
      //Mostramos por pantalla el ganador
      System.out.println ("______________________________________________________");
      System.out.println ("Gana el jugador " + ganador);
    }
    
  }
}
