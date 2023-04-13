import java.util.Scanner;

/**
* Este programa genera el juego de piedra papel tijera
* @author Fco Javier Gallego Fernández
*/

public class PiedraPapelTijera {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Se inicializa variables
    int ganador = 2;
    String jugador;
    String pc = "";
    int aux;
    //Se pregunta la jugada
    System.out.print ("Es tu turno, introduce piedra, papel o tijera: ");
    jugador = s.nextLine();
    //Se genera la jugada del ordenador
    aux = (int)(Math.random() * 3);
    
    switch (aux) {
      case 0:
        pc = "piedra";
        break;
      case 1:
        pc = "papel";
        break;
      case 2:
        pc = "tijera";
        break;
      default:
    }
    //Se muestra por pantalla la jugada
    System.out.println ("Es el turno del ordenador: " + pc);
    //Dependiendo de las jugadas se dice si gana, empata o gana el ordenador
    if (jugador.equals(pc)) {
      System.out.println ("Empate");
    }else {
      switch (jugador) {
        case "piedra":
          if (pc.equals("tijera")) {
            ganador = 1;
          }
          break;
        case "papel":
          if (pc.equals("piedra")) {
            ganador = 1;
          }
          break;
        case "tijera":
          if (pc.equals("papel")) {
            ganador = 1;
          }
          break;
        default:
      }
      
      if (ganador == 1) {
        System.out.println ("Gana el jugador");
      }else {
        System.out.println ("Gana el ordenador");
      }
    }
 }
}
