package Astros;
/**
 * @author Fco Javier Gallego Fernández
 */
public class Satelite extends Astro {
    // Planeta alrededor del cual orbita el satélite    
    private Planeta planetaOrbita;

    //Constructor
    public Satelite(String nombre, double masa, double diametro, double periodoRotacion, double periodoTraslacion, double distanciaMedia, Planeta planetaOrbita) {
        super(nombre, masa, diametro, periodoRotacion, periodoTraslacion, distanciaMedia);
        this.planetaOrbita = planetaOrbita;
    }

    //Getter
    public Planeta getPlanetaOrbita() {
        return planetaOrbita;
    }

    //Setter
    public void setPlanetaOrbita(Planeta planetaOrbita) {
        this.planetaOrbita = planetaOrbita;
    }

    //ToString
    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Masa: " + getMasa() + " kg");
        System.out.println("Diámetro: " + getDiametro() + " km");
        System.out.println("Periodo de rotación: " + getPeriodoRotacion() + " días");
        System.out.println("Periodo de traslación: " + getPeriodoTraslacion() + " días");
        System.out.println("Distancia media: " + getDistanciaMedia() + " km");
        System.out.println("Planeta que orbita: " + planetaOrbita.getNombre());
    }
}
