/**Recibe la longitud y la altura del circulo y muestra por pantalla el area
 *@author Fco Javier Gallego Fernández
 */
 
 public class areaCirculo { 
  public static void main(String[] args) {
    System.out.println ("Area de un rectangulo");
    System.out.println ("---------------------");
    System.out.println ("Por favor, introduzca la longitud de la base (cm): ");
    double base;
    base = Double.parseDouble (System.console().readLine());
    System.out.print( "Introduzca la altura (cm): ");
    double altura;
    altura = Double.parseDouble (System.console().readLine());
    System.out.println ("El area del rectangulo es " + (base * altura) + "cm2");
    
    
    
  }
}
