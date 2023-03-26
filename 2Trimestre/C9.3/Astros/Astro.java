package Astros;
/**
 * @author Fco Javier Gallego Fernández
 */
public abstract class Astro {
    //Atributos de la clase
    private String nombre;
    private double masa;
    private double diametro;
    private double periodoRotacion;
    private double periodoTraslacion;
    private double distanciaMedia;

    //Constructor
    public Astro(String nombre, double masa, double diametro, double periodoRotacion, double periodoTraslacion, double distanciaMedia) {
        this.nombre = nombre;
        this.masa = masa;
        this.diametro = diametro;
        this.periodoRotacion = periodoRotacion;
        this.periodoTraslacion = periodoTraslacion;
        this.distanciaMedia = distanciaMedia;
    }

    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getPeriodoRotacion() {
        return periodoRotacion;
    }

    public void setPeriodoRotacion(double periodoRotacion) {
        this.periodoRotacion = periodoRotacion;
    }

    public double getPeriodoTraslacion() {
        return periodoTraslacion;
    }

    public void setPeriodoTraslacion(double periodoTraslacion) {
        this.periodoTraslacion = periodoTraslacion;
    }

    public double getDistanciaMedia() {
        return distanciaMedia;
    }

    public void setDistanciaMedia(double distanciaMedia) {
        this.distanciaMedia = distanciaMedia;
    }

    public abstract void mostrarInformacion();
}


