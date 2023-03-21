/**
 * @Author Fco Javier Gallego Fernández
 */
public class Articulo {
    //Atributos necesarios
    private String codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;

    //Método constructor
    public Articulo(String codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }
    //GETTERS
    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public int getStock() {
        return stock;
    }
    //SETTERS
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public void incrementarStock(int cantidad) {
        stock += cantidad;
    }

    public void decrementarStock(int cantidad) {
        if (stock - cantidad >= 0) {
            stock -= cantidad;
        } else {
            System.out.println("No hay suficiente stock disponible.");
        }
    }
    //MÉTODO TOSTRING
    @Override
    public String toString() {
        return "Articulo{" +
                "codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precioCompra=" + precioCompra +
                ", precioVenta=" + precioVenta +
                ", stock=" + stock +
                '}';
    }
}

