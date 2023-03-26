/**
 * @author Fco Javier Gallego Fernández
 */
public class Gato extends Mascota {
    //Atributo de clase
    private String color;
    private boolean peloLargo;

    //Método constructor
    public Gato(String nombre, int edad, boolean estado, String fechaNacimiento, String color, boolean peloLargo) {
        super(nombre, edad, estado, fechaNacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
    }

    // Setters
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setPeloLargo(boolean peloLargo) {
        this.peloLargo = peloLargo;
    }

    public String getColor(){
        return color;
    }

    public boolean getPeloLargo(){
        return peloLargo;
    }


    //Método muestra
    public void muestra() {
        super.muestra();
        System.out.println("Gato " + nombre);
        System.out.println("Color: " + color);
        System.out.println("peloLargo: " + peloLargo);
    }

    //Método habla
    public void habla() {
        System.out.println("Miau!");
    }
}

