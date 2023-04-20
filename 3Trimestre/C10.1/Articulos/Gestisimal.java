import java.util.Scanner;
import java.util.ArrayList;
/**
 * @Author Fco Javier Gallego Fernández
 */
public class Gestisimal {
    Scanner scanner = new Scanner(System.in);
    //ATRIBUTOS PARA LA CLASE
    private static final int MAX_ARTICULOS = 100;
    private ArrayList<Articulo> articulos = new ArrayList<>();
    private int numArticulos = 0;
    
    //MÉTODO AGREGARARTÍCULO
    public void agregarArticulo(Articulo nuevoArticulo) {
        if (numArticulos < MAX_ARTICULOS) {
            articulos.add(nuevoArticulo);
            numArticulos++;
            System.out.println("Artículo añadido correctamente.");
        } else {
            System.out.println("No se pueden añadir más artículos.");
        }
        System.out.println("==========================================================================================");
    }
    
    //MÉTODO ALTA ARTÍCULO
    public void altaArticulo() {
        System.out.println("=============================");
        System.out.println("Dar de alta nuevo artículo");
        System.out.println("=============================");
        System.out.println("Introduzca el código del artículo:");
        String codigo = scanner.nextLine();
        
        System.out.println("Introduzca la descripción del artículo:");
        String descripcion = scanner.nextLine();
        
        System.out.println("Introduzca el precio de compra:");
        double precioCompra = scanner.nextDouble();
        
        System.out.println("Introduzca el precio de venta:");
        double precioVenta = scanner.nextDouble();
        
        System.out.println("Introduzca el stock inicial:");
        int stock = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea
        
        Articulo nuevoArticulo = new Articulo(codigo, descripcion, precioCompra, precioVenta, stock);
        agregarArticulo(nuevoArticulo);
        System.out.println("==========================================================================================");
    }
    
    //MÉTODO BAJA ARTÍCULO
    public void baja(String codigo) {
        System.out.println("=============================");
        System.out.println("Dar de baja un artículo");
        System.out.println("=============================");
        int i = buscarArticulo(codigo);
        if (i >= 0) {
            articulos.remove(i);
            numArticulos--;
            System.out.println("Artículo eliminado correctamente.");
        } else {
            System.out.println("El artículo no existe.");
        }
        System.out.println("==========================================================================================");
    }
    
    //MÉTODO MODIFICACIÓN ARTÍCULO
    public void modificacion(String codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
        System.out.println("=============================");
        System.out.println("Modificación de un artículo");
        System.out.println("=============================");
        int i = buscarArticulo(codigo);
        if (i >= 0) {
            Articulo articulo = articulos.get(i);
            articulo.setDescripcion(descripcion);
            articulo.setPrecioCompra(precioCompra);
            articulo.setPrecioVenta(precioVenta);
            articulo.setStock(stock);
            System.out.println("Artículo modificado correctamente.");
        } else {
            System.out.println("El artículo no existe.");
        }
        System.out.println("==========================================================================================");
    }
    

    //MÉTODO ENTRADA MERCANCIA
    public void entradaMercancia(String codigo, int cantidad) {
        System.out.println("=============================");
        System.out.println("Entrada de mercancía");
        System.out.println("=============================");
        int i = buscarArticulo(codigo);
        if (i >= 0) {
            Articulo articulo = articulos.get(i);
            articulo.incrementarStock(cantidad);
            System.out.println("Entrada de mercancía registrada.");
        } else {
            System.out.println("El artículo no existe.");
        }
        System.out.println("==========================================================================================");
    }
    
    //MÉTODO SALIDA MERCANCIA
    public void salidaMercancia(String codigo, int cantidad) {
        System.out.println("=============================");
        System.out.println("Salida de mercancía");
        System.out.println("=============================");
        int i = buscarArticulo(codigo);
        if (i >= 0) {
            if (articulos.get(i).getStock() >= cantidad) {
                articulos.get(i).decrementarStock(cantidad);
                System.out.println("Salida de mercancía registrada.");
            } else {
                System.out.println("No hay suficiente stock disponible.");
            }
        } else {
            System.out.println("El artículo no existe.");
        }
        System.out.println("==========================================================================================");
    }
    
    //MÉTODO LISTAR ARTÍCULOS
    public void listar() {
        System.out.println("==========================================================================================");
        for (Articulo articulo : articulos) {
            System.out.println(articulos);
        }
        System.out.println("==========================================================================================");
    }
    
    //MÉTODOS BUSCAR ARTÍCULO
    private int buscarArticulo(String codigo) {
        System.out.println("Buscando artículo con código: " + codigo);
        System.out.println("Lista de artículos:");
        for (Articulo articulo : articulos) {
            System.out.println(articulos);
        }
        for (int i = 0; i < numArticulos; i++) {
            if (articulos.get(i).getCodigo().equals(codigo)) {
                return i;
            }
        }
        System.out.println("==========================================================================================");
        return -1;
    }

    
}
