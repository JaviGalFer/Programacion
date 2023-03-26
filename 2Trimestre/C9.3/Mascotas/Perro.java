/**
 * @author Fco Javier Gallego Fernández
 */
public class Perro extends Mascota {
    //Atributos de clase
    private String raza;
    private boolean pulgas;

    //Constructor
    public Perro(String nombre, int edad, boolean estado, String fechaNacimiento, String raza, boolean pulgas) {
        super(nombre, edad, estado, fechaNacimiento);
        this.raza = raza;
        this.pulgas = pulgas;
    }

    //Método mostrar
    public void muestra() {
        super.muestra();
        System.out.println("Perro " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Pulgas: " + pulgas);
    }

    //Método habla
    public void habla() {
        System.out.println("Guau!");
    }
}
