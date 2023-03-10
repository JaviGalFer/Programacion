/**
* Clase main de la Pizza haciendo llamadas y creando instancias
* @author Fco Javier Gallego Fernández
*/
public class PedidosPizza {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("margarita", "mediana");   //Creamos los objetos
        Pizza p2 = new Pizza("funghi", "familiar");
        p2.sirve();                                              //Cambiamos el estado del objeto
        Pizza p3 = new Pizza("cuatro quesos", "mediana");   //Creamos otro objeto
        System.out.println(p1);
        System.out.println(p2);                                       //Llamamos a cada uno
        System.out.println(p3);
        p2.sirve();
        System.out.println("pedidas: " + Pizza.getTotalPizzas());           //Llamamos a los métodos
        System.out.println("servidas: " + Pizza.getTotalServidos());
    }
}
