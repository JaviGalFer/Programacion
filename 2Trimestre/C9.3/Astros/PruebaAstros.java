package Astros;
import java.util.Scanner;

public class PruebaAstros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Crear algunos planetas y satélites
        Planeta tierra = new Planeta("Tierra", 5.97E24, 12756, 1, 365.25, 149.6E6);
        Planeta marte = new Planeta("Marte", 6.39E23, 6792, 1.03, 687, 227.9E6);
        Satelite luna = new Satelite("Luna", 7.34E22, 3474, 27.32, 27.32, 384400, tierra);
        Satelite fobos = new Satelite("Fobos", 1.07E16, 22, 0.32, 0.32, 9378, marte);
        Satelite deimos = new Satelite("Deimos", 1.8E15, 12, 1.26, 1.26, 23459, marte);
        
        // Agregar satélites a los planetas
        tierra.agregarSatelite(luna);
        marte.agregarSatelite(fobos);
        marte.agregarSatelite(deimos);
        
        // Imprimir información de un astro seleccionado por el usuario
        System.out.println("Ingrese el nombre del astro (Tierra, Luna, Marte, Fobos, Deimos):");
        String nombreAstro = sc.nextLine();
        switch (nombreAstro) {
            case "Tierra":
                tierra.mostrarInformacion();
                break;
            case "Luna":
                luna.mostrarInformacion();
                break;
            case "Marte":
                marte.mostrarInformacion();
                break;
            case "Fobos":
                fobos.mostrarInformacion();
                break;
            case "Deimos":
                deimos.mostrarInformacion();
                break;
            default:
                System.out.println("Astro no encontrado.");
        }

        // Imprimir información de todos los astros
        System.out.println("\nInformación de todos los astros:");
        tierra.mostrarInformacion();
        System.out.println();
        luna.mostrarInformacion();
        System.out.println();
        marte.mostrarInformacion();
        System.out.println();
        fobos.mostrarInformacion();
        System.out.println();
        deimos.mostrarInformacion();
    }

}
