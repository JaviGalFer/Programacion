/**Recibe una respuesta almacenadola en una variable, la convierte a int y según el intervalo introducido muestra un mensaje diferente
 *@author Fco Javier Gallego Fernández
 */
 
 public class Horas { 
  public static void main(String[] args) {
	System.out.println ("¿Que hora es?");
  System.out.print ("Introduce una hora en formato 24h (0 - 23): ");
	String hora = System.console().readLine();
  int n = Integer.parseInt( hora );
	
	if ((n < 0) || (n >= 24)) {
	  System.out.println ("El numero introducido debe estar en el intervalo 1 - 100.");
    hora = System.console().readLine();
    n = Integer.parseInt ( hora );
	}
  if ((n >=6) && (n <= 12)) {
    System.out.println ("Buenos dias");
  }
  if ((n >=13) && (n <= 20)) {
    System.out.println ("Buenas tardes"); 
  }
  if (((n >= 21) && (n < 24)) || ((n <= 5) && (n >=0))) {
    System.out.println ("Buenas noches");
  }
  }
}

