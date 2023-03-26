/**
 * @author Fco Javier Gallego Fernández
 */
public abstract class Mascota {
    protected String nombre;
    protected int edad;
    protected boolean estado;
    protected String fechaNacimiento;

    public Mascota(String nombre, int edad, boolean estado, String fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
    }

    //getters
    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public boolean getEstado(){
        return estado;
    }

    public String getFechaNacimiento(){
        return fechaNacimiento;
    }

    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setEstado(boolean estado){
        this.estado = estado;
    }

    public void setFechaNacimiento(String fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Método que muestra la información básica de la mascota.
     */
    public void muestra() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estado: " + estado);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
    }
    public void cumpleanos() {
        edad++;
    }

    public void morir() {
        estado = false;
    }

    public abstract void habla();
}

