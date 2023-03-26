/**
 * @author Fco Javier Gallego Fernández
 */
public abstract class Ave extends Mascota {
    //Atributos de clase
    protected double pico;
    protected boolean vuela;

    //Constructor
    public Ave(String nombre, int edad, boolean estado, String fechaNacimiento, double pico, boolean vuela) {
        super(nombre, edad, estado, fechaNacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }

     // getters y setters
    public double gePico() {
        return pico;
    }

    public void setPico(double pico) {
        this.pico = pico;
    }

    //Método para volar
    public void volar() {
        System.out.println("Soy " + this.nombre + " y estoy volando.");
    }

    // getters y setters
    public boolean getVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }
}

