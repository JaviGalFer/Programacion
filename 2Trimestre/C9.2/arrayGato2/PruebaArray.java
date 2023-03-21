import java.util.Scanner;
/**
* Creamos la clase Pingüino extendida de la clase Ave
* @author Fco Javier Gallego Fernández
*/
public class PruebaArray {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        //Define estructura
        GatoSimple[] gatos = new GatoSimple[4];

        gatos[0] = new GatoSimple("Ataulfo", "persa", 1);
        gatos[1] = new GatoSimple("Loreta", "manx", 2);
        gatos[2] = new GatoSimple("Poulo", "mestizo", 3);
        gatos[3] = new GatoSimple("Neo","siames", 1);

        //Mostramos los datos
        System.out.println();
        System.out.println("Los datos son los siguientes: ");

        for (int i = 0; i < 4; i++){
            System.out.println("---------------------------------");
            System.out.println("Gato " + (i + 1));
            System.out.println("Nombre: " + gatos[i].getNombre());
            System.out.println("Raza: " + gatos[i].getRaza());
            System.out.println("Edad: " + gatos[i].getEdad());
            System.out.println("---------------------------------");
        }

        gatos[0].come(3);
        gatos[1].come(1);
        gatos[2].come(5);
        gatos[3].come(1);
        gatos[3].come(1);

    s.close();
    }
}
