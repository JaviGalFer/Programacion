/**Recibe el precio sin iva de un articulo para caulcular la base imponible
 *@author Fco Javier Gallego Fernández
 */
 
 public class baseImponible { 
  public static void main(String[] args) {
    System.out.print ("Por favor, introduzca la base imponible (Precio del articulo sin IVA): ");
    double baseImponible;
    baseImponible = Double.parseDouble (System.console().readLine());
    
    System.out.printf ("\nBase imponible %8.2f \u20ac\n", baseImponible);
    System.out.printf ("Iva (21%%)        %8.2f \u20ac\n", (baseImponible * 0.21));
    System.out.printf ("----------------------------\n");
    System.out.printf ("Total             %8.2f \u20ac\n", (baseImponible * 1.21));
    
    
    
  }
}
