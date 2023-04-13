/**Recibe dos números y los multiplica
 *@author Fco Javier Gallego Fernández
 */

public class Multiplicacion { 
  public static void main(String[] args) {
    String linea;
    System.out.print("Por favor, introduce un numero: ");
    linea = System.console().readLine();
    /* Recoge el primer número*/
    int primerNumero;
    primerNumero = Integer.parseInt(linea);
    /* Recoge el segundo número*/
    System.out.print("Introduce otro, por favor: ");
    linea = System.console().readLine();
    int segundoNumero;
    segundoNumero = Integer.parseInt(linea);
    /* Realiza la operación y la muestra en pantalla */
    int total;
    total = primerNumero*segundoNumero;
    System.out.printf("%d * %d = %d", primerNumero, segundoNumero, total);
  }
}
