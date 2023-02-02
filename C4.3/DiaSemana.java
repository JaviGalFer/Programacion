import java.util.Scanner;


/**Pide introducir número por pantalla y según el número te dice un día de la semana correspondiente
 *@author Fco Javier Gallego Fernández
 */
 

public class DiaSemana {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    
    String dia;
    //Se declaran variables y se pide el número
    System.out.print ("Por favor, introduzca un numero del 1 al 7: ");
    int n = s.nextInt();
    
    //Se introduce el switch para el menu y comprobación del dato y muestra de este.
    switch(n) {
      case 1:
        dia = "lunes";
        break;
      case 2:
        dia = "martes";
        break;
      case 3:
        dia = "miercoles";
        break;
      case 4:
        dia = "jueves";
        break;
      case 5:
        dia = "viernes";
        break;
      case 6:
        dia = "sabado";
        break;
      case 7:
        dia = "domingo";
        break;
      default:
        dia = "Debe introducir un numero del 1 al 7";
    }
      
    System.out.println (dia);
    
    
    
    
  }
}
