/**Recibe una respuesta almacenadola en una variable y después mediante el if compara si la variable es igual a la respuesta correcta
 *@author Fco Javier Gallego Fernández
 */
 
 public class Sentencia1 { 
  public static void main(String[] args) {
	System.out.print ("¿Cual es el idioma oficial de Senegal? ");
	String respuesta = System.console().readLine();
	
	if (respuesta.equals ("Frances")) {
	  System.out.println ("¡La respuesta es correcta!");
	} else {
	  System.out.println ("Lo siento, la respuesta es incorrecta.");
	}
  }
}

