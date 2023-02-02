/**Muestra por pantalla mi apellido. Se declara variables letra a letra y después una variable concatenando las anteriores para juntar las letras
 *@author Fco Javier Gallego Fernández
 */
 

public class PruebaEjercicio2 {
  public static void main(String[] args) {
    //Se declaran las variables para concatenar
    String G = "G";
    String a = "a";
    String l = "l";
    String e = "e";
    String g = "g";
    String o = "o";
    //Se declara la variable apellido,concatenando las anteriores
    String apellido = ( G + a + l + l + e + g + o ); 
    
    //Muestra por pantalla el siguiente mensaje con la variable apellido
    System.out.println ("Mi apellido es: " +apellido);
    System.out.println (apellido);
    
    
    
  }
}
