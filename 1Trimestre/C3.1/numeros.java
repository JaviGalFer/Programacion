/**Recibe numeros y los muestra por pantalla
 *@author Fco Javier Gallego Fernández
 */

 public class numeros {
   public static void main(String[] args) {
     String linea;
	 System.out.print("Por favor, introduce un numero: ");
	 linea = System.console().readLine();
	 int primerNumero;
	 primerNumero = Integer.parseInt( linea );
	 System.out.print("introduce otro, por favor: ");
	 linea = System.console().readLine();
	 int segundoNumero;
	 segundoNumero = Integer.parseInt( linea );
	 int total;
	 total = (2 * primerNumero) + segundoNumero;
	 System.out.print("El primer numero introducido es " + primerNumero);
	 System.out.println(" y el segundo es " + segundoNumero);
	 System.out.print("El doble del primer numero más el segundo es ");
	 System.out.print(total);
   }
}
