/**
 * @author Fco Javier Gallego Fernández
 */
public class Canario extends Ave {
    //Atributos de clase
    private String color;
    private boolean canta;

    //Constructor
    public Canario(String nombre, int edad, boolean estado, String fechaNacimiento, double pico, boolean vuela, String color, boolean canta) {
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.color = color;
        this.canta = canta;
    }

    //Getters y setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCanta(boolean canta) {
        this.canta = canta;
    }
    
    //Devuelve mensaje si canta
    public boolean isCanta() {
        return canta;
    }

    //Override de Ave
    @Override
    public void muestra() {
        System.out.println("Soy un canario llamado " + this.nombre + " y tengo " + this.edad + " años.");
    }

    @Override
    public void habla() {
        if (this.canta) {
            System.out.println(this.nombre + " canta muy bien.");
        } else {
            System.out.println(this.nombre + " no canta mucho.");
        }
    }

    @Override
    public void volar() {
        System.out.println(this.nombre + " está volando.");
    }
}

