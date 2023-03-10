/**
* Clase Pizza con los diferentes métodos y atributos de la instancia
* @author Fco Javier Gallego Fernández
*/
public class Pizza {
    
    private static int totalPizzas = 0;         //Atributos de clase
    private static int totalServidos = 0;
    
    private String tam;
    private String tipo;                       //Atributos de Instancia
    private String estado;
    
    public Pizza(String tipo, String tam) {   //Creamos el método constructor
        this.tipo = tipo;                       
        this.tam = tam;
        this.estado = "pedida";
        Pizza.totalPizzas++;
    }
    public String toString() {
        return "pizza " + this.tipo + " " + this.tam + ", " + this.estado;
    }
    
    public static int getTotalPizzas() {
        return Pizza.totalPizzas;
    }                                       //Establecemos los getters
    
    public static int getTotalServidos() {
        return Pizza.totalServidos;
    }

    /**
     * Cambia el estado de la pizza de pedido a servido
     * Si ya se ha servido se muestra un mensaje diciendo que ya ha sido sevrido
     */
    public void sirve() {
        if (this.estado.equals("pedida")) {
        this.estado = "servida";
        Pizza.totalServidos++;
        } else {
        System.out.println("esta pizza ya se ha servido");
        }
    }
}
