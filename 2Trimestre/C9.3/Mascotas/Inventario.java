import java.util.ArrayList;

public class Inventario {
    private ArrayList<Mascota> animales;

    public Inventario() {
        animales = new ArrayList<Mascota>();
    }

    public void mostrarListaAnimales() {
        for (Mascota mascota : animales) {
            System.out.println(mascota.getClass().getSimpleName() + ": " + mascota.getNombre());
        }
    }

    public void mostrarDatosAnimal(String nombre) {
        for (Mascota mascota : animales) {
            if (mascota.getNombre().equals(nombre)) {
                mascota.muestra();
                return;
            }
        }
        System.out.println("No se encontró el animal " + nombre);
    }

    public void mostrarDatosAnimales() {
        for (Mascota mascota : animales) {
            mascota.muestra();
            System.out.println();
        }
    }

    public void insertarAnimal(Mascota animal) {
        animales.add(animal);
    }

    public void eliminarAnimal(String nombre) {
        for (Mascota mascota : animales) {
            if (mascota.getNombre().equals(nombre)) {
                animales.remove(mascota);
                return;
            }
        }
        System.out.println("No se encontró el animal " + nombre);
    }

    public void vaciarInventario() {
        animales.clear();
    }
}
