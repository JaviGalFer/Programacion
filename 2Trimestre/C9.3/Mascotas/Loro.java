/**
 * @author Fco Javier Gallego Fernández
 */
public class Loro extends Ave {
    //Atributos de clase
    private String origen;
    private boolean habla;

    //Constructor
    public Loro(String nombre, int edad, boolean estado, String fechaNacimiento, double pico, boolean vuela, String origen, boolean habla) {
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.origen = origen;
        this.habla = habla;
    }

    // getters y setters
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public boolean getHabla(boolean habla) {
        return habla;
    }

    public void setHabla(Boolean habla) {
        this.habla = habla;
    }

    //Método muestra
    public void muestra() {
        System.out.println("Soy un Loro, me llamo " + this.nombre + " y tengo " + this.edad + " años.");
    }

    //Método saluda
    public void saluda() {
        if (habla) {
            System.out.println("Hola! ¿Cómo estás?");
        } else {
            System.out.println("...");
        }
    }

    //Método volar
    public void volar() {
        System.out.println("Volando como un loro");
    }

    //Método hablar
    public void habla() {
        if (habla) {
            System.out.println("Poli quiere una galleta");
        } else {
            System.out.println("...");
        }
    }
}
