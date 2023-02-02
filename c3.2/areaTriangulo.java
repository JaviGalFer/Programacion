/**Recibe la longitud y la altura de un triangulo y calcula y muestra por pantalla el area del triángulo
 *@author Fco Javier Gallego Fernández
 */
 
 public class areaTriangulo { 
  public static void main(String[] args) {
    System.out.println ("Area de un triangulo");
    System.out.println ("--------------------");
    System.out.print ("Por favor, introduzca la longitud de la base (cm): ");
    double base;
    base = Double.parseDouble (System.console().readLine());
    System.out.print ("Introduzca la altura (cm): ");
    double altura;
    altura = Double.parseDouble (System.console().readLine());
    System.out.println ("El area del triangulo es " + (base * altura)/2 + " cm2");
    
    
    
  }
}
