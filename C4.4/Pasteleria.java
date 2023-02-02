import java.util.Scanner;


/**Pregunta por pantalla el día de la semana, hora y minuto y te muestra por pantalla los minútos que faltan para el fin de semana
 * siendo de lunes a viernes.
 *@author Fco Javier Gallego Fernández
 */
 

public class Pasteleria {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    
    //Declaramos variables
    double precioSabor;
    precioSabor = 0;
    double precioNata;
    precioNata = 0;
    double precioNombre;
    precioNombre = 0;
    String tipoChocolate;
    tipoChocolate = "";
    String sabor;
    double total;
    
    //Damos bienvenida y preguntamos por un tipo de sabor
    System.out.println ("Bienvenidos a la pasteleria");
    System.out.print ("Elija un sabor (manzana, fresa o chocolate): ");
    sabor = s.nextLine();
    //Pasamos a minuscula la respuesta para que no haya confusión
    sabor = sabor.toLowerCase();
    
    //Según el tipo de sabor introducido se establece un precio a la variable
    switch(sabor) {
      case "manzana":
        precioSabor = 18;
        break;
      case "fresa":
        precioSabor = 16;
        break;
      case "chocolate":
      //En caso de ser chocolate preguntamos que tipo quiere si blanco y negro
        System.out.print ("Que tipo de chocolate quiere? (blanco o negro): ");
        tipoChocolate = s.nextLine();
        tipoChocolate = tipoChocolate.toLowerCase();
        //Pasamos a minuscula la respuesta y según la respuesta le establecemos un precio
        if (tipoChocolate.equals("negro")) {
          precioSabor = 14;
        } else if (tipoChocolate.equals("blanco")) {
          precioSabor = 15;
        }
        break;
      default:
        System.out.println ("El sabor introducido no es correcto");
    }
    //Preguntamos si quiere nata y mediante un boolean donde true es si declaramos la variable conNata
    System.out.print ("Quiere nata? (si o no): ");      
    boolean conNata = ((s.next()).toLowerCase()).equals("si");
                    
    //Hacemos el mismo proceso pero para ponerle nombre
    System.out.print ("Quiere ponerle un nombre (si o no): ");
    boolean conNombre = ((s.next()).toLowerCase()).equals("si");
    System.out.println ("___________________________________");
    System.out.print ("Tarta de " + sabor);
    //Mostramos por pantalla el sabor de la tarta y si es de chocolate que muestre si blanco o negro
    if (sabor.equals("chocolate")) {
    System.out.print (" " + tipoChocolate);
    }
    //Mostramos el precio del sabor
    System.out.printf (": %.2f \u20AC\n", precioSabor);
    
    //Mostramos el precio de la nata si lleva
    if (conNata) {
      precioNata = 2.5;
      System.out.printf ("Con nata:                   %.2f \u20AC\n", precioNata);
    }  
    //Mostramos el precio por poner nombre si lo lleva
    if (conNombre) {
      precioNombre = 2.75;
      System.out.printf ("Con nombre:                 %.2f \u20AC\n", precioNombre);
    }
    //Hacemos la suma del precio total y lo mostramos por pantalla
    total = precioSabor + precioNata + precioNombre;
    System.out.println ("___________________________________");
    System.out.printf ("Total:                     %.2f \u20AC\n", total);
    
    
    
  }
}
