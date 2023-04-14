import java.util.Scanner;
/**
* 
* @author Fco Javier Gallego Fernández
*/
public class PruebaGatos {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        //Define estructura
        GatoSimple[] gatos = new GatoSimple[4];

        gatos[0] = new GatoSimple("Ataulfo", "persa", 1, "macho");
        gatos[1] = new GatoSimple("Loreta", "manx", 2, "hembra");
        gatos[2] = new GatoSimple("Poulo", "mestizo", 3, "macho");
        gatos[3] = new GatoSimple("Neo","siames", 1, "macho");

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

        System.out.println("Varios gatitos se han apareado");

        try{
            GatoSimple nuevoGato = gatos[1].apareaCon(gatos[2]);
            System.out.println(gatos[1].getNombre()+ " y " + gatos[2].getNombre() + " han tenido un gatito " + nuevoGato.getSexo());
        }catch (GatoSimple.ExcepcionApareamientoImposible e){
            System.out.println(gatos[1].getNombre() + " y " + gatos[2].getNombre() + " son del mismo sexo.");
            System.out.println("Dos gatos del mismo sexo no pueden tener gatitos.");
        }

        try{
            GatoSimple nuevoGato = gatos[0].apareaCon(gatos[2]);
            System.out.println(gatos[0].getNombre() + " y " + gatos[2].getNombre() + " han tenido un gatito " + nuevoGato.getSexo());

        }catch (GatoSimple.ExcepcionApareamientoImposible e){
            System.out.println(gatos[0].getNombre() + " y " + gatos[2].getNombre() + " son del mismo sexo.");
            System.out.println("Dos gatos del mismo sexo no pueden tener gatitos.");
        }


    s.close();
    }
}
