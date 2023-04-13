import java.util.Scanner;


/**Pregunta por pantalla un día de la semana y muestra por pantalla la primera asignatura de ese día
 *@author Fco Javier Gallego Fernández
 */
 

public class DiaAsignatura {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    
    String dia;
    
    System.out.println ("Por favor, introduzca un dia de la semana en letra");
    System.out.println ("y muestro la asignatura que tienes a primera hora ese dia: ");
    dia = s.nextLine();
    //Con esta sentencia convertimos las letras de la variable a todas minúsculas
    dia = dia.toLowerCase();
    
    //Con el switch comprobamos la variable dia y según la respuesta muestra una opción
    switch(dia) {
      case "lunes":
        System.out.println ("Fol");
        break;
      case "martes":
        System.out.println ("BBDD");
        break;
      case "miercoles":
        System.out.println ("BBDD");
        break;
      case "jueves":
        System.out.println ("Sistemas");
        break;
      case "viernes":
        System.out.println ("LM");
        break;
      case "sabado":
        System.out.println ("Este dia no hay clase!");
        break;
      case "domingo":
        System.out.println ("Este dia no hay clase!");
        break;
      default:
        dia = "Ese dia no es correcto.";
    }
      
    
    
  }
}
