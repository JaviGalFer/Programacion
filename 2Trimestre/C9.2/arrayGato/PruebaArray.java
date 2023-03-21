import java.util.Scanner;
/**
* Creamos la clase Pingüino extendida de la clase Ave
* @author Fco Javier Gallego Fernández
*/
public class PruebaArray {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        //Define estructura
        GatoSimple[] gatos = new GatoSimple[3];

        //pide los datos de los gatos

        System.out.println("Introduce el nombre de cada gato y su sexo");

        String nombreIntroducido;
        String razaIntroducida;
        int edadIntroducida;

        for (int i = 0; i < 3; i++){
            gatos[i] = new GatoSimple();

            System.out.println("Gato " + (i + 1) + ":");

            System.out.println("Nombre: ");
            nombreIntroducido = s.next();
            s.nextLine();

            System.out.println("raza: ");
            razaIntroducida = s.next();
            s.nextLine();

            System.out.println("Edad: ");
            edadIntroducida = s.nextInt();
            s.nextLine();

            gatos[i] = new GatoSimple(nombreIntroducido, razaIntroducida, edadIntroducida);
        } //for i

        //Mostramos los datos
        System.out.println();
        System.out.println("Los datos son los siguientes: ");

        for (int i = 0; i < 3; i++){
            System.out.println("---------------------------------");
            System.out.println("Gato " + (i + 1));
            System.out.println("Nombre: " + gatos[i].getNombre());
            System.out.println("Raza: " + gatos[i].getRaza());
            System.out.println("Edad: " + gatos[i].getEdad());
            System.out.println("---------------------------------");
        }

    s.close();
    }
}
