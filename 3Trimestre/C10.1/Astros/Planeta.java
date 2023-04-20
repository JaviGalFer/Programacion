package Astros;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Fco Javier Gallego Fernández
 */
public class Planeta extends Astro {
    //ArrayList de satélites
    private ArrayList<Satelite> satelites;
    
    //Constructor
    public Planeta(String nombre, double masa, double diametro, double periodoRotacion, double periodoTraslacion, double distanciaMedia) {
        super(nombre, masa, diametro, periodoRotacion, periodoTraslacion, distanciaMedia);
        this.satelites = new ArrayList<>();
    }
    //Getter de satélite
    public ArrayList<Satelite> getSatelites() {
        return satelites;
    }

    //Setter del array de satélites
    public void setSatelites(List<Satelite> satelites) {
        this.satelites = satelites;
    }
    //Método añadir satélite
    public void agregarSatelite(Satelite satelite) {
        this.satelites.add(satelite);
    }
    //Método eliminar satélite
    public void eliminarSatelite(Satelite satelite) {
        this.satelites.remove(satelite);
    }

    //Método ToString
    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Masa: " + getMasa() + " kg");
        System.out.println("Diámetro: " + getDiametro() + " km");
        System.out.println("Periodo de rotación: " + getPeriodoRotacion() + " días");
        System.out.println("Periodo de traslación: " + getPeriodoTraslacion() + " días");
        System.out.println("Distancia media: " + getDistanciaMedia() + " km");
        System.out.println("Satélites:");
        for (Satelite satelite : satelites) {
            satelite.mostrarInformacion();
        }
    }
}
